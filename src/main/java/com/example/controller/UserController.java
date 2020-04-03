
package com.example.controller;


import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userservice;


    @RequestMapping(value = "/register")
    @ResponseBody

//    public String register(@RequestParam(value= "name")String name,@RequestParam(value= "password")String phone,@RequestParam(value= "phone")String phone,@RequestParam(value= "phone")String phone,@RequestParam(value= "phone")String phone,@RequestParam(value= "phone")String phone) {
      public String register(User user){
        if(userservice.getUserByPhone(user.getPhone())==null) {
             userservice.register(user);
            return "SuccessResponseData.success()";
        }
        else return "该电话号码已注册！";
    }
    @RequestMapping(value = "/login")
    @ResponseBody

    public User getUser(@RequestParam(value= "phone")String phone,@RequestParam(value="password") String password) {
   System.out.println("login request");
       User user=userservice.getUserByPhone(phone);
       System.out.println(user.toString());
       if(user==null)
           return null;
       else
           if (UserService.md5(password,user.getSalt()).equals(user.getPassword())) {

               return user;
           }
           else
               return null;
    }
    @RequestMapping(value = "/test")
    @ResponseBody
public String test(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) throws Exception{
        return "admin";
    }
//    @RequestMapping(value ="/admin" ,method = RequestMethod.GET)
//    public String admin(){
//        return "admin";
//    }
//   @RequestMapping(value = "/delete")
//    @ResponseBody
//    public String deleteRoom(@RequestParam(value = "roomId") int roomId){
//        if(this.roomservice.deleteRoom(roomId))
//        return "delete success";
//        return  "error";
//   }
//
//
//
//    @RequestMapping(value = "/getAll")
//    @ResponseBody
//   public List<Room> getAll(){
//
//      List<Room> rooms=roomservice.getAll();
//      for(Room room:rooms)
//          System.out.println(room.toString());
//          return rooms;
//
//
//    };
//    @RequestMapping(value = "/getByName")
//    @ResponseBody
//    public Room getByName(@RequestParam(value= "roomId")String roomId){
//
//      Room room=roomservice.gerRoom(roomId);
//
//           if(room!=null)
//        return room;
//return null;
//    };
//    @RequestMapping(value = "/likeBid")
//    @ResponseBody
//    public List<Room> likeBid(@RequestParam(value = "roomId") String Rid){
//
//        List<Room> rooms=roomservice.likeRId(Rid);
//        for(Room room:rooms)
//            System.out.println(room.toString());
//
//        return rooms;
//
//    };


}
