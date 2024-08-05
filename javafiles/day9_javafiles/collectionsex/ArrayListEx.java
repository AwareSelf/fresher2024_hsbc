package collectionsex;
import java.util.*;
public class ArrayListEx {

    public static void main(String[] args) {

        meth();
    }


    public static void meth()
    {
       List<String> l = new ArrayList<String>(15);
       l.add("Namrata");
       l.add("Sita");
       l.add("Geeta");

        System.out.println(l);

        //using iterator - to iterate through the collection
        Iterator<String> it = l.iterator();
        while(it.hasNext())
        {
            String s = it.next();
            System.out.println(s.toLowerCase());
        }

        l.forEach(ele-> System.out.println(ele));

        System.out.println(l.size());
        System.out.println(l.contains("geeta"));

        String n = l.get(0);
        System.out.println(n);

        l.set(0,"Namita");
        System.out.println(l);

        //below will throw IndexOutOfBoundsException as index 4 currently does not exist
       // l.set(4,"meeta");
       // System.out.println(l);
        l.remove(1);
        System.out.println(l);
        l.clear();
        System.out.println(l.size());
        System.out.println(l);


    }
}
