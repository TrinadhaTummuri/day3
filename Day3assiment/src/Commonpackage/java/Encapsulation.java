package Commonpackage.java;


class Btech1{
    private String Branch;

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

   
}

public class Encapsulation {

    public static void main(String args []){
        Btech1 b=new Btech1();
        b.setBranch("CSE");
        System.out.println(b.getBranch());
    }
}