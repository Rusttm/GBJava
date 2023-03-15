package lesson1;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Привет");
        // 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
        System.out.printf("Максимальный элемент =%d", findMinMax());
        System.out.println();

        // 2. Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
        // не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
        // при этом каждый 400-й – високосный.
        System.out.printf("Год высокосный %b", checkYear());
        }
    private static int findMinMax() {
        int[] myarray = {3,5,7,9,5,1,3,2};
        System.out.print("Задан массив:");
        System.out.println(Arrays.toString(myarray));
        int maxelem = myarray[0];
        for (int elem:
             myarray) {
            if (elem>maxelem) {
                maxelem = elem;
            }
        }
        return maxelem;

    }
    private static boolean checkYear() {

        Scanner input =  new Scanner(System.in);
        System.out.print("Enter year: ");
        String year = input.next();
        int yearint = Integer.parseInt(year);
        if ( (yearint % 400) == 0){
            return true;
        }
        else if ( (yearint % 100) == 0){
            return false;
        }
        else if ( (yearint % 4) == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
