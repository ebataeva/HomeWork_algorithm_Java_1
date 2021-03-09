import java.util.Random;

public class Main {
    public static void main(String[] args) {
    Integer  a = 10;
    String b = "Муся";
    final int SIZE = 1000000;
    MyClass [] myArr = new MyClass[SIZE];
    MyClass myVar =  new MyClass("privet", 10);
        System.out.println(myVar.compare(a));
        System.out.println(myVar.compare(b));
        for (int i = 0; i < SIZE; i++) {
            myArr[i] = new MyClass(MyClass.getString(), new Random().nextInt(20));
        }
        long time1 = System.nanoTime();
        for (int i = 0; i <SIZE ; i++) {
            if(myArr[i].compare(a)){
        long time = time1-System.nanoTime();
                System.out.println(myArr[i]+ "\n за время"+ time);
                break;}
        }
    }


}
