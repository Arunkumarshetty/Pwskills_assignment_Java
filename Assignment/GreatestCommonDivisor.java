package Loops.Assignment;


import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("Enter 2 number");
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int GCD=1;
        for (int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                GCD=i;
            }
        }
        System.out.println(GCD);
    }
}



