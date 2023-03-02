package lessons._23_feb_23;
/*todo
    Дано число int a = 242; Надо узнать является ли это число палиндромом.
    Слева направо и справа налево читается одинаково.
 */
public class Test1 {
    public static void main(String[] args) {
        String arrayNum;
        int num = 123321;
        arrayNum = String.valueOf(num);
        boolean isPalindrom = true;
        for (int i = 0; i < arrayNum.length()/2; i++) {
            if (arrayNum.charAt(i) != arrayNum.charAt(arrayNum.length()- (i+1))){// [0] != 6-([0]+1) =>  [1] != 6 -([1]+1) и т.д.
                boolean isPalidrom = false;
                System.out.println("Not palindrom");
                break;
            }
        }
        System.out.println("Palidrom: " + isPalindrom);
    }
}