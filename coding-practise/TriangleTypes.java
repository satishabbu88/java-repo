package org.example;

import java.util.Scanner;

public class TriangleTypes {

    private static boolean isRightAngledTriangle(int s1, int s2, int s3){
        int s1Square = (int)Math.pow(s1,2);
        int s2Square = (int)Math.pow(s2,2);
        int s3Square = (int)Math.pow(s3,2);

        if((s1Square == s2Square+s3Square) ||
                (s2Square == s3Square+s1Square) || (s3Square == s1Square+s2Square)){
            return true;
        }
        return false;

    }
    private static String getTriangleType(int side1, int side2, int side3){
        if(isRightAngledTriangle(side1, side2, side3)){
            return "Right Angled";
        }

        if(side1 == side2 && side2 == side3){
            return "Equilateral";
        }
        else if(side1 == side2 || side2 == side3 || side3 == side1){
            return "Isosceles";
        }else{
            return "Scalene";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Side1: ");
        int side1 = input.nextInt();
        System.out.println("Enter Side2: ");
        int side2 = input.nextInt();
        System.out.println("Enter Side3: ");
        int side3 = input.nextInt();


        String type = getTriangleType(side1, side2, side3);
        switch(type){
            case "Equilateral":
                System.out.println("Equilateral Triangle");
                break;
            case "Isosceles":
                System.out.println("Isosceles Triangle");
                break;
            case "Scalene":
                System.out.println("Scalene Triangle");
                break;
            case "Right Angled":
                System.out.println("Right Angled Triangle");
                break;
            default:
                System.out.println("Unknown triangle type");
        }
    }
}
