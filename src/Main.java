import FunctionalInterface.Functional_Interface_1;
import FunctionalInterface.Functional_Interface_2;
import FunctionalInterface.Functional_Interface_3;
import Streams.ImperativeDeclarative;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Functional_Interface_1 fi1 = ()-> System.out.print("Invoked functional interface");
        fi1.Sample1();
        Functional_Interface_2 fi2 = (a,b)-> System.out.print("\nSUM IS::"+(a+b));
        fi2.sample2(50,40);
        Functional_Interface_3 fi3= (s)-> s.length();
        System.out.print("\n\nLENGTH:"+fi3.strLength("PRANAY"));
        //list of unique integers
        ImperativeDeclarative.Imperative(Arrays.asList(1,2,2,3,4,6,6,6,12,0,0,7));
        ImperativeDeclarative.Declarative(Arrays.asList(1,2,2,3,4,6,6,6,12,0,0,7));
    }
}