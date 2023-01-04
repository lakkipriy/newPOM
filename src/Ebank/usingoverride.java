package Ebank;

public class usingoverride {
	
	 void display() {
		System.out.println("Hello world");
	}
}

	class red extends usingoverride {
		 void display() {
			System.out.println("mike testing");
		}
	}
 class white{
	

	public static void main(String[] args) {
		
red obj=new red();
obj.display();
	}

}
