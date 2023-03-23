package lesson6;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание1. Class Notebooks создан");
        ArrayList <Notebooks> notebookBase = new ArrayList<>();
        Notebooks notebook = new Notebooks("ZenBook", "Lenovo", "black", "8");
        notebookBase.add(notebook);
        notebookBase.add(new Notebooks("ZenBook", "Lenovo", "black", "16"));
        notebookBase.add(new Notebooks("Office", "Dell", "grey", "8"));
        notebookBase.add(new Notebooks("Office", "Dell", "grey", "4"));
        notebookBase.add(new Notebooks("Macbook M1", "Apple", "space grey", "4"));
        notebookBase.add(new Notebooks("Macbook M2", "Apple", "space grey", "16"));
        notebookBase.add(new Notebooks("Macbook M2", "Apple", "space grey", "16"));
        notebookBase.add(new Notebooks("Laptop", "Asus", "black", "8"));
        notebookBase.add(new Notebooks("Extensa", "Acer", "black", "16"));
        notebookBase.add(new Notebooks("Aspier", "Acer", "black", "4"));
        notebookBase.add(new Notebooks("IdeaPad", "Lenovo", "gray", "8"));
        System.out.println("Задание2. ArrayList <Notebooks> создан и заполнен данными (" + notebookBase.size() + " позиций)");
        FilterNotebooks(notebookBase);
    }
    public static void FilterNotebooks(ArrayList <Notebooks> notebookBase) {


        // получим имеющиеся поля из любого экзэмпляра
        HashSet<String> filtersFields = notebookBase.get(0).GetFilters();
//        System.out.println(filtersFields);
        System.out.print("Задание3. Введите название фильтра (" + filtersFields + "): ");
        Scanner input =  new Scanner(System.in);
        String filterKey = input.next();
        if (!filtersFields.contains(filterKey)) {
            System.out.println("Такого фильтра нет");
            exit(1);
        }
        System.out.print("Введите значение фильтра: ");
        String filterValue = input.next();

        ArrayList <String> filteredBase = new ArrayList<>();

        for (Notebooks notebook:
             notebookBase) {
            if (notebook.IsApplyFilter(filterKey, filterValue)) {
                filteredBase.add(notebook.toString());
            }

        }
        if (filteredBase.size()>0) {
            System.out.printf("По фильтру '%s' = '%s' выбраны следующие позиции: ", filterKey, filterValue);
            for (String position:
                 filteredBase) {
                System.out.println(position);
            }
        }
        else {
            System.out.printf("По фильтру '%s' = '%s' позиций не обнаружено!", filterKey, filterValue);
        }

    }


}