package lesson5;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        System.out.println("lesson5");
        //        Задача 1
        System.out.print("Задача 1. ");
//        1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
//        что 1 человек может иметь несколько телефонов.
        HashMap<String, List<String>> phoneBook = new HashMap<>();
        phoneBook.computeIfAbsent("Natalia Ivanova", k -> new ArrayList<>()).add("31276645355511");
        phoneBook.computeIfAbsent("Natalia Ivanova", k -> new ArrayList<>()).add("71234564567890");
        phoneBook.computeIfAbsent("Dmitri Petroff", k -> new ArrayList<>()).add("81233553223332");
        phoneBook.computeIfAbsent("Dmitri Petroff", k -> new ArrayList<>()).add("51276645367889");
        phoneBook.computeIfAbsent("Dmitri Petroff", k -> new ArrayList<>()).add("41200900505054");


        System.out.println("Телефонная книга, в которой у сотрудника несколько телефонов: ");
        System.out.println(phoneBook);


        //        Задача 2
        System.out.println("Задача 2.");
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
        System.out.print("Начальный словарь: ");
        System.out.println(namesBook);
        System.out.print("Отсортированный словарь: ");
        System.out.println(SortHashByValue(namesBook));


   }
    public static HashMap<String, Integer> SortHashByValue(HashMap<String, Integer> myHashMap) {
        // написать функцию сортировки
        List<String> mapKeys = new ArrayList<>(myHashMap.keySet());
        List<Integer> mapValues = new ArrayList<>(myHashMap.values());
        Collections.sort(mapValues);
        Collections.reverse(mapValues); // descending
        Collections.sort(mapKeys);
//        System.out.println(mapValues);
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        // делаем через итераторы
        Iterator<Integer> valueIt = mapValues.iterator();
        while (valueIt.hasNext()) {
            Integer val = valueIt.next();
            Iterator<String> keyIt = mapKeys.iterator();
            while (keyIt.hasNext()) {
                String key = keyIt.next();
                Integer val1 = myHashMap.get(key);
                Integer val2 = val;
                if (val1.equals(val2)) {
                    keyIt.remove();
                    sortedMap.put(key, val);
                    break;
                }
            }

        }

        return sortedMap;
    }
}
