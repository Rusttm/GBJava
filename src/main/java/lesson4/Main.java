package lesson4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("lesson4");
//        Задача 1
        System.out.println("Задача 1");
//        1. Реализовать консольное приложение, которое:
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке,
//        а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.
        FormatList();

//        Задача 2
        System.out.print("Задача 2. ");
//        2. Пусть дан LinkedList с несколькими элементами.
//        Реализуйте метод, который вернет “перевернутый” список.
        LinkedList<String> myList = new LinkedList<>();
        myList.add("1stelem");
        myList.add("2ndelem");
        myList.add("3thelem");
        myList.add("4thelem");
        System.out.print("Задан массив: ");
        System.out.println(myList);
        System.out.print("Итоговый массив: ");
        System.out.println(ReverseList(myList));
    }

    public static void FormatList() {
        ArrayList<String> myList = new ArrayList<>();

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
            System.out.println(myList);

        }
        System.out.print("Итоговый массив: ");
        System.out.println(myList);
    }

    public static LinkedList ReverseList(LinkedList myList) {

        LinkedList<String> resList = new LinkedList<>();
        String temp;
        int lenght = myList.size();
        for (int i = 0; i < lenght; i++) {
            temp = ((LinkedList<String>) myList).removeLast();
            resList.addLast(temp);
        }
        return resList;
    }
}
