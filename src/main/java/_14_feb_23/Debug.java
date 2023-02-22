package _14_feb_23;

public class Debug {
    public static int getNumber(int[] a, int n){
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n){
                result = n;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,55,66,7,8};
        int b = 7;
        System.out.println(getNumber(a,b));
    }
}
