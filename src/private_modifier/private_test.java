package private_modifier;

public class private_test {
		//priavte 접근 제어자는 동일 클래스 내에서만 쓰일 수 있다.
		private String secret;
		private String getSecret() {
			return this.secret;
		}
		
}
