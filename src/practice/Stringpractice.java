package practice;

public class Stringpractice {
	int val1;
	int val2;
	int val3;
	
	final String name="The Godfather";
	void watchMovie(){
		//name="Chinatown"; 
		//Uncomment the above line
		//This throws a compilation error saying "final field 'movies' cannot be reassigned" 
		System.out.println("Movie Name: "+name);
	}
	
	public  Stringpractice() {
		System.out.println("This is parameterless constructor");
		
		
		
	}
	public  void Stringpractice(int val1,int val2) {
		System.out.println("this is parent class method ");
		this.val1=val1;
		this.val2=val2;
		System.out.println(this.val1+this.val2);
		
	}
	public Stringpractice(int val1,int val2,int val3) {
		System.out.println("this is  three val paramaterized constructor ovrloding");
		this.val1=val1;
		this.val2=val2;
		this.val3=val3;
		System.out.println(this.val1+this.val2+this.val3);
		
	}
	

	public void method1() {
		System.out.println("method one is overloaded");
		
	}
	public int method1(int a,int b) {
		System.out.println("method one with two aruguments is overloaded");
		return a+b;
		
		
	}
	public int method1(int a,int b, int c) {
		System.out.println("method one with three aruguments is overloaded");
		return a+b+c;
		
	}
	

	

}
class A extends Stringpractice{
	public void Stringpractice(int val1,int val2) {
		System.out.println("child class method overriden parent class method");
		this.val1=val1;
		this.val2=val2;
		System.out.println(this.val1+this.val2);
		
	}
}
class Output{
	public static void main(String[] args) {
		
		
		String name="This Is a sTring";
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		int len=name.length();
		System.out.println(len);
		boolean b=name.equalsIgnoreCase("this Is a a sTring");
		System.out.println(b);
		boolean c=name.startsWith("this");
		System.out.println(c);
		String tr=name.stripLeading();
		System.out.println(tr);
		StringBuilder st=new StringBuilder("harsha");
		st.append("tdt");
		System.out.println(st);
		st.reverse();
		System.out.println(st);
		//method overloading
		
		Stringpractice sp=new Stringpractice();
		sp.method1();
		sp.method1(36, 65);
		sp.method1(67,758, 656);
		
		//constructor overloading
		
		Stringpractice sp1=new Stringpractice();
		
		Stringpractice sp3=new Stringpractice(324,7653,65);
		
		//overriding 
		//final,private,static methods cannot be overriden
		sp1.Stringpractice(23, 34);
		A  a=new A();
		a.Stringpractice(34, 56);
		Stringpractice o=new A();
		o.Stringpractice(1, 2);
		
		
		
		
		
	
		
		
		
		
		


	}
	
}
