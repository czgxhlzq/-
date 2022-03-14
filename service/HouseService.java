package com.houserent.service;

import com.houserent.domain.House;

public class HouseService {
    //属性

    //保存House对象
    private House[] houses;
    //记录当前有多少房屋信息
    private int houseNum = 1;
    //id自增长
    private int idCounter = 1;


    //方法

    //房屋信息的存储
    public HouseService(int size) {
        //创建数组时，指定大小
        houses = new House[size];
        houses[0] = new House(1,"jaok","12345","上海",2000,"未出租");
    }

    //add方法 , 添加房屋， 返回新的对象
    public boolean add(House newHouse){
        //判断这个数组是否还可以继续添加
        if (houseNum == houses.length){
            System.out.println("数组已满");
            return false;
        }
        //把newhouse 添加到 数组 并使houseNum++
        houses[houseNum++] = newHouse;
        idCounter++; //id增加
        newHouse.setId(idCounter); //更新
        return true;
    }

    //list方法 , 返回房屋信息
    public House[] list() {
        return houses;
    }

    //del方法 , 删除房屋信息
    public boolean del(int delId){
        int index = -1;
        //要删除的Id 是数组下标i
        for (int i = 0; i < houseNum; i++) {
            if (delId == houses[i].getId()){
                index = i;
            }
        }
        if (index == -1){
            return false;
        }
//        使用后一个数组元素覆盖前面一个
        for (int i = 0; i < houseNum - 1; i++) {
            houses[i] = houses[i + 1];
        }
        //将最后一个元素置空
        houses[--houseNum] = null;
        return true;
    }

    //find方法 , 查找房屋信息
    public House find(int findId){
        for (int i = 0; i < houseNum; i++) {
            if (findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }



}
