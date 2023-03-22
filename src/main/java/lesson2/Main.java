package lesson2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson 2");

//        Задание1
        Scanner input =  new Scanner(System.in);
        System.out.print("Задание1. Введите строку: ");
        String paliString = input.next();
        boolean ispalindrom =  CheckPalindrom(paliString);
        if (ispalindrom) {
            System.out.printf("строка %s - палиндром", paliString);
        }
        else {
            System.out.printf("строка %s - не палиндром", paliString);
        }
//      Задание 2
        String myString = "TEST";
        for (int i = 0; i < 5; i++) {
            myString += "TEST";
        }
        Write2File(myString);

    }
    public static boolean CheckPalindrom(String st) {
//        1. Напишите метод, который принимает на вход строку (String)
//        и определяет является ли строка палиндромом (возвращает boolean значение).
        for (int i = 0; i < st.length() / 2; i++) {
            if (st.charAt(i) != st.charAt(st.length() - i - 1)) {
                return false;
            }
        }
        System.out.println();
        return true;
    }
        public static void Write2File(String st2file) {
//            2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
//            и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
            try {
                File newTextFile = new File("mytextfile.txt");

                FileWriter fw = new FileWriter(newTextFile);
                fw.write(st2file);
                fw.close();

            } catch (IOException iox) {
                //do stuff with exception
                iox.printStackTrace();
            }
//            System.out.printf("строка %s - палиндром", myString);

    }

}
