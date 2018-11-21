package com.rsspring;


import com.rsspring.enity.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;

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
        WebClient.create("http://localhost:8080/03_jaxrs_spring_server/ws/userService/userService/user")
                .type(MediaType.APPLICATION_JSON)
                .put(user);
        System.out.println(user);
    }

    @Test
    public void testGet(){
        String response = WebClient.create("http://localhost:8080/03_jaxrs_spring_server/ws/userService/userService/user")
                .type(MediaType.APPLICATION_JSON)
                .accept("application/json")
                .get(String.class);

        System.out.println(response);
    }
}
