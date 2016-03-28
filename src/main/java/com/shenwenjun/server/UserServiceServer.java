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
            //������ʽ�ģ����TFramedTransportʹ��
            TNonblockingServerTransport serverTransport = new TNonblockingServerSocket(servicePort);
            //������������Service�����ʵ��
            TProcessor processor = new UserService.Processor<UserService.Iface>(new UserServiceImpl());
            //�̳���TNonblockingServer����ͬʱ�ṩ��������ʽͬ����TFramedTransport�����첽��TNonblockingTransport���ķ���
            THsHaServer.Args args = new THsHaServer.Args(serverTransport);
            args.processor(processor);
            //����Э�鹤������Ч�ʵġ��ܼ��Ķ����Ʊ����ʽ�������ݴ���Э��
            args.protocolFactory(new TCompactProtocol.Factory());
            //���ô��乤����ʹ�÷�������ʽ������Ĵ�С���д��䣬������Java�е�NIO
            args.transportFactory(new TFramedTransport.Factory());
            //���ô�����������ֻ����һ������ʵ��
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
