

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class HomeWork3 {
    public static void main(String[] args) {
        /*  вставлю сюда код из */
        final int SIZE = 3;
        MyClass myArrayCopy[] = new MyClass[SIZE];

        MyClass[] myArr = new MyClass[SIZE];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = new MyClass(MyClass.getString(), new Random().nextInt(20));
        }
        createArrayList(myArr); //реализован простой список и коллекцию.
        createLinkedList(myArr);
        ArrayList <MyClass> list = createArrayList(myArr);
        System.out.println("этот элемент добавим и удалим, чтобы проверить "+myArr[1]);

        addToArrayList(myArr[1],list); //На основе списка из задания 3.1 реализуйте основные методы добавления, удаления и получения объекта или элемента из списка.

        System.out.println(list);
        deleteFromArrayList(myArr[1],list);
        System.out.println(list);
        takeFromArrayList(list, 1);


    }
    /*
       long time1 = System.nanoTime();
        System.out.println("время  = "+ (System.nanoTime()-time1));
    * */

    public static <T> ArrayList createArrayList(T[] myArr) {
        long time1 = System.nanoTime();

        ArrayList<T> myList = new ArrayList<>();
        for (T a : myArr) {
            myList.add((T) (a+"\n"));
        }
        System.out.println("Мой список");

        System.out.println("время создания ArrayList = "+ (System.nanoTime()-time1));
        return myList;
    }
    public static <T> void addToArrayList(T a, ArrayList list) {
        long time1 = System.nanoTime();
        list.add(a);
        System.out.println("время добавления в ArrayList = " + (System.nanoTime() - time1));

    }
        public static <T> void deleteFromArrayList(T a, ArrayList list){
            long time1 = System.nanoTime();
            list.remove(a);
            System.out.println("время  удаления элемента из ArrayList= "+ (System.nanoTime()-time1));

        }
        public static <T> T takeFromArrayList(ArrayList list, int number){
            long time1 = System.nanoTime();
            T obj = (T) list.get(number);
            System.out.printf("время  на вычленение объекта под номером %d это  %s = %d", number, obj, (System.nanoTime()-time1));
            return obj;
        }

    public static<T> void createLinkedList(T[] myArr){
        long time1 = System.nanoTime();
        LinkedList<T> list = new LinkedList<>(Arrays.asList(myArr));
        System.out.println(list);
        System.out.println("время создания LinkedList = "+ (System.nanoTime()-time1));

    }

}
