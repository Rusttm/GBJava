package lesson4;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("lesson4");
//        Задача 1
//        1. Реализовать консольное приложение, которое:
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке,
//        а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.
        FormatList();


    }

    public static void FormatList() {
        ArrayList<String> myList = new ArrayList<String>();

        while (true) {
            System.out.print("Введите строку: ");
            Scanner input =  new Scanner(System.in);
            String inputString = input.next();
//            System.out.println(inputString);
            if (inputString.equals("exit")) {
                break;
            }
            if (inputString.equals("print")) {
                for(int i = myList.size()-1; i >= 0; i--)
                {
                    System.out.println(myList.get(i));
                }
                break;
            }
            if (inputString.equals("revert")) {
                myList.remove(myList.size()-1);
                break;
            }
            myList.add(inputString);
        }
        System.out.println(myList);
    }

}
