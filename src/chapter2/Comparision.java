package chapter2;

public class Comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "Fantastic";
		String lang = "Java";
		boolean state = (txt == lang);
		System.out.println("String Equality Test: "+ state);
		
		state = (txt != lang);
		System.out.println("String Inequaltiy Test: "+ state);
		
		int dozen = 12;
		int score = 20;
		state = (dozen > score);
		System.out.println("Greater then Test: "+ state);
		
		state = (dozen<score);
		System.out.println("Less then Test: "+ state);

	}

}
