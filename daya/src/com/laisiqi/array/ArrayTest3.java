package com.laisiqi.array;
/*
需求：

定义一个数组，存储1,2,3,4,5,6,7,8,9,10

遍历数组得到每一个元素。

要求：

1，如果是奇数，则将当前数字扩大两倍

2，如果是偶数，则将当前数字变成二分之一
 */
public class ArrayTest3 {


    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {

                a[i] = a[i] / 2;

            }else {


                a[i] = a[i] * 2;


            }

            System.out.println(a[i]);


        }



    }
}
