package com.reservice;

import com.reservice.enity.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * 测试webservice发布的接口测试
 */
public class Client {

    @Test
    public void testput(){
        User user = new User();
        user.setId(1);
        user.setUsername("张三");
        user.setCity("湖北");
        WebClient.create("http://localhost:8001/ws/userService/user")
                .type(MediaType.APPLICATION_JSON)
                .put(user);
        System.out.println(user);
    }

    @Test
    public void testGet(){
        String response = WebClient.create("http://localhost:8001/ws/userService/user")
                .type(MediaType.APPLICATION_JSON)
                .accept("application/json")
                .get(String.class);

        System.out.println(response);
    }
}
