
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;//잃어버리는 값이 없어서 형변환 없이도 코드실행에 문제 없었다.
		double b2 = (double)1;
		System.out.println(b);
		
//		int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1;//강제로 인티저로 바꾸겠다
		System.out.println(e);
		
//		1을 String으로 바꾸고 싶다
		String f = Integer.toString(1);
		System.out.println(f.getClass());
	}

}
