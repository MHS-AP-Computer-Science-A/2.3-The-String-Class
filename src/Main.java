//String Class Part 1
public class Main {

	public static void main(String[] args) {
		String str = "Avocados";
		
		//Length
		int result = str.length();
		System.out.println("Length of Avocados: " + result);
		
		//CharAt
		char result2 = str.charAt(5);
		System.out.println("6th char of Avocados: " + result2);
		
		//IndexOf
		int result3 = str.indexOf("ca");
		System.out.println("'ca' is located at index: " + result3);
		
		int result4 = str.indexOf("zebra");
		System.out.println("'zebra' is located at index: " + result4);
		
		int result5 = str.indexOf("o", 3);
		System.out.println("If we start searching at char 3, 'o' is located at index: " + result5);
		
		//Substring
		String result6 = str.substring(3, 5);
		System.out.println("substring(3, 5): " + result6);
		
		String result7 = str.substring(4);
		System.out.println("substring(4): " + result7);
		
		String result8 = str.substring(3, 10);
		System.out.println("substring(3, 10): " + result8);
	}

}
