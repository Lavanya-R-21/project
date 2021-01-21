import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class CountryComparator implements Comparator<String>
{
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
    
}
public class Main_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> countries=new ArrayList<>();
        countries.add("Australia");
        countries.add("Srilanka");
        countries.add("Japan");
        countries.add("Pakistan");
        countries.add("Zimbabwe");
        countries.add("India");
        Collections.sort(countries, new CountryComparator());
        System.out.println(countries);
    }
}
