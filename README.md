#房屋出租系统
# 房屋出租架构 (分层模式)

* 系统有哪些类(文件)

* 明确类与类的调用关系

# 类

### HouseView.java [界面层]

1.显示用户界面

2.接收用户的输入

3.调用其他类完成对房屋的各种操作

#### 代码实现分析

1.编写mianMenu方法，可以显示主菜单

2.编写listHouse方法 //界面

3.编写addHouse()  //界面，用于接收用户的输入

4.编写delHouse() //界面，用于接收用户的输入

5.编写一个findHouse() //

6.编写一个updateHouse()

### HouseService.java [业务层]

//定义House[] , 保存House对象

1.响应House View的调用

2.完成对房屋的各种操作（增删改查）(crud) (c)【create】(r)【read】(u)【update】(d)【delete】

#### 代码实现

1.编写一个方法list()//返回所有的房屋信息

2.编写一个add(House newHouse)//把一个house对象加入到house数组，返回一个bool

3.编写一个del(int delld) //完成真正的删除任务 放回一个bool

4.编写一个find(int findid) // 

### House.java [ domain / 模型层 / model]

1.一个House对象表示一个房屋信息

2.有哪些属性，可以通过给出的界面图分析得到

### HouseRentApp.java [程序入口]

~~~ java
    //并调用，显示菜单
}
~~~

