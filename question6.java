import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface MyFunctionalInterface1 {

	//A method with single parameter
    public double incrementByFive(double a,double b);
}
 public class question6 {
 public static void main(String args[])
 {   
	 int numbers [] = { 19, 45, 78, 23, 66, 89, 90, 123 }; 
	 int sum = Arrays.stream(numbers).sum();
		System.out.print(sum);
 }
}

