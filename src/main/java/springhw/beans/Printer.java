package springhw.beans;

public class Printer {
    private String name;

    public Printer(){}

    public static void print(HelloBean obj){
        System.out.println(obj);
    }
}
