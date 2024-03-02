package 数组;
/*
     索引越界：访问了数组中不存在的索引对应的元素，造成索引越界问题
     ArrayIndexOutOfBoundsException

     空指针异常，访问的数组已经不再指向堆内存的数据，造成空指针异常
     NullPointerException

     NULL:空值，引用数据类型的默认值，表示不指向任何有效对象
 */
public class 数组操作常见问题 {
    public static void main(String[] args) {
        int [] arr = new int[3];
        // 索引越界：访问了数组中不存在的索引对应的元素，造成索引越界问题
        //     ArrayIndexOutOfBoundsException
        // System.out.println(arr[3]);
        //把null赋值给数组
        //空指针异常，访问的数组已经不再指向堆内存的数据，造成空指针异常
        //     NullPointerException
        arr =null;
        System.out.println(arr[0]);

    }
}

