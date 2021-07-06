package com.company;

import java.util.Scanner;

public class thuchanh3 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("NHẬP a");
        a = input.nextInt();
        System.out.println("NHẬP b");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0 || b==0){
            System.out.println("No greatest common factor");
        }while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Ước chung lớn nhất : " + a);

    }
}
