package lessons._09_mar_23;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyIterator {
    boolean hasNext(List<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            return true;
            //int num = iterator.next();
        }
        return false;
    }

    Integer next(List<Integer> list){
        return null;
    }

    String remove(List<Integer> list, Integer number){
        //если объект есть, то вывести на экран Объект удалён,
        // если нет , то Объекта нет
        int num = 0;
        for (int i = 0; i < list.size(); i++) {

            if (number == list.get(i)){
                System.out.println(list.remove(i));
                num++;
            }
        }

        return num == 0 ? "no" : "del";

    }


    boolean hasPrevious(List<Integer> list){
        ListIterator<Integer> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()){
            return true;
            //int num = listIterator.previous();
        }
        return false;
    }

    Integer previous(List<Integer> list){

        return null;
    }

}
