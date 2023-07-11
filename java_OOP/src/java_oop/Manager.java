/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_oop;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Manager {

    Scanner s = new Scanner(System.in);
    ListStudent ls = new ListStudent();

    void addNew() {
        while (true) {
            Student st = new Student();
            System.out.println("Enter your: Name/Class/math Point/"
                    + "physic Point/Chemistry Point");
            st.name = s.nextLine();
            st.course = s.nextLine();
            st.math = Float.parseFloat(s.nextLine());
            st.physics = Float.parseFloat(s.nextLine());
            st.chemistry = Float.parseFloat(s.nextLine());
            ls.addInList(st);
            System.out.println("Do you want to continue? Y/N");
            String choice = s.nextLine();
            if (choice.equalsIgnoreCase("n"))
                break;
        }
    }

    void print_List(ListStudent ls) {
        for (Student st : ls.a) {
            System.out.println(st.toString());
        }
    }

    void category() {
        System.out.println("0. Exit");
        System.out.println("1. add new");
        System.out.println("2. print list");
        System.out.println("3. print list more than 5");
    }

    ListStudent ListMoreThan5() {
        ListStudent lsMoreThan5 = new ListStudent();
        for (Student st : ls.a) {
            if (st.countAvrPoint() >= 5) {
                lsMoreThan5.addInList(st);
            }
        }
        return lsMoreThan5;
    }

    void menu() {
        int choice=1;
        while (choice != 0) {
            category();
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(s.nextLine());
            switch (choice) {
                case 1:
                    addNew();
                    break;
                case 2:
                    print_List(ls);
                    break;
                case 3:
                    print_List(ListMoreThan5());
                    break;
            }
        }
    }
}
