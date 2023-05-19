package com.spacebetween.linket.dao.user;

import com.spacebetween.linket.domain.User;
import com.spacebetween.linket.dto.UserJoinDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class UserDAOImplTest {
    @Autowired
    private UserDAO userDAO;

    @Test
    public void getUser() throws Exception{
        UserJoinDto userJoinDto = userDAO.getUser("aaa@aaa.com");
        System.out.println(userJoinDto);
        assertTrue(userJoinDto!=null);
    }

    @Test
    public void checkUserPwd() throws Exception{
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("email","aaa@aaa.com");
        hashMap.put("password","1234");

        UserJoinDto userJoinDto = userDAO.checkUserPwd(hashMap);
        System.out.println(userJoinDto);
        assertTrue(userJoinDto!=null);
    }

    @Test
    public void updateUser() throws Exception{
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("email", "aaa@aaa.com");
        hashMap.put("phone","010-3333-3333");
        hashMap.put("password", "1111");
        int rowCnt = userDAO.updateUser(hashMap);
        assertTrue(rowCnt==1);
    }
}