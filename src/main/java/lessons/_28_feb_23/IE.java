package lessons._28_feb_23;

import java.util.*;

public class IE {
    public static void main(String[] args) {
        ArrayList<String> set = new ArrayList<>();
        String s = "MADAM";

        set.add("@@@");
        set.add("###");
        set.add("!!!");
        set.add("$$$");

        //@@@ ### !!! $$$
        //Iterator<String> iterator = set.iterator();
        ListIterator<String> iterator = set.listIterator(set.size()-1);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}