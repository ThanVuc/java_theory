
package exception_handle;

import java.util.Scanner;


public class Exception_Handle {

    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        // có khả năng dính exception
        
        try {
            System.out.println("Nhap a= ");
            int a= Integer.parseInt(s.nextLine());
            System.out.println("Nhap b= ");
            int b= Integer.parseInt(s.nextLine());
            
            System.out.println("a/b= "+a/b);
            System.out.println("a/a-b= "+a/(a-b));
            System.out.println("a/a*b= "+ a/a*b);
            System.out.println("a/a*b= "+ a/(b-a));

        } catch (ArithmeticException e){
            System.out.println("Wrong: divide by 0!");
        } catch (NumberFormatException e){
            System.out.println("Wrong: Input not a digits");
        } catch (Exception e){
            System.out.println("Other exception");
        }
          
    }
    
}
