/*Q4
String[] names = {"�i�g��","�����","�B����","���l�l","�����","������","�B����","���l�l","�����","�����"}
Java���Ѫ�Arrays���O�i��Y�ǰ}�C���������ƧǡA�A�n��X�O���Ӥ�k�i�H�ƧǡA�M��N�Ƨǵ��G�L�X
*/
package CH09;

import java.util.Arrays;

public class Q09_04 {

	public static void main(String[] args) {
		String[] names ={"�i�g��","�����","�B����","���l�l","�����","������","�B����","���l�l","�����","�����"};
		Arrays.sort(names);
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
