package ie.gmit.week5Lab;

public class DivByZero {
public static void main(String[] args) {
	
	try {	
	//Code that may raise exception
	int result = 100/0;
	} catch (ArithmeticException aritExc){
		aritExc.printStackTrace();
		
	}
	System.out.println("test");
	
	}//end main
}//end class
