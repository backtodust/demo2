package com.example.mapper;

//import com.baomidou.mybatisplus.core.mapper.BaseMapper;
//import com.example.entity.Permission;
//import com.example.entity.Role;
import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface UserMapper  {

    User getUserByPhone(@Param("phone") String phone);

    void register(@Param("username")String username,@Param("password") String password,@Param("salt") String salt,@Param("sex") String sex,@Param("email") String email,@Param("phone") String phone);
//    List<Role> getRoles(@Param("uid") Long uid);
//    List<Permission> getPermissions(@Param("roleId") int roleId);

}
