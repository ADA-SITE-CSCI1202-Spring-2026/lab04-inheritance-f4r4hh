package week06;

import java.util.Scanner;

public class MathDemo {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        System.out.println(min(2, 5));
        System.out.println(max(2, 5));
        System.out.println(sum(2, 5));
    }
    public static int min(int a, int b) {
    if(a>b) return b;
    else return a;
}
public static int max(int a, int b) {
    if(a>b) return a;
    else return b;
}
public static int sum(int a, int b) {
    return a+b;
}
 
} 
