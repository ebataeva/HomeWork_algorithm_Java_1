public class Main {
    public static void main(String[] args) {
    Integer  a = 10;
    String b = "privet";
    final int SIZE = 100;
    MyClass [] myArr = new MyClass[SIZE];
    MyClass myVar =  new MyClass("privet", 10);
        System.out.println(myVar.compare(a));
        System.out.println(myVar.compare(b));
        for (int i = 0; i < SIZE; i++) {
            myArr[i] = new MyClass("", 0);
        }
    }


}
