package FinalSabit;

public class TestFinalInstanceVariable {
	
	
	private int x; //class'ın alanı olarak tanımlandığında bu instance varable'dır.
	private int y = 5; 
	private int z; //değişkenin  değerini constructor'da veya herhangi bir metotda içinde tanımlanabilir.
	
	private final int a  = 10; // final keyword kullanıldığında değişkenin değeri, ya direkt  tanımlanmalı yada constructor'a atanmalıdır.
	private final int b;
	
	//eğer değer atanmamış ve final bir alan varsa contructorların tümünde o alan parametre olarak geçilip değer atanmalıdır.
	
	
	public TestFinalInstanceVariable (int b) {
		this.b = b;
	}
	public TestFinalInstanceVariable (int z, int b) {
		this.z = z;
		this.b = b;
	}
	

	public static void main(String[] args) {
		
		
		TestFinalInstanceVariable testfinalInstanceVariable = new TestFinalInstanceVariable(20,30);
		System.out.println("x ==> " + testfinalInstanceVariable.x); //instance variable'a bir değer atanmadığında varsayılan değer ne ise o yazılır.
		System.out.println("y ==> " + testfinalInstanceVariable.y); 
		System.out.println("z ==> " + testfinalInstanceVariable.z); //değer constructor'da parametre olarak geçildi.
		
		System.out.println("a ==> " + testfinalInstanceVariable.a);
		System.out.println("b ==> " + testfinalInstanceVariable.b); //değer constructorda parametre olarak verilmiştir.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
