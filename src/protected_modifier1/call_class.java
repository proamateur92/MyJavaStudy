package protected_modifier1;

import protected_modifier.becalled_class;

//���� ��Ű�� ���� Ŭ���� �Ǵ� �ش� Ŭ������ ��ӹ��� �ܺ� ��Ű���� Ŭ�������� ���� ����
public class call_class extends becalled_class{
	public static void main(String[] args) {
		call_class cc = new call_class();
		System.out.println(cc.name); 
	}

}
