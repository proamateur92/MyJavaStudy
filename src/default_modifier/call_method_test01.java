package default_modifier;

public class call_method_test01 {
	String name = "DB";
	// default 접근제어자는 동일 패키지의 클래스를 호출하여 변수에 접근 가능하다.
	public static void main(String args[]) {
		test01 test = new test01();
		System.out.println(test.name);
	}
}
