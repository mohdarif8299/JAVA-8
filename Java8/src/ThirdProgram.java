@FunctionalInterface
interface MyInterface{
	void show();
}
public class ThirdProgram {
  public static void main(String[] args) {
	  MyInterface m =new ThirdProgram()::come;
	  m.show();
  }
  void come() {
		System.out.println("Method");
	}
}
