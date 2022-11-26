package Commonpackage.java;
abstract class Animal{
    abstract void Name();
    public void info(){
        System.out.println("Name of the Animal");
    }
}
class Tiger extends Animal{
    public void sound(){
        System.out.println("i am lion");
    }

    @Override
    public void Name() {
        System.out.println("I am panter");
    }
}

   public class Abstration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Tiger t=new Tiger();
    t.info();
    t.sound();
    t.Name();

	}
   }


