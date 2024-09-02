package practice;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reversal of string
		String s="this is a string";
		String ne="";
		char c;
		int len=s.length();
		for(int i=len-1;i>0;i--) {
			c=s.charAt(i);
			ne=ne+c;
		}
		System.out.println(ne);
		//swapping
		int a=10;
		int b=20;
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("value of a"+a +"Value of b"+b);
		

	}
	

}
