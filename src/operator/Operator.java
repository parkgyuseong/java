package operator;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		  int mathScore = 90; int engScore = 70;
//		  
//		  int totalScore = mathScore + engScore; System.out.println(totalScore);
//		  
//		  double avgScore = totalScore / 2.0; System.out.println(avgScore);
//		  
//		  System.out.println("수학 : "+ mathScore +" , " + "영어 :" +engScore);
//		  
//		  System.out.println(str);
		
		int a = 10;  // decimal
		int b = 010;  //octal
		int c = 0X10;  // hexadecimal
		int d = 0B10;  // binary
		
		System.out.println(Integer.toString(a)+" "+Integer.toOctalString(b)+""
				+ " "+Integer.toHexString(c)+" "+Integer.toBinaryString(d));
		
		 
	}

}
