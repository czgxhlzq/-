package com.houserent;

import com.houserent.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        //创建House View对象 并调用显式界面 ， 是整个程序的入口
        new HouseView().mainMenu();
    }
}
