
package java_oop;

import java.util.ArrayList;


public class ListStudent {
    ArrayList<Student> a= new ArrayList<>();
    void addInList(Student st){
        a.add(st);
    }

    public static void main(String[] args) {
       Manager mg= new Manager();
       mg.menu();
    }
    
}
