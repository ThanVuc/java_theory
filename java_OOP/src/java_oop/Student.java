
package java_oop;

/**
 *
 * @author ADMIN
 */
public class Student {
        String name, course;
        float math,physics,chemistry;
    
        float countAvrPoint(){
            return (math+physics+chemistry)/3;
        }
        
        @Override
        public String toString() {
            return name+" "+course+" "+math+" "+physics+" "+chemistry+" "+countAvrPoint();
        } 
}
