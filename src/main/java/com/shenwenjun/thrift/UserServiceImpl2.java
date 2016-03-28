package com.shenwenjun.thrift;

import org.apache.thrift.TException;

/**
 * Created by chenbo on 2016/3/27.
 */
public class UserServiceImpl2 implements UserService.Iface {
    @Override
    public String whatIsName(String word) throws TException {
        String name = "what talking about?";
        System.out.println("what your name?");
        if (!word.isEmpty()) {
            try {
                for (int i = 0; i < 30; i++) {
                    System.out.println("wo..." + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            name = "my name is mangocool!";
        }
        System.out.println("接收的参数word: " + word);
        return name;
    }

    @Override
    public User userInfo(String id) throws TException {
        User user = new User();
        if (!id.isEmpty() && id.equals("1023")) {
            user.setId("1023");
            user.setName("mangocool");
            user.setSex(1);
        } else {
            user.setName("no user!");
        }
        System.out.println("接收的参数id: " + id);
        return user;
    }
}
