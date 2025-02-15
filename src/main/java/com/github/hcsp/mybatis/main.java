package com.github.hcsp.mybatis;


//import com.github.hcsp.mybatis.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.List;

public class main {

    public static void main(String[] args) throws IOException {
        String resource = "db/mybatis/config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        UserDao userDao = new UserDao(sqlSessionFactory);
//        userDao.getUserByPage("zhangsan",1,1);
//        User user = new User();
//        user.setId(5);
//        user.setName("test123344");
//        user.setAddress("wuhanligong");
//        user.setTel("110119");
//        userDao.updateUser(user);
//        userDao.deleteUserById(6);
//        System.out.println( userDao.selectUserById(7));
        OrderDao dao = new OrderDao(sqlSessionFactory);
        System.out.println(dao.getInnerJoinOrders());
    }
}
