/*Q2
 String[] names ={"�i�g��","�����","�B����","���l�l","�����","������","�B����","���l�l","�����","�����"}
 ���}�C��10�Ӥ����A�䤤�Y�Ǥ������ơA�ЧQ��java.util.Set���S�ʡA�N���ƪ������h���A�u�d�@���C�бN�h�����ƫ᪺�����ܦb�ù��W
 */
package CH09;

import java.util.HashSet;
import java.util.Set;

public class Q09_02 {

	public static void main(String[] args) {
		 String[] names ={"�i�g��","�����","�B����","���l�l","�����","������","�B����","���l�l","�����","�����"};
		 Set<String> words = new HashSet<>();
		 for(String token : names) {
	            words.add(token);
	        }
		 System.out.println("�h�����ƪ���r��ѤU " + words.size() +"��" + words );
	}

}
