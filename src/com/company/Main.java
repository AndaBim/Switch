package com.company;

import java.util.Scanner;

public class Main {
    static void Assignment2_1(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which day is it? ");
        int dayOfTheWeek = input.nextInt();

        switch (dayOfTheWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It is a working day!");
                break;
            case 6:
            case 7:
                System.out.println("It is a weekend!");
                break;
            default:
                System.out.println("Please enter a valid range (1-7)");

        }
    }

    static void Assignment2_2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your grade in the following format: A,B,C,D,E or F: ");
        char grade = scanner.next().charAt(0);

        switch (grade) {
            case 'A':
            case 'B':
                System.out.println("Perfect! Your the master of the Universe");
                break;
            case 'C':
                System.out.println("Good! But you can aim higher!");
                break;
            case 'D':
            case 'E':
                System.out.println("It is not good! Go study some more!");
                break;
            case 'F':
                System.out.println("Fail! This is so bad it's embarrassing!");
                break;
            default:
                System.out.println("Please enter valid range (A,B,C,D,E or F)");
        }
    }

    static void Assignment2_3(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write a number: ");
        int num = input.nextInt();
        System.out.println("Please write a second number: ");
        int num1 = input.nextInt();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose a letter where: " + "\n" +
                " a = sum both numbers " + "\n" +
                " b = subtraction both numbers" + "\n" +
                " c = division of both numbers " + "\n" +
                " d = multiplication of both numbers " + "\n" +
                " e = a remainder of the division of both numbers " + "\n" +
                " f = print out of both numbers " + "\n" +
                " g = verification of the bigger number " + "\n" +
                " h = verification of the smaller number ");
        int theResult = scanner.next().charAt(0);

        switch (theResult) {
            case 'a':
                System.out.println("The sum of both numbers is " + (num + num1));
                break;
            case 'b':
                System.out.println("Substraction of both numbers is " + (num - num1));
                break;
            case 'c':
                System.out.println("Division of both numbers is " + (num / num1));
                break;
            case 'd':
                System.out.println("Multiplication of both numbers is " + (num * num1));
                break;
            case 'e':
                System.out.println("The reminder of the division of both numbers is " + (num % num1));
                break;
            case 'f':
                System.out.println("The numbers you chose are " + num + " and " + num1);
                break;
            case 'g':
                if (num > num1) {
                    System.out.println(num + " is bigger than " + num1);
                } else {
                    System.out.println(num1 + "is bigger than " + num);
                }
                break;
            case 'h':
                if (num < num1) {
                    System.out.println(num + " is smaller than " + num1);
                } else {
                    System.out.println(num1 + " is smaller than " + num);
                }
                break;
            default:
                System.out.println("Well, you did something wrong and I cannot help you here, sorry");
        }
    }

    public static void main(String[] args)
    {
//        Assignment2_1();
//        Assignment2_2();
        Assignment2_3();
    }
}