package lesson6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        ex0();
        exHw();
//        ex1();
    }

    private static void ex1() {
        final int ARRAY_SIZE = 100000;
        Integer[] arr =  new Integer[ARRAY_SIZE];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, ARRAY_SIZE + 1);
        }

        HashSet<Integer> uniq = new HashSet<>(Arrays.asList(arr));

        double n = uniq.size() * 100 / arr.length;
        System.out.printf("%.2f%n", 1.0 * uniq.size() * 100 / arr.length);
        System.out.println(n);
        System.out.println((double) uniq.size() * 100 / arr.length);

    }

    private static void ex0() {

        List<String> data = List.of("Один", "Два", "Три", "Четыре", "Пять", "Шесть", "Семь", "Восемь", "Девять", "Десять");

        System.out.println(new HashSet<>(data));
        System.out.println(new LinkedHashSet<>(data));
        System.out.println(new TreeSet<>(data));
    }

    private static void exHw() {
        List<String> employees = Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов");

        Map<String, Integer> nameFrequency = new HashMap<>();

        for (String employee : employees) {
            String name = employee.split("\\s")[0];
            nameFrequency.put(name, nameFrequency.getOrDefault(name, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedFrequency = new ArrayList<>(nameFrequency.entrySet());
        sortedFrequency.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        for (Map.Entry<String, Integer> entry : sortedFrequency) {
            System.out.printf("%s: %s%n", entry.getValue(), entry.getKey());
        }
    }


}