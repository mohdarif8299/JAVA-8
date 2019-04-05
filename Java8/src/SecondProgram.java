import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class SecondProgram {
	public static void main(String[] args) {
			List <Integer>list = new ArrayList<>();
			list.add(80);list.add(40);list.add(30);list.add(60);list.add(10);list.add(20);
			Collections.sort(list,(a,b)-> a>b?-1:a<b?1:0);
			System.out.println(list);
	}
}