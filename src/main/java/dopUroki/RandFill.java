package dopUroki;

import java.util.*;

/* TODO: 15.03.23
    создать метод, который :
    заполнить List рандомными числами
    заполнить ArrayList рандомными числами
    заполнить HashMap рандомными числа
    заполнить Set рандомными числа
    заполнить Map рандомными числа
    вывести все методы на экран в методе main
 */
public class RandFill {

    // метод для вывода всех методов на экран в методе main
    public static void main(String[] args) {
        // создаем экземпляр нашего класса
        RandFill randFill = new RandFill();
        // создаем коллекцию List и вызываем метод fillList
        List<Integer> list = new ArrayList<>();
        randFill.fillList(list);
        System.out.println("List: " + list);

        // создаем коллекцию ArrayList и вызываем метод fillArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        randFill.fillArrayList(arrayList);
        System.out.println("ArrayList: " + arrayList);

        // создаем коллекцию HashMap и вызываем метод fillHashMap
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        randFill.fillHashMap(hashMap);
        System.out.println("HashMap: " + hashMap);

        // создаем коллекцию Set и вызываем метод fillSet
        Set<Integer> set = new HashSet<>();
        randFill.fillSet(set);
        System.out.println("Set: " + set);

        // создаем коллекцию Map и вызываем метод fillMap
        Map<Integer, Integer> map = new HashMap<>();
        randFill.fillMap(map);
        System.out.println("Map: " + map);
    }


    // метод для заполнения List рандомными числами размером до 10 и диапазоном 20
    public void fillList(List<Integer> list) {
        // задаем генератор случайных чисел
        Random random = new Random();
        // Создание пустого List
        List<Integer> randList = new ArrayList<>();
        // Заполнение List рандомными числами до 10 и диапазоном 20
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(20));
        }
    }

    // метод для заполнения ArrayList рандомными числами размером до 10 и диапазоном 20
    public void fillArrayList(ArrayList<Integer> arrayList) {
        // задаем генератор случайных чисел
        Random random = new Random();
        // Создание пустого ArrayList
        ArrayList<Integer> randArrList = new ArrayList<>();
        // Заполнение ArrayList рандомными числами до 10 и диапазоном 20
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(20));
        }
    }

    // метод для заполнения HashMap рандомными числа  размером до 10 и диапазоном 20
    public void fillHashMap(HashMap<Integer, Integer> hashMap) {
        // задаем генератор случайных чисел
        Random random = new Random();
        // Создание пустого HashMap
        HashMap<Integer, Integer> randHashMap = new HashMap<>();
        // Заполнение HashMap рандомными числами до 10 и диапазоном 20
        for (int i = 0; i < 10; i++) {
            hashMap.put(i, random.nextInt(20));
        }
    }

    // метод для заполнения Set рандомными числа размером до 10 и диапазоном 20
    public void fillSet(Set<Integer> set) {
        // задаем генератор случайных чисел
        Random random = new Random();
        // Создание пустого Set
        Set<Integer> randSet = new HashSet<>();
        // Заполнение Set рандомными числами до 10 и диапазоном 20
        for (int i = 0; i < 10; i++) {
            set.add(random.nextInt(20));
        }
    }

    // метод для заполнения Map рандомными числа размером до 10 и диапазоном 20
    public void fillMap(Map<Integer, Integer> map) {
        // задаем генератор случайных чисел
        Random random = new Random();
        // Создание пустого Map
        Map<Integer, Integer> randMap = new HashMap<>();
        // Заполнение Map рандомными числами до 10 и диапазоном 20
        for (int i = 0; i < 10; i++) {
            map.put(i, random.nextInt(20));
        }
    }
}