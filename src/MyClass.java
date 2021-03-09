public class MyClass  {
   private String varString;
   private int varInt;

    public MyClass(String varString, int varInt) {
        this.varString = varString;
        this.varInt = varInt;
    }

    @Override
    public String toString() {
        return "Mой класс{" +
                "name='" + varString + '\'' +
                ", age=" + varInt +
                '}';
    }
    public boolean compare(String var){
        boolean result = false;
if (this.varString.equals(var)){
   result = true;
}
return result;
    }

    public boolean compare (int var){
        boolean result = false;
        if (this.varInt == var){
            result = true;
        }
        return result;
    }



}
