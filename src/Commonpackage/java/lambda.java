package Commonpackage.java;


@FunctionalInterface
interface A{
    void show();
    String toString();
}
public class lambda {

    public static void main(String args []){
        A a=() -> System.out.println("Hello lambda Expression"); 
        a.show();
    }
}