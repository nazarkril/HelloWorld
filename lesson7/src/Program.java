//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.*;

public class Program {
    public Program() {
    }

    public static void main(String[] args) {
        Collection<String> string = new ArrayList();
        string.add("A");
        string.add("B");
        string.add("C");

        Map<Integer, String> aaa = new HashMap<>();

        aaa.put(0,"Z");
        aaa.put(1,"O");
        aaa.put(2,"T");

        aaa.get(1);
        System.out.println(aaa.get(1));
        System.out.println(aaa);
//        Iterator<String> iterator = string.iterator();
//        while (iterator.hasNext()) {
//            String nextElement = (String)iterator.next();
//            System.out.println(nextElement);
//        }
//        for (String element : string){
//            System.out.println(element);
//        }
    }
}
