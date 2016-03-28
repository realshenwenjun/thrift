package com.shenwenjun.server;

import com.shenwenjun.thrift.UserService;
import com.shenwenjun.thrift.UserServiceImpl;
import org.apache.thrift.TProcessor;
import org.apache.thrift.TProcessorFactory;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.THsHaServer;
import org.apache.thrift.server.TNonblockingServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TNonblockingServerTransport;
import org.apache.thrift.transport.TTransportException;

/**
 * Created by chenbo on 2016/3/27.
 */
public class UserServiceServer {
    private int servicePort = 7911;

    public void invoke() {
        try {
            //非阻塞式的，配合TFramedTransport使用
            TNonblockingServerTransport serverTransport = new TNonblockingServerSocket(servicePort);
            //关联处理器与Service服务的实现
            TProcessor processor = new UserService.Processor<UserService.Iface>(new UserServiceImpl());
            //继承了TNonblockingServer，可同时提供非阻塞方式同步（TFramedTransport）和异步（TNonblockingTransport）的服务
            THsHaServer.Args args = new THsHaServer.Args(serverTransport);
            args.processor(processor);
            //设置协议工厂，高效率的、密集的二进制编码格式进行数据传输协议
            args.protocolFactory(new TCompactProtocol.Factory());
            //设置传输工厂，使用非阻塞方式，按块的大小进行传输，类似于Java中的NIO
            args.transportFactory(new TFramedTransport.Factory());
            //设置处理器工厂，只返回一个单例实例
            args.processorFactory(new TProcessorFactory(processor));
            TServer server = new TNonblockingServer(args);
            System.out.println("Starting server on port " + servicePort + "......");
            server.serve();
        } catch (TTransportException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        UserServiceServer uss = new UserServiceServer();
        uss.invoke();
    }
}
