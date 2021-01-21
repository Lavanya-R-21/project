import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Main_ArrayDuplicate {
	
	public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> input) {
		LinkedHashSet<Integer> temp=new LinkedHashSet<>();
		ArrayList<Integer> result=new ArrayList<>(temp);
		return result;
	}
	 public static void main(String[] args) {
	        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,15,7,5,4,14,15,16,7));
	        ArrayList<Integer> result = removeDuplicate(input);
	        System.out.println(result);
	    }

}
