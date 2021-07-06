package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        if(number<2){
            System.out.println(number+ "KHÔNG PHẢI SỐ NGUYÊN TỐ");
        }else {
            int i=2;
            boolean check = true;
            while(i<number){
                if(number%i==0){
                    check = false;
                    break;
                }
                i++;
            }
            if(check)
                System.out.println(number + "LÀ SỐ NGUYÊN TỐ");
            else
                System.out.println(number + "KHÔNG PHẢI SỐ NGUYÊN TỐ");
        }
    }
}
