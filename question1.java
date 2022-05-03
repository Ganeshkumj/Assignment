import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface MyFunctionalInterface {

	//A method with single parameter
    public double incrementByFive(double a,double b);
}
public class question1 {
 public static void main(String args[])
 {
	// lambda expression with single parameter num
 	 MyFunctionalInterface f = (num,num1) -> Math.pow(num,num1);
     System.out.println(f.incrementByFive(2.0,5.0));
     
    
 }
}

