package dopUroki;
/* TODO: 15.03.23
    создать метод, который :
    заполнить List рандомными Char размером до 10 и диапазоном 20
    заполнить ArrayList рандомными Char размером до 10 и диапазоном 20
    заполнить HashMap рандомными Char  размером до 10 и диапазоном 20
    заполнить Set рандомными Char размером до 10 и диапазоном 20
    заполнить Map рандомными Char размером до 10 и диапазоном 20
    вывести все методы на экран в методе main
 */
import java.util.*;

public class CharFill {

    public static void main(String[] args) {
        // Создаем список List
        List<Character> list = new ArrayList<>();
        // Заполняем список List рандомными Char размером до 10 и диапазоном 20
        fillList(list, 10, 20);
        // Выводим содержимое списка List на экран
        System.out.println("List: " + list);

        // Создаем список ArrayList
        ArrayList<Character> arrayList = new ArrayList<>();
        // Заполняем список ArrayList рандомными Char размером до 10 и диапазоном 20
        fillList(arrayList, 10, 20);
        // Выводим содержимое списка ArrayList на экран
        System.out.println("ArrayList: " + arrayList);

        // Создаем Map (ассоциативный массив) HashMap
        Map<Integer, Character> hashMap = new HashMap<>();
        // Заполняем Map HashMap рандомными Char размером до 10 и диапазоном 20
        fillMap(hashMap, 10, 20);
        // Выводим содержимое Map HashMap на экран
        System.out.println("HashMap: " + hashMap);

        // Создаем множество Set
        Set<Character> set = new HashSet<>();
        // Заполняем множество Set рандомными Char размером до 10 и диапазоном 20
        fillSet(set, 10, 20);
        // Выводим содержимое множества Set на экран
        System.out.println("Set: " + set);

        // Создаем Map
        Map<Integer, Character> map = new HashMap<>();
        // Заполняем Map рандомными Char размером до 10 и диапазоном 20
        fillMap(map, 10, 20);
        // Выводим содержимое Map на экран
        System.out.println("Map: " + map);
    }

    // Метод заполняет List рандомными Char размером до size и диапазоном range
    public static void fillList(List<Character> list, int size, int range) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add((char)(random.nextInt(range) + 'a'));
        }
    }

    // Метод заполняет Map рандомными Char размером до size и диапазоном range
    public static void fillMap(Map<Integer, Character> map, int size, int range) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            map.put(i, (char)(random.nextInt(range) + 'a'));
        }
    }

    // Метод заполняет Set рандомными Char размером до size и диапазоном range
    public static void fillSet(Set<Character> set, int size, int range) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            set.add((char)(random.nextInt(range) + 'a'));
        }
    }
}