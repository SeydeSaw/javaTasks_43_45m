package homeWork.hw_16_02_23;
/*todo 1
    Дан массив чисел в котором все числа имеют повторения,
    кроме одного числа. Найти это число
 */

public class UnicumNum {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,1,2,3};
        System.out.println(findNum(arr));
    }
    public static int findNum(int[]arr){
        //объявление переменной результата
        int result = 0;
        //перебор массива
        for(int i = 0; i < arr.length; i++){
            int element = arr[i];
            //счетчик повторений
            int count = 0;
            //перебор массива для поиска совпадений с текущим элементом
            for(int j = 0; j < arr.length; j++){
                //сравнение текущего элемента массива с элементом массива по индексу J
                if(element == arr[j]){
                    //увеличение счетчика при совпадении
                    count++;
                }
            }
            //проверка условия, если счетчик повторения равен 1, то это число уникальное
            if(count == 1){
                //запись результата
                result = element;
            }
        }
        //возвращение результата
        return result;
    }
}