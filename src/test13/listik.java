package test13;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class listik {
    protected static ArrayList<Integer> random() {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 1000; ++i) {
            int min = 0;
            int max = 9;
            int diff = max - min;
            Random random = new Random();
            array.add(i, random.nextInt(diff + 1) + min);
        }
        System.out.println("Размер списка: " + array.size());
        System.out.println(array);
        return array;
    }

    protected static ArrayList<String> input() {
        ArrayList<String> array = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; ++i) {
            System.out.printf("Строка %d: ", i + 1);
            String str = input.nextLine();
            array.add(i, str);
        }
        System.out.println(array);
        return array;

    }

    public static void main(String[] arg) {
        random();
        input();
    }

}