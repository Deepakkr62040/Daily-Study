package Java.dataType;

public class MethodsBySir {
    public void sum(){
		int number1 = 200;
		int number2 = 300;
		int sum = number1 + number2;
		System.out.println(sum);
	}
	public static void sub(){
		int number1 = 200;
		int number2 = 300;
		int sum = number1 - number2;
		System.out.println(sum);
	}
		public void div(){
		int number1 = 200;
		int number2 = 300;
		int sum = number1 / number2;
		System.out.println(sum);
	}
	public static void main(String args[]){
		MethodsBySir m=new MethodsBySir();
		m.printDevName();
		m.sum();
		MethodsBySir.sub();
		m.div();
		System.out.println("Hello Deepak");
	}
	
	public void printDevName(){
		System.out.println("Dev Tailor");
	}
}
