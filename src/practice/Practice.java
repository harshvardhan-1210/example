package practice;

public class Practice {
	private int val;
	private String name;
	int customerId=30;
	String customerName="sham";
	int num=20;
	
	public Practice() {
		System.out.println("this is parameter less constructor");
	}
	public Practice(int customerId,String customerName){
		this();
		this.customerId=customerId;
		this.customerName=customerName;
		
	}
	public void evenorOdd() {
		if(num%2==0) {
			System.out.println("number is even"+num);
			
		}
		else {
			System.out.println("This is odd");
		}
	}
	
	public void display() {
		System.out.println(val+name);
	}
	public void customerDetails() {
		this.display();
		System.out.println("customerdetails");
		System.out.println("customerId"+customerId);
		System.out.println("customerName"+customerName);
	}
	public int getValue() {
		return val;
	}
	public void setValue(int val){
		this.val=val;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
}
	
class Tester{
public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		Practice obj=new Practice();
		obj.setName("Harsha");
		obj.setValue(7);
		obj.display();
		Practice obj2=new Practice();
		obj2.setName("reddy");
		obj2.setValue(29);
		obj2.display();
		Practice obj3=new Practice();
		obj3.display();
		Practice obj4=new Practice(21,"Virat");
		obj4.customerDetails();
		obj.evenorOdd();
		int arr[]= {23,34,63,38,77,};
		int sum=0;
		for(int a:arr) {
			if(a%2==0) {
				sum+=a;
			}
		}
		System.out.println(sum);
		
		

	}
}



