package com.company;

import java.util.Scanner;

public class SNT20 {
    public static void main(String[] args) {
        System.out.println("Nhập số");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int N=2;
            while(count < n){
                if(checkPrime(N)){
                    System.out.println(N);
                    count++;
                }N++;
        }

    }
    public static boolean checkPrime(int n){
        if(n<2) return false;
        else if(n<4) return true;
        else {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n%i==0){
                    check = false;
                    break;
                }
            }
            return check;
        }
    }
}
