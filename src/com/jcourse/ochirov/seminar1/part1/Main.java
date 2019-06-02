package com.jcourse.ochirov.seminar1.part1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String s;
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        System.out.println("s = " + s);
        System.out.println(System.getProperty("file.encoding"));
        System.setProperty("file.encoding", "cp1251");
        System.out.println(System.getProperty("file.encoding"));

 //       String encoding = System.getProperty("file.encoding");
//        String s1 = new String(s.getBytes(), encoding);
    }
}
