package chapter2;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1357;
		int num2 = 2468;
		
		String result;
		
		result = (num1 % 2 != 0)? "odd" : "even";	
		System.out.println(num1 +" is "+ result);
		
		result = (num2 % 2 == 0)? "even" : "odd";	
		System.out.println(num2 +" is "+ result);


	}

}
