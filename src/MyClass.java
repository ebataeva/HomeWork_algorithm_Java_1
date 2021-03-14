import java.util.Random;

public class MyClass  {
   private String varString;
   private int varInt;
    public static final String[] NAMES = {"Муся", "Пуся", "Хвостик", "Зефирка", "Матильда", "Лапочка", "Ксюша", "Маша"};
    public static Random RAND = new Random();

    public String getVarString() {
        return this.varString;
    }

    public int getVarInt() {
        return varInt;
    }

    public MyClass(String varString, int varInt) {
        this.varString = varString;
        this.varInt = varInt;

    }

    @Override
    public String toString() {
        return  "Строковая переменная ='" + varString + '\'' +
                ", целочисленная переменная =" + varInt +
                '}';
    }
    public boolean compare(String var){
return this.varString.equals(var);
    }

    public boolean compare (int var){
   return this.varInt == var;
    }


    public static String getRandOfArray(String[] arr) {
        int i = RAND.nextInt(5);
        return arr[i];
    }
    public static String getString(){
        return    getRandOfArray(NAMES);
    }




}
