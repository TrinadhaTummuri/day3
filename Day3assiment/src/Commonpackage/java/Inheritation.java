package Commonpackage.java;

class Group{
    String study = "Btech";
    public void display(){
        System.out.println("i am a btech");
    }
}
public class Inheritation extends Group {
     String group="CSE";

     public static void main(String args []){
    	 Inheritation s=new Inheritation();
         s.display();
     }

}




