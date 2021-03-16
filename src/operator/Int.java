package operator;

public class Int {

	public static void main(String[] args) {
//		int a = 10;
//		int b;
//		
//		b = ~a;
//		
//		System.out.println(Integer.toBinaryString(a));
//		System.out.println(Integer.toBinaryString(b));
//		
//		int num1 = 5;
//		int num2 = 10;
//		int result = num1&num2;
//		System.out.println(Integer.toBinaryString(result));
//		System.out.println(result);
		
		int a = 5;
		int b = 10;
		int c, d;
		
		c = a>>1;
		d = a<<1;
		
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(c));
		System.out.println(Integer.toBinaryString(d));
	}

}
