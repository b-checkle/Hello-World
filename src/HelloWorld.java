
public class HelloWorld {

	public static int number = 0;
	
	public static void main (String args[]){
		
		System.out.println("Hello World!");
		System.out.println(getNumber());
		
		setNumber(12);
		
		System.out.println(getNumber());
	}
	
	public static void setNumber(int n){
		number = n;
	}
	
	public static int getNumber(){
		return number;
	}
}


