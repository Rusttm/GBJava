package lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println("lesson5");
        //        Задача 1
        System.out.println("Задача 1");
//        1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
//        что 1 человек может иметь несколько телефонов.
        HashMap<String, List<String>> phoneBook = new HashMap<>();
        ArrayList<String> l = new ArrayList<>();
        l.add("71234564567890");
        l.add("31276645378986");
        phoneBook.put("Nata", l);
        System.out.println(phoneBook);


        //        Задача 2
        System.out.println("Задача 2");
//        Пусть дан список сотрудников:
//        Написать программу, которая найдёт и
//        выведет повторяющиеся имена с количеством повторений.
//        Отсортировать по убыванию популярности.
        ArrayList<String> newEmployes = new ArrayList<>();
        newEmployes.add("Иван Иванов");
        newEmployes.add("Светлана Петрова");
        newEmployes.add("Кристина Белова");
        newEmployes.add("Анна Мусина");
        newEmployes.add("Анна Крутова");
        newEmployes.add("Иван Юрин");
        newEmployes.add("Петр Лыков");
        newEmployes.add("Павел Чернов");
        newEmployes.add("Петр Чернышов");
        newEmployes.add("Мария Федорова");
        newEmployes.add("Марина Светлова");
        newEmployes.add("Мария Савина");
        newEmployes.add("Мария Рыкова");
        newEmployes.add("Марина Лугова");
        newEmployes.add("Анна Владимирова");
        newEmployes.add("Иван Мечников");
        newEmployes.add("Петр Петин");
        newEmployes.add("Иван Ежов");
        HashMap<String, Integer> namesBook = new HashMap<>();
        String name;
        for (String fullname:
                newEmployes) {
            name = fullname.split(" ")[0];
            if (namesBook.containsKey(name)) {
                namesBook.put(name, namesBook.get(name)+1);
            }
            else {
                namesBook.put(name, 1);
            }

        }

        System.out.println(SortHashValue(namesBook));


   }
    public static HashMap<String, Integer> SortHashValue(HashMap<String, Integer> myHashMap) {
        // написать функцию сортировки
        return myHashMap;
    }
}
