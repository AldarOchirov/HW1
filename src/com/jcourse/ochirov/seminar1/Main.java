package com.jcourse.ochirov.seminar1;

import java.lang.Math; //подключение дополнительных классов из других пакетов, которые не находятся внутри данного
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Math.abs;
import static java.lang.Math.*; //Импорт всего Math

//название классов PascalCase
public class Main {
    //статические константы
    private static final int STATIC_CONST_FIELD = 3;

    protected final int constField;

    int myField; //инициализация по умолчанию 0

    //public - доступ имеют все классы и объекты
    public Main(){
        this.constField = 42;
    }

    //методы, переменные, поля пишутся в camelCase
    public static void main(String[] args) {
        //com.jcourse.ochirov.seminar1.Main.STATIC_CONST_FIELD;

        Main main = new Main();
        //main.myField;

        System.out.println("Hello, World!"); //Ctrl+Alt+B

        main.myField += 30;
        System.out.println("main.myField = "+ main.myField);
        System.out.println(Main.class.getSimpleName());
        System.out.println(Main.class.getCanonicalName());
        System.out.println(abs(-50)); //Alt+Enter дополнительные действия, напр., импорт
        System.out.println(log(50));
        int variable = 10;
        method(variable, main);
        System.out.println("variable = " + variable);
        System.out.println("main.myField = "+ main.myField);

        Integer a = 5, b = 7;
//        swap(a,b); //a = 7, b = 5
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        Integer i1 = 66; //i1 -> |  |
        Integer i2 = i1; //i2 -> |66|
        System.out.println(i1 == i2);
        i1 += 1;
        System.out.println(i1 == i2);
        AtomicInteger ai1 = new AtomicInteger();
        AtomicInteger ai2 = new AtomicInteger();
//        swap(ai1, ai2);
        System.out.println("ai1 = "+ ai1.get());
        System.out.println("ai2 = "+ ai2.get());

        //Классы обертки:
        //Integer, Byte, Short, Character, Boolean
        Integer integer = 42; //autoboxing, упаковка переменной в integer
        int bb = integer; //unboxing, распаковка
        Integer anotherInteger = null;

        List<Integer> list = new ArrayList<>(); // в <> только классы или обертки


        // int, byte, long, short, double, float, char
        //boolean
        //int[], byte[] - массивы
        // Main - классы, Color - перечисления

        String s1 = "Hello";
        String s2 = ", World!";
        String intString = "77";
        int ii = Integer.parseInt(intString);
        double d = Double.parseDouble(intString);
        System.out.println(ii);
        System.out.println(d);
        System.out.println(s1 + s2);
        Scanner scanner = new Scanner(System.in);
        String encoding = System.getProperty("file.encoding");
        System.getProperty("file.encoding");
        System.setProperty("file.encoding", "UTF-8");
        System.setProperty("file.encoding", "cp1251");
        //Ctrl + P  - всевозможные параметры класса
//        String s = new String ("Привет!".getBytes(), encoding);
//
//        Random random = new Random();
//        int guessNumber = random.nextInt(bound: 101);

//        try{
//            int i = Integer.parseInt(s:"aabb");
//        } catch (NumberFormatException e){
//            System.err.println("Строка не является числом");
//        }

    }

    static void method(int a, Main main){
        a += 10;
        main.myField += 10;
    }

//    static void swap(AtomicInteger a, AtomicInteger b){
//        int tmp = a;
//        a = b;
//        b = tmp;
//    }
}
//перечисления также как и константы
enum Color{
    RED, GREEN,YELLOW
}

//package
// <Название компании>, <Группа проектов>, <Название проекта>
// google.com -> com.google
// jcourse.com
// package: com.jcourse.ochirov.seminar1