package ru.kosenko.Lesson1;

import java.util.Scanner;

public class HelloWorld
{

    public static void main(String[] args) {
        String res;
        String name;
        int i = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Здравствуйе, как вас зовут?");
         name = in.nextLine();
       do {
           System.out.printf(name + ", введи номер задания: 1, 2, 3, 4 или 5: ");
           int num = in.nextInt();
           System.out.printf("Задание №: %d \n", num);
           if (num == 1) {
               HomeWork1();
           }
           if (num == 2) {
               int a, b, c;
               System.out.println("Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),\nесли да – вернуть true, в противном случае – false; ");
               System.out.printf("Введите значение a: ");
               a = in.nextInt();
               System.out.printf("Введите значение b: ");
               b = in.nextInt();
               c = a + b;
               HomeWork2(a, b, c);
           }
           if (num == 3) {
               HomeWork3();
           }
           if (num == 4) {
               HomeWork4(name);
           }
           if (num == 5) {
               HomeWork5();
           }
           System.out.println("\nЗадание №"+ num +" выполнено!\n");
           System.out.println("Продолжить: любая цифра, Выйти: 1\n");
           i = in.nextInt();
       } while (i != 1);

        in.close();
    }

    static void HomeWork1(){
        Scanner in = new Scanner(System.in);
        System.out.printf("Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой, \n где a, b, c, d – целочисленные входные параметры этого метода;\n");
        int a,b,c,d;
        System.out.printf("Введите значение a: ");
        a = in.nextInt();
        System.out.printf("Введите значение b: ");
        b = in.nextInt();
        System.out.printf("Введите значение c: ");
        c = in.nextInt();
        System.out.printf("Введите значение d: ");
        d = in.nextInt();
        float result = a * (b + c / d);
        System.out.printf("Результат a * (b + c / d) = "+ result);
        return;
    }
    static boolean HomeWork2(int a, int b, int c){
        boolean res;
        res =  (c >=10 && c<=20);
        System.out.println (res);
        if (res == true){
            System.out.printf("Результат: "+c+ " сумма входит в диапазон от 10 до 20 включительно! ");
        }
        else {
            System.out.printf("Результат: "+c+ " сумма не входит в диапазон от 10 до 20 включительно! ");
        }
        return res;
    }
    static void HomeWork3(){
        int a;
        Scanner in = new Scanner(System.in);
        System.out.printf("Написать метод, которому в качестве параметра передается целое число, метод должен проверить положительное ли число передали,\nили отрицательное. Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль \n");
        System.out.println("Введите любое целое положительное или отрицательное число:  ");
        a = in.nextInt();
        System.out.println(a >= 0 ? (a + " Положительное число!") : (a + " Отрицательное число!"));
    }
    static String HomeWork4(String name){
        System.out.printf("Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вернуть\nприветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль. \n");
        System.out.println("Привет, " + name + "!");
    return name;
    }
    static void HomeWork5(){
        Scanner in = new Scanner(System.in);
        System.out.printf("Написать метод, который определяет является ли год високосным. Каждый 4-й год является високосным, кроме каждого 100-го, \n при этом каждый 400-й – високосный. Для проверки работы вывести результаты работы метода в консоль \n");
        int num;
        System.out.printf("Введите год:  ");
        num = in.nextInt();
      if (((num % 4 == 0 && num % 100 != 0)) || num % 400 == 0) {
          System.out.printf("Год " + num + " високосный");
      }
      else {
          System.out.printf("Год " + num + " не високосный");
      }
    }
}
