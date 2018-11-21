package com.rsspring.service;



import com.rsspring.enity.Car;
import com.rsspring.enity.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements IUserService {
    @Override
    public void saveUser(User user) {
        System.out.println("SAVE User :"+user.toString());
    }

    @Override
    public void updateUser(User user) {
        System.out.println("update User :"+user.toString());

    }

    @Override
    public void deleteUser(User user) {
        System.out.println("delete User :"+user.toString());
    }

    @Override
    public List<User> selectUser() {

        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            User user = new User();
            user.setId(i);
            user.setUsername("张"+i);
            user.setCity("北京");
            users.add(user);
        }
        for (int i = 0; i < 2; i++) {
            Car car = new Car();
            car.setId(i);
            car.setCarName("大众"+i);
            car.setPrice(i*0.08);
            ArrayList<Car> cars = new ArrayList<>();
            cars.add(car);
            users.get(i).setList(cars);
        }
        return users ;
    }
}
