class Abc{
    private int val; //incapsulation data hiding
    public void setValue(int x){//data abstraction
        val=x;

    }
    public int getValue(){
        return val; // we can also update value Ex if we write here return ++val; the value will be increased one.
    }
}



public class javaEncapsulation {
    public static void main(String[] args) {
        Abc a=new Abc();
        a.setValue(100);
        System.out.println(a.getValue());
        
    }
    
}
