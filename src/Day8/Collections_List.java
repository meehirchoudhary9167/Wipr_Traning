package Day8;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
public class Collections_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> data =new ArrayList<Integer>();
        data.add(23);
        data.add(33);
        data.add(43);
        data.add(53);
        System.out.println(data.get(2));
        System.out.println(data.indexOf(33));
        for(Object i:data) {
              int data1 = (Integer) i;
              System.out.println(data1);
         }

        
        
	}

}
