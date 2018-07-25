/*Q1
���]�Y�@Collection����V�]�t�U�C���:
new Integer(100)
new Double(3.14)
new Long(21L)
short���O������(�Ȭ�100)
new Double(5.1)
"Kitty"
new Integer(200)
"Snoopy"
new BigInteger("1000")
�мg�@�{�������U�C�\��
(1)�N�W�z��Ʃ��Collection����
(2)�L�X����v���Ҧ�����
(3)�������Ojava.lang.Number�a�ڪ�����
(4)�A���L�X����v���Ҧ�����
 */
package CH09;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Q09_01 {

	public static void main(String[] args) {
		Collection<Object> v = new ArrayList<>();
		v.add(new Integer(100));
		v.add(new Double(3.14));
		v.add(new Long(21L));
		v.add(new Short("100"));
		v.add(new Double(5.1));
		v.add("Kitty");
		v.add(new Integer(200));
		v.add("Snoopy");
		v.add(new BigInteger("1000"));
		System.out.println("v�����󤺦�" + v);
//		for (Object x : v) {
//			System.out.println(x);
//		}

		System.out.println("�R�����ONumber�a������ �M��L�X");
		Iterator<Object> iterator = v.iterator();  
		while(iterator.hasNext()){  
			if(!(iterator.next() instanceof Number)){  
		        iterator.remove();  
		    }  
		}
		System.out.println("v�����󤺦�" + v);
		

	}

}
