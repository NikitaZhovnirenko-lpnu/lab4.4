package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double xStart;
        double R;

        double y;

        String result = "";

        System.out.println("Введіть початковий аргумент Х: ");
        xStart = sc.nextDouble();

        System.out.println("Введіть параметр R: ");
        R = sc.nextDouble();

        System.out.println("Введіть кінцеве значення Х: ");
        double xEnd = sc.nextDouble();

        System.out.println("Введіть значення кроку: ");
        double xStep = sc.nextDouble();

        while (xStart <= xEnd)
        {
            if (xStart <= 2) {
                y = xStart + 3;
                result = "\"За даного аргументу: " + xStart + ", та параметру " + R + ", значення Y дорівнює: " + y;
            } else if (xStart > -2 && xStart <= 4) {
                y = -0.5 * xStart;
                result = "\"За даного аргументу: " + xStart + ", та параметру " + R + ", значення Y дорівнює: " + y;
            } else if (xStart > 4 && xStart <= 8 - R) {
                y = -R;
                result = "\"За даного аргументу: " + xStart + ", та параметру " + R + ", значення Y дорівнює: " + y;

            } else if (xStart > 8 - R && xStart <= 8 + R) {
                y = Math.sqrt(Math.pow(R, 2) - Math.pow(xStart - 8, 2)) - R;
                result = "\"За даного аргументу: " + xStart + ", та параметру " + R + ", значення Y дорівнює: " + y;
            } else {
                y = -R;
                result = "\"За даного аргументу: " + xStart + ", та параметру " + R + ", значення Y дорівнює: " + y;
            }


            System.out.println(result);
            xStart += xStep;
        }


        }


}