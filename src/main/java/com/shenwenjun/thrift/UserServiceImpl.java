package com.shenwenjun.thrift;

import org.apache.thrift.TException;

/**
 * Created by chenbo on 2016/3/27.
 */
public class UserServiceImpl implements UserService.Iface {
    public String whatIsName(String word) throws TException {
        String name = "what talking about?";
        if (!word.isEmpty()) {
            name = "my name is mangocool!";
        }
        System.out.println("接收的参数word: " + word);
        return name;
    }

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
