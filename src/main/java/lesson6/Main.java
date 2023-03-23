package lesson6;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
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

        for (Notebooks notebook:
             notebookBase) {
            if (notebook.IsApplyFilter(filterKey, filterValue)) {
                System.out.println(notebook);
            }

        }

    }


}