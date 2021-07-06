package com.company;

public class SNT {
    public static void main(String[] args) {
        for (int i = 2; i <=100 ; i++) {
            if(checkSnt(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean checkSnt(int n){
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
