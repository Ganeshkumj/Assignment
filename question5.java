import java.util.Set;
import java.util.stream.IntStream;
public class question5 {
   public static void main(String[] args) {
      IntStream intStream = IntStream.rangeClosed(15, 25);
      intStream.filter(predicate);
      Set<Integer> evenNumbers = intStream.stream().
              filter(o -> o % 2 == 0).
               collect(Collectors.toSet());
      System.out.println(evenNumbers);
      intStream.forEach(System.out::println);
   }
}