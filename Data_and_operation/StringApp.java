
public class StringApp {

	public static void main(String[] args) {
		System.out.println("Hello World"); //String
		//System.out.println('Hello World'); 
			//JAVA에서는 작은 따음표는 특수한 데이터타입을 나타냄 -> Character
		System.out.println('H'); //Character
		System.out.println("H"); //String
		
		System.out.println("Hello "
				+ "World"); //이래도 줄바꿈은 안됨
		
		///new Line
		System.out.println("Hello \nWorld");
		
		//escape
		//Hello "World"
		System.out.println("Hello \"World\"");

	}

}
