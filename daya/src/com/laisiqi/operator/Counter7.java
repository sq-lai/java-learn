package com.laisiqi.operator;

/*

需求：

	朋友聚会的时候可能会玩一个游戏：逢7过

	游戏规则：从任意一个数字开始报数，当你要报的数字是包含7或者是7的倍数时都要说过：过

	使用程序在控制台打印出1-100之间的满足逢七必过规则的数据


 */

//个位、十位、7的倍数都要过

public class Counter7 {

    public static void main(String[] args) {

        System.out.println("输出1-100的数字，逢7输出过");

        for (int i = 1; i <= 100; i++) {

            if (i % 7 == 0 || i % 10 == 7 || (i / 10) % 10 == 7 ) {


                System.out.println("过");

                continue;

            }


            System.out.println(i);

        }


    }





}
