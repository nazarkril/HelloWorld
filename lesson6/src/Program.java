import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
        Collection<String> string  = new ArrayList<>();
        string.add("A");
        string.add("B");
        string.add("C");
        Iterator<String> iterator = string.iterator();

        if (iterator.hasNext()){
            String nextElement = iterator.next();
            System.out.println(nextElement);
        }
}}
