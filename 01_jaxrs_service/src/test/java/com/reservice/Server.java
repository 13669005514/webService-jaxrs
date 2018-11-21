package com.reservice;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

/**
 * 发布服务
 */
public class Server {

    public static void main(String[] args) {

        //创建发布服务工厂
        JAXRSServerFactoryBean jaxrsServerFactoryBean = new JAXRSServerFactoryBean();

        //注册地址
        jaxrsServerFactoryBean.setAddress("http://localhost:8001/ws");

        //服务接口
        jaxrsServerFactoryBean.setServiceBean(new UserServiceImpl());

        //发布服务
        jaxrsServerFactoryBean.create();

        System.out.println("服务发布成功 端口号为8001");

    }


}
