package Loops.Assignment;

import java.util.Scanner;
//to print sum of n numbers
public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n= sc.nextInt();
        int sum=0;
        for(int i=1; i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
