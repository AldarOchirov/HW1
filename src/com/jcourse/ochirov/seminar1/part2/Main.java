package com.jcourse.ochirov.seminar1.part2;

import java.util.Random;
import java.util.Scanner;

class Game{
    private int guessNumber;
    Game(){
        Random random = new Random();
        guessNumber = random.nextInt(101);
//        System.out.println("guessNumber = " + guessNumber);
    }
    public void playGame(){
        int readNumber = 0;
        String s;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 8; i++){
            System.out.println("Введите число, попытка №" + i);
            s = scanner.nextLine();
            try{
                readNumber = Integer.parseInt(s);
            }catch (NumberFormatException e){
                System.err.println("Строка не является числом");
                i--;
                continue;
            }
            if (readNumber == guessNumber){
                System.out.println("Ура, вы выиграли!");
                break;
            }
            else {
                if (readNumber > guessNumber) {
                    System.out.println("Меньше");
                } else {
                    System.out.println("Больше");
                }
            }
            if (i == 8){
                System.out.println("Вы проиграли, задуманное число = " + guessNumber);
            }
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Game a = new Game();
        a.playGame();
    }
}
