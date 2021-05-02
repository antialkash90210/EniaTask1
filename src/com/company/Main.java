package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double width_А, height_B, panel_N, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Эта программа рассчитывает площадь обработки панелей сульфидом в метрах");
        //1 м^2 = 1нг;

        System.out.print("Ширина панели");
        width_А = input.nextDouble();

        System.out.print("Высота панели");
        height_B = input.nextDouble();

        System.out.print("Кол-во панелей");
        panel_N = input.nextDouble();

        result = 2*width_А*height_B*panel_N; //все значения умножаем на 2,т.к. панели обрабатываются с двух сторон

        System.out.println("Площадь панелей: " + result + " квадратных метров");

    }
}


