package com.company;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1. In hình tam giác");
            System.out.println("2. In Tam giác ngược");
            System.out.println("3. In Hình chữ nhật");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 1;i<7 ; i++) {
                            System.out.println();
                        for (int j = 1; j <i ; j++)
                            System.out.print("*");
                    }
                    break;
                case 2:
                    for (int i = 1;i<6 ; i++) {
                        System.out.println();
                        for (int j =6;j>i;j--){
                            System.out.print("*");
                        }
                    }
                    break;
                case 3:
                    for (int i = 1;i<4 ; i++) {
                        System.out.println();
                        for (int j = 0; j <8 ; j++)
                            System.out.print("*");
                    }
                    break;
                case 4:
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}

