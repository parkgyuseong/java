package operator;

public class Q4 {

	public static void main(String[] args) {

		int num = 10;
		int num2 = 20;
		
		boolean result;
		
		result = ((num>10) && (num2>10));
		System.out.println(result);
		result = ((num>10) || (num2>10));
		System.out.println(result);
		System.out.println(!result);
		
	}

}
