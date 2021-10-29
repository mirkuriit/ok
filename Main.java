package com.company;
 
import java.util.Scanner;
 
public class Main {
    static Scanner in = new Scanner(System.in);
 
    public static void main(String[] args){
        /*double a = firstDot.start_to_Dot();
        System.out.printf("%.2f", a);*/
 
        while (true){
 
            System.out.println("Введите цифру для выбора одного из возможных действий:");
            System.out.println("1.Посчитать расстояние от начала координат до заданной точки");
            System.out.println("2.Посчитать расстояние от первой заданной точки до второй заданной точки");
            System.out.println("3.Посчитать координаты середины отрезка, образованного двумя заданными точками");
            System.out.println("4.Выход и завершение программы");
            int answer = in.nextInt();
            if (answer == 1){
                Dots firstDot = new Dots(in.nextDouble(), in.nextDouble());
                System.out.printf("%.2f", firstDot.getStart_to_Dot());
            }
            else if (answer == 2){
                Dots firstDot = new Dots(in.nextDouble(), in.nextDouble());
                Dots secondDot = new Dots(in.nextDouble(), in.nextDouble());
                System.out.printf("%.2f", firstDot.getDot_to_Dot(firstDot, secondDot));
            }
            else if (answer == 3){
                Dots firstDot = new Dots(in.nextDouble(), in.nextDouble());
                Dots secondDot = new Dots(in.nextDouble(), in.nextDouble());
                double[] midpoint = firstDot.getMidpoint(firstDot, secondDot);
                for (double x: midpoint) {
                    System.out.println(x + " ");
                }
            }
            else if (answer == 4){
                break;
            }
            System.out.println();
        }
    }
}
