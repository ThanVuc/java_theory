package array_list_demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List_DEMO {

    Scanner s = new Scanner(System.in);
    ArrayList<Integer> a = new ArrayList<Integer>();

    void addList(int i) {
        a.add(i);
    }

    void addNew() {
        while (true) {
            System.out.println("Enter Value: ");
            addList(Integer.parseInt(s.nextLine()));
            System.out.println("Nhap tt hay ko y/n?");
            if (s.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    void printList() {
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
    }

    void sort() {
        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i) > a.get(j)) {
                    int tmp = a.set(i, a.get(i));
                    a.set(i, a.get(j));
                    a.set(j, tmp);
                }
            }
        }
    }

    void getSum() {
        
    }

    void indexOfProgram() {
        System.out.println("1. add new");
        System.out.println("2. Print List");
        System.out.println("3. Sort");
        System.out.println("4. Sum");
        System.out.println("0. Stop program");
        System.out.println("Enter function: ");
    }

    void menu() {
        int i;
        do {
            indexOfProgram();
            i = Integer.parseInt(s.nextLine());
            switch (i) {
                case 1:
                    addNew();
                    break;
                case 2:
                    printList();
                    break;
                case 3:
                    sort();
                    break;
                case 4:
                    sum();
                    break;
            }
        } while (i != 0);
    }

    public static void main(String[] args) {
        Array_List_DEMO d_arr = new Array_List_DEMO();
        d_arr.menu();
    }

}
