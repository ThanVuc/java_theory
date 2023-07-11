
package read_or_write_by_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Read_or_Write_by_file {
    Scanner s= new Scanner(System.in);
    ArrayList<String> a= new ArrayList<>();
    void readFile(String fileName){
        try {
            FileReader fr= new FileReader(fileName);
            BufferedReader br= new BufferedReader(fr);
            String line="";
            while (true){
                line= br.readLine();
                if (line==null)
                    break;
                String []s= line.split(",");
                for (int i=0; i<s.length; i++){
                    addIntoList(s[i]);
                }              
            }
            br.close();
            fr.close();
        } catch (Exception ex) {
            System.out.println("Errors when open a file");
        }
        
    }
    ArrayList<String> takeFirstNameIsH(){
        ArrayList<String> b= new ArrayList<>();
        for (int i=0; i<a.size(); i++){
            if (a.get(i).contains("h")){
                b.add(a.get(i));
            }
        }
        return b;
    }
    void addIntoList(String name){
        a.add(name);
    }
    void enterNameStudent(){
        while(true){
            System.out.println("Enter students Name: ");
            addIntoList(s.nextLine());
            System.out.println("Do you want to Continue? Y/N");
            if (s.nextLine().equalsIgnoreCase("n")){
                break;
            }
        }
    }
    
    void print_arr(ArrayList<String> s){
        for (int i=0; i<s.size(); i++){
            System.out.println(s.get(i));
        }
    }
    void write_File(String tenFile){
        try {
            FileWriter fw = new FileWriter(tenFile);
            BufferedWriter bw= new BufferedWriter(fw);
            ArrayList<String> b=takeFirstNameIsH();
            for (int i = 0; i < b.size(); i++) {
                bw.write(b.get(i)+" ");              
            }
            bw.close();
            fw.close();
            
        } catch (Exception ex) {
            System.out.println("Error when write file");
        }
            
    }
   
    public static void main(String[] args) {
        Read_or_Write_by_file rw= new Read_or_Write_by_file();
        rw.readFile("name.txt");
        rw.write_File("output.txt");
//        rw.print_arr();
    }
    
}
