package com.example.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;



@TableName(value = "room")

 public class Room {

   @TableId(value = "room_no",type= IdType.AUTO)
   private String roomNo;
    @TableField("room_id")
    private String roomId;

   @TableField("room_type")
   private String roomType;
   @TableField("room_state")
   private String roomState;
   @TableField("room_price")
   private String roomPrice;
   @TableField("room_location")
   private String roomLocation;




   @Override
   public String toString() {
      return "Room{" +
              "roomId='" + roomId + '\'' +
              ", roomType='" + roomType + '\'' +
              ", roomState='" + roomState + '\'' +
              ", roomPrice='" + roomPrice + '\'' +
              ", roomLocation='" + roomLocation + '\'' +
              ", roomNo='" + roomNo + '\'' +
              '}';
   }

   public String getRoomId() {
      return roomId;
   }

   public void setRoomId(String roomId) {
      this.roomId = roomId;
   }

   public String getRoomType() {
      return roomType;
   }

   public void setRoomType(String roomType) {
      this.roomType = roomType;
   }

   public String getRoomState() {
      return roomState;
   }

   public void setRoomState(String roomState) {
      this.roomState = roomState;
   }

   public String getRoomPrice() {
      return roomPrice;
   }

   public void setRoomPrice(String roomPrice) {
      this.roomPrice = roomPrice;
   }

   public String getRoomLocation() {
      return roomLocation;
   }

   public void setRoomLocation(String roomLocation) {
      this.roomLocation = roomLocation;
   }

   public String getRoomNo() {
      return roomNo;
   }

   public void setRoomNo(String roomNo) {
      this.roomNo = roomNo;
   }

    public Room() {

    }


}
