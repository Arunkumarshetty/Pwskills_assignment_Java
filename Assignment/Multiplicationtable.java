package Loops.Assignment;

import java.util.Scanner;

public class Multiplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int mul = n * i;
            System.out.println(mul);
        }
    }
}
