package com.spacebetween.linket.service.user;

import com.spacebetween.linket.dto.UserJoinDto;

import java.util.HashMap;
import java.util.Map;

public interface UserService {
    Map<String,Object> getUser(String email) throws Exception;
    Map<String,Object> checkUserPwd(HashMap<String,String> hashMap) throws Exception;
    int updateUserPhone(HashMap<String,String> hashMap) throws Exception;
    int updateUserPassword(HashMap<String,String> hashMap) throws Exception;
}
