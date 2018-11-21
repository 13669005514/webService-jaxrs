package com.rsspring.enity;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @XmlRootElement指定对象序列化为xml对象或json对象的名称
 */
@XmlRootElement(name="User")
public class User {

    private Integer id;
    private String username;
    private String city;
    private List<Car>list = new ArrayList<Car>();


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Car> getList() {
        return list;
    }

    public void setList(List<Car> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", city='" + city + '\'' +
                ", list=" + list +
                '}';
    }
}
