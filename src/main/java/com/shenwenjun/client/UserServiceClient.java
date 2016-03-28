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
public class UserServiceClient {
    public void start() {
        String compAddress = "localhost";
        int port = 7911;
        int timeout = 100 * 1000;
        //ʹ�÷�������ʽ������Ĵ�С���д��䣬������Java�е�NIO
        TFramedTransport transport =
                new TFramedTransport(new TSocket(compAddress, port, timeout));
        //��Ч�ʵġ��ܼ��Ķ����Ʊ����ʽ�������ݴ���Э��
        TProtocol protocol = new TCompactProtocol(transport);
        UserService.Client client = new UserService.Client(protocol);
        try {
            open(transport);
            System.out.println(client.whatIsName(""));
            System.out.println(client.whatIsName("hello!"));
            System.out.println(client.userInfo(""));
            System.out.println(client.userInfo("1023"));
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
        UserServiceClient usc = new UserServiceClient();
        usc.start();
    }
}
