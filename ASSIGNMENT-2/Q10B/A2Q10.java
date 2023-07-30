/*A2Q10.Design a package that contains two classes Student & Test. The Student class has data members as name, roll 
and instance methods input () & output (). Similarly the Test class has data members as mark1, mark2 and instance 
methods input (), output (), Student is extended by Test. Another package carry interface Sports with 2 attributes 
score1, score2. Find grand total mark & score in another class. */
package Q10B;
import Q10A.*;
public class A2Q10 implements Sports {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.input();
        System.out.println("Details : ");
        obj.output();
        System.out.println("TOTAL MARK = " + (obj.mark1 + obj.mark2));
        System.out.println("TOTAL SCORE = " + (score1+score2));
    }    
}
