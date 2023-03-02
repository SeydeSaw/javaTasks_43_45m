package lessons._23_feb_23;
/*todo
    Дано число int a = 242; Надо узнать является ли это число палиндромом.
    Слева направо и справа налево читается одинаково.
 */

public class Test2 {
    public static boolean isPalidrom(int x) {
        if(x<0) return false;
        String s = x + "";//преображение в строку
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }
    public static void main(String[] args) {
        System.out.println(isPalidrom(121));
    }
}