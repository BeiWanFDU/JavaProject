package com.itheima.a03integerdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class A05_IntegerDemo5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int number = 7;
        while (true){
            if (number == 0){
                break;
            }
            else{
                int remander = number % 2;
                number /= 2;
                sb.insert(0, remander);
            }
        }
        System.out.println(sb);
    }
}
