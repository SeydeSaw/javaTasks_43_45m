package lessons._23_feb_23;
/*todo
    Правильная скобочная последовательность.
    последовательность, которая сама себя открывает или закрывает.
    Сколько открывающихся скобок, столько же и закрывающихся.
    Дано 2 строки: String j= "Aa", String s= "aAAbAbBAa",
    необходимо узнать сколько в наборе драгоценных камней.
 */
public class Test {
    public static void main(String[] args) {
    String j = "Aad";
    String s = "aAAbAdbBAa";
        System.out.println(findJew(j, s));
    }
    private static int findJew(String j, String s){
        int count = 0;
        for (int i = 0; i < j.length(); i++) {
            for (int k = 0; k < s.length(); k++) {
                if (j.charAt(i) == s.charAt(k)){
                    count++;
                }
            }
        }
        return count;
    }
}