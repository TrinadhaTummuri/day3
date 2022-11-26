package Commonpackage.java;




class Graduvation{
    public void sound(){
        System.out.println("I am a graduvation student");
    }
}
 class Btech extends Graduvation{
     public void sound(){
         System.out.println("I am a btech student");
     }
 }
 class Degree extends Graduvation{
     public void sound(){
         System.out.println("I am a degree student");
     }
 }
 public class Polymorphism {
    public static void main(String args []){
        Graduvation gr =new Graduvation();
        Graduvation bt =new Btech();
        Graduvation dg =new Degree();
        gr.sound();
        bt.sound();
        dg.sound();
    }
}