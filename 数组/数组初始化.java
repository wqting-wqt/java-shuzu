package 数组;
/*
      数组：是一种用于存储多个相同类型数据的存储模型

      定义格式：
              数据类型【】 数组名；
              举例：inroad【】 arr；
       数组初始化：
               1.初始化，就是为数组最终的数组元素分配空间，并为每个数组元素赋值
               2.数组初始化
                  动态初始化
                  静态初始化
               动态初始化：
                    初始化时只指数组长度，由系统为数组分配初始值
                    格式：数据类型【】 变量名 = new 数据类型【数组长度】；
                    范例：int 【】 arr = new int【3】；
                静态初始化：
                    格式：数据类型【】 变量名 = new 数据类型【】；（数据1，数据2，数据3········）
                    范例：int 【】 arr = {1，2，3}；
 */
public class 数组初始化 {
    public static void main(String[] args) {
        int [] arr= new int [3];

        int [] arr2= new int [3];

        /*
        左边，
            int说明数组中的元素类型时int
           【】：说明这是一个数组
            arr：说明这是数组名称
        右边：
            new：为数组申请内存空间
            int：说明数组中元素类型是int
           【】：说明这是一个数组
        数组长度，其实就是数组中的元素个数
         */
        //输出数组名
        System.out.println(arr);
        //输出数组中的元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        arr[0]=100;
        arr[1]=200;
        arr[2]=300;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        arr2[0]=300;
        arr2[1]=400;
        arr2[2]=500;
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        //arr=arr3
        int [] arr3=arr;
        System.out.println(arr3);
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);

        //静态初始化
        int [] arr4 = {1,2,3};
        //输出数组名
        System.out.println(arr4);
        //输出数组中的元素
        System.out.println(arr4[0]);
        System.out.println(arr4[1]);
        System.out.println(arr4[2]);


    }
}
