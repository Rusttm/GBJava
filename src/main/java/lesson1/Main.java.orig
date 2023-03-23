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
        System.out.println();

//        3. Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
//        а остальные - равны ему.
        int[] myshiftedarray = shiftArray();
        System.out.print("Смещенный массив:");
        System.out.println(Arrays.toString(myshiftedarray));


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
        else return (yearint % 4) == 0;
    }
    private static int[] shiftArray() {
        int[] myarray = {3,2,1,3,2,5,7,3};
        System.out.print("Задан массив:");
        System.out.println(Arrays.toString(myarray));
        Scanner in =  new Scanner(System.in);
        System.out.print("Введите число: ");
        String inputnum = in.next();
        int inputint = Integer.parseInt(String.valueOf(inputnum));
        int right = myarray.length;
        for (int i=0; i < right; i++) {
            for (int j=right-1; j > i; j--){
                if ((myarray[i] == inputint) & (myarray[j] != inputint)) {
                    myarray[i] = myarray[j];
                    myarray[j] = inputint;
//                    System.out.println(Arrays.toString(myarray));
                }
            }
        }

        return  myarray;
    }
}
