import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TrickyCode {
    public static void main(String[] args) {
        String s1 ="hello";
        s1= s1.toUpperCase();
        String s2 =s1;

        System.out.println(s2);
        Map<String,String> str = new HashMap<>();

        str.put("dsf","cvdcvx");
        str.put("fgdthdg","dfg");
        str.put("dx","dbv");

        Set<String> itr= str.keySet();

        Iterator<String> iterator = itr.iterator();
        while (iterator.hasNext()){
            String key =iterator.next();
            String value =str.get(key);
            System.out.println(key + "     " + value);
           // System.out.println(iterator.next());
        }

    }
}
