import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int SIZE = 400;
        MyClass myArrayCopy[] = new MyClass[SIZE];
        MyClass[] myArr = new MyClass[SIZE];
       final Integer[] myArrIntegers = new Integer[SIZE];
        for (int i = 0; i < SIZE; i++) {
            myArr[i] = new MyClass(MyClass.getString(), new Random().nextInt(20));
        }

        for (int i = 0; i < SIZE; i++) {
            myArrIntegers[i] = myArr[i].getVarInt();
        }
        /*
На основе программного кода из домашнего задания №1 реализуйте массив на основе существующих примитивных или ссылочных типов данных.
Выполните обращение к массиву и базовые операции класса Arrays.
Оценить выполненные методы с помощью базового класса System.nanoTime().
*  */
        printArray(myArr);
        printArray(myArrIntegers);
        copyArray(SIZE, myArr);
        compareArrays(myArrayCopy, myArr);
        Arrays.sort(myArrIntegers);
        printArray(myArrIntegers);
        linearSearch( "Муся", myArr); // 2.2 линейный поиск
        System.out.println(binarySearch(2, myArrIntegers)); //бинарный поиск
        long timeSort = Sort.mySort(myArrIntegers);        //2.3
        long timeBubble = Sort.bubbleSort(myArrIntegers); //2.4
        System.out.println("\n разница между сортировкой пузырьком и обычной - " + (timeSort-timeBubble)); //2.4
        long timeChoice = Sort.sortByChoice(myArrIntegers); //2.5
        System.out.println("\n разница между сортировкой выбором и обычной - " + (timeSort-timeChoice)); //2.5
        long timeInserts = Sort.insertSort(myArrIntegers); //2.6
        System.out.printf("\n разница между сортировкой вставками и обычной - %d, между пузырьковой и вставками - %d, между выбром и вставками - %d",  (timeInserts - timeSort), (timeInserts-timeBubble), (timeInserts-timeChoice)); //2.6









    }

    /*Я вынесла в отдельные методы простые операции с подсчетом времени.
     * */
    private static void compareArrays(MyClass[] myArrayCopy, MyClass[] myArr) {
        long time1 = System.nanoTime();
        Arrays.equals(myArr, myArrayCopy);
        System.out.println(("\n массивы сравнили за время " + (System.nanoTime() - time1)));
    }

    private static void copyArray(int SIZE, MyClass[] myArr) {
        long time1 = System.nanoTime();

        MyClass[] myArrayCopy;
        myArrayCopy = Arrays.copyOf(myArr, SIZE);
        System.out.println("\n массив скопировали за время " + (System.nanoTime() - time1));
    }

    public static void linearSearch(String key, MyClass[] myArr) {

        int SIZE = 10;
        long time1 = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {  //самый обычный поиск в нашем рандомном массиве ищем элемент, где строковый тип совпадает с нашим b
            if (myArr[i].compare(key)) {
                long time = time1 - System.nanoTime();
                System.out.println(myArr[i] + "\n за время" + time);
                break;
            }
        }
    }



    public static int binarySearch(int key, Integer[] arr){
        int left = 1;
        int right = arr.length - 1;

        while (right >= left){
            int middle = (left + right)/2;
            int midVal = arr[middle];
            if(midVal == key){
                return middle;
            }else if(midVal < key){
                left = middle + 1;
            }else if(midVal > key){
                right = middle - 1;
            }

        }
        return -1;

}

public static void checkTimeOfBinarySearch(int key, Integer[] arr){
    long time1 = System.nanoTime();
    binarySearch(key, arr);
    System.out.println("\n  выполнил бинарный поиск за время "+ (System.nanoTime()-time1));
}


    public static <T> void printArray(T[] arr){
        long time1 = System.nanoTime();
        System.out.println(Arrays.toString(arr)+ "\n напечатал массив за время "+ (System.nanoTime()-time1));
    }

}
