package _07_feb_23;

/*Todo
    Есть массив интов, надо вывести на экран
    минимальный элемент массива и
    второй по минимальности элемент массива
 */
public class Test2 {
    //создаём массив:
    public static void main(String[] args) {
        int[]arr = {8,2,4,3,4};
        getMin(arr);
    }

    public static void getMin(int[] arr){
        //присваиваем значение первому элементу массива:
        int min = arr[0];
        int min2 = 0;

        for (int i = 0; i < arr.length; i++) {
            // если 1вый элемент меньше минимального:
            if(arr[i] <= min) {
                min2 = min;
                min = arr[i];
            }
            else if (arr[i] > min && arr[i] < min2) {
                min2 = arr[i];
            }
        }
        System.out.println("Min 1 : " + min);
        System.out.println("Min 2 : " + min2);
    }
}
