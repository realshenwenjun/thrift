package com.shenwenjun.client;

import com.shenwenjun.thrift.UserService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransportException;

/**
 * Created by chenbo on 2016/3/27.
 */
public class UserServiceClient2 {
    public void start() {
        String compAddress = "localhost";
        int port = 7911;
        int timeout = 100 * 1000;
        //使用非阻塞方式，按块的大小进行传输，类似于Java中的NIO
        TFramedTransport transport =
                new TFramedTransport(new TSocket(compAddress, port, timeout));
        //高效率的、密集的二进制编码格式进行数据传输协议
        TProtocol protocol = new TCompactProtocol(transport);
        UserService.Client client = new UserService.Client(protocol);
        try {
            open(transport);
            System.out.println(client.whatIsName("hello"));
            close(transport);
        } catch (TException e) {
            e.printStackTrace();
        }
    }

    public void open(TFramedTransport transport) {
        if (transport != null && !transport.isOpen()) {
            try {
                transport.open();
            } catch (TTransportException e) {
                e.printStackTrace();
            }
        }
    }

    public void close(TFramedTransport transport) {
        if (transport != null && transport.isOpen()) {
            transport.close();
        }
    }

    public static void main(String[] args) {
        UserServiceClient2 usc = new UserServiceClient2();
        usc.start();
    }
}
