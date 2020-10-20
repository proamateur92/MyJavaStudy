package protected_modifier1;

import protected_modifier.becalled_class;

//동일 패키지 내의 클래스 또는 해당 클래스를 상속받은 외부 패키지의 클래스에서 접근 가능
public class call_class extends becalled_class{
	public static void main(String[] args) {
		call_class cc = new call_class();
		System.out.println(cc.name); 
	}

}
