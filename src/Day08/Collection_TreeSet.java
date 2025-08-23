package Day8;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class Collection_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> data =new TreeSet<Integer>();
		data.add(12);
		data.add(22);
		data.add(32);
		data.add(42);
		
		System.out.println(data);
		Iterator<Integer> iterator=data.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
