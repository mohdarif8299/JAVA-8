import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
class Reading  implements Runnable{
	private CopyOnWriteArrayList<String> aList;   
	Reading(CopyOnWriteArrayList<String> al) {
		this.aList = al;   
	   }
	@Override
	public void run() {
		try {
			  Iterator i = aList.iterator();
			  while(i.hasNext()) {
				  Thread.sleep(2000);
				  System.out.println(i.next());
			}
			  System.out.println(aList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class Writing implements Runnable{
	private CopyOnWriteArrayList aList;   
	Writing(CopyOnWriteArrayList<String> al) {
		this.aList= al;
	}
	@Override
	public void run() {	
	  try {
			Thread.sleep(2000);
			aList.add("Hello");
//			System.out.println(aList);
	} catch (Exception e) {
      e.printStackTrace();
	}
	}
}
public class FirstProgram {
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<>();
		al.add("Empty");
		Writing writeThread = new Writing(al);
		Reading readThread = new Reading(al);
		 new Thread(writeThread).start();
		 new Thread(readThread).start();
	}
}