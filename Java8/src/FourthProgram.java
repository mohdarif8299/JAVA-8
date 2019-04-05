import java.util.function.Predicate;

public class FourthProgram {
	public static void main(String[] args) {    
		Predicate<Integer> p1 = num->num==100;
		Predicate<Integer> p2 = num->num<=100;
		boolean b = p1.and(p2).test(100);
		System.out.println(b);
		
	}
}
