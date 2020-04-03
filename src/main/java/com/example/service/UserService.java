package com.example.service;

//import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
//import com.example.ap_demo.entity.Permission;
//import com.example.ap_demo.entity.Role;
//import com.example.ap_demo.entity.Room;
import com.example.entity.User;
//import com.example.ap_demo.mapper.RoomMapper;
import com.example.mapper.UserMapper;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService  {
    @Resource
    UserMapper userMapper;

    public User getUserByPhone(String phone){
        return  userMapper.getUserByPhone(phone);
    }
//
//    public List<Role> getRoles(Long uid){
//        return  userMapper.getRoles(uid);
//
//    }
//    public List<Permission> getPermissions(int roleId){
//        return userMapper.getPermissions(roleId);
//    }
    public static String md5(String str, String salt) {
        return new Md5Hash(str, salt).toString();
    }
    public void register(User user){
      String salt="q6taw";
      String password=md5(user.getPassword(),salt);
    userMapper.register(user.getName(),password,salt,user.getSex(),user.getEmail(),user.getPhone());
    return;


    }
    public static void main(String[] args) {
        String password = "123456";
        System.out.println(md5(password, "q6taw"));
    }



}
