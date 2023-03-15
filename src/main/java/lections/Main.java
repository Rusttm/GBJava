package lections;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        workWithFile();
    }
    public static void workWithFile() {
        System.out.println("Lections");
        File f1 = new File("data.txt");
        System.out.println(f1.getAbsolutePath());
    }
}
