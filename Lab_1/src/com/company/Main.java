package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    float x1, x2, y1, y2; // №1
        System.out.print("Input x1: ");
        x1 = in.nextFloat();
        System.out.print("Input y1: ");
        y1 = in.nextFloat();
        System.out.print("Input x2: ");
        x2 = in.nextFloat();
        System.out.print("Input y2: ");
        y2 = in.nextFloat();
        System.out.println(distance(x1, y1, x2, y2));

        float x_2, y_2; // №2
        System.out.print("Input x: ");
        x_2 = in.nextFloat();
        System.out.print("Input y: ");
        y_2 = in.nextFloat();
        if (IsPointInSquare2(x_2, y_2)) System.out.println("YES");
        else System.out.println("NO");

        float x_3, y_3; // №3
        System.out.print("Input x: ");
        x_3 = in.nextFloat();
        System.out.print("Input y: ");
        y_3 = in.nextFloat();
        if (IsPointInSquare3(x_3, y_3)) System.out.println("YES");
        else System.out.println("NO");
    }

    public static float distance(float x1, float y1, float x2, float y2){
        return (float)Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static boolean IsPointInSquare2(float x, float y){
        if (Math.abs(x) <= 1 && Math.abs(y) <= 1) return true;
        else return false;
    }

    public static boolean IsPointInSquare3(float x, float y){
        return Math.abs(x) + Math.abs(y) <= 1;
    }
}
