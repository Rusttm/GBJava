package lesson3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Задача1
//        1. Пусть дан произвольный список целых чисел, удалить из него четные числа
//        (в языке уже есть что-то готовое для этого)
        ExcludeOdds();

        // Задача 2
//        2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и
//        среднее арифметическое из этого списка.
        StatArray();

        // задача 3
//        3. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
//        Пройти по списку, найти и удалить целые числа.
        ExcludeIntegers();

    }
    public static void ExcludeOdds() {

//        1. Пусть дан произвольный список целых чисел, удалить из него четные числа
//        (в языке уже есть что-то готовое для этого)
//        int[] my_list = {1, 3, 0, 22, 60, 35, 100};
        ArrayList<Integer> my_list = new ArrayList<>();
        my_list.add(1);
        my_list.add(2);
        my_list.add(3);
        my_list.add(0);
        my_list.add(22);
        my_list.add(35);
        my_list.add(115);
        System.out.print("Задача1. Задан массив: ");
        System.out.println(my_list);
        for (int i = 0; i < my_list.size(); i++) {
            if ((my_list.get(i)%2) == 0) {
//                System.out.println(my_list.get(i));
                my_list.remove(i);
                i--;
            }
        }
        System.out.print("Результат удаления четных чисел из массива: ");
        System.out.println(my_list);


    }

    public static void StatArray() {
        //        2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и
        //        среднее арифметическое из этого списка.
        ArrayList<Integer> my_list = new ArrayList<>();
        my_list.add(1);
        my_list.add(2);
        my_list.add(3);
        my_list.add(5);
        my_list.add(22);
        my_list.add(35);
        my_list.add(115);
        System.out.print("Задача2. Задан массив: ");
        System.out.println(my_list);

        int minValue = my_list.get(0);
        int maxValue = my_list.get(0);
        int value;
        double meanValue = 0;
        for (Integer integer : my_list) {
            value = integer;
            if (value > maxValue) {
                maxValue = value;
            } else {
                if (value < minValue) {
                    minValue = value;
                }
            }
            meanValue += value;
        }
        meanValue = meanValue/my_list.size();
        System.out.printf("Результат: Максимум = %d Минимум = %d Среднее = %.2f", maxValue, minValue, meanValue);
        System.out.println();

    }

    public static void ExcludeIntegers() {
        ArrayList<String> my_list = new ArrayList<>();
        my_list.add("st");
        my_list.add("rn");
        my_list.add("5");
        my_list.add("vic");
        my_list.add("111");
        my_list.add("e");
        my_list.add("0");
        System.out.print("Задача3. Задан массив: ");
        System.out.println(my_list);
        String value;
        for (int i = 0; i < my_list.size(); i++) {
            value = my_list.get(i);
            try {
//                int number = Integer.parseInt(value);
                Integer.parseInt(value);
                my_list.remove(i);
                i--;
            }
            catch (NumberFormatException ex) {}


        }
        System.out.print("Результат удаления чисел из массива: ");
        System.out.println(my_list);

    }

}
