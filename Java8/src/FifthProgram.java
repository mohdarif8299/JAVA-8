import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
public class FifthProgram {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);list.add(20);list.add(13);list.add(16);list.add(17);
		Stream<Integer> stream = list.stream();
		List<Integer> newList = stream.filter(n->n%2==0).map(n->n+1).collect(Collectors.toList());
		System.out.println(newList);
		System.out.println(list);
		list.forEach(n->System.out.println(n));
	}
}
