/*Q3
  �b�{�����w�q�@��ArrayList<Double> ad�A�M��N98, 12.345, 97.85, 12��J�䤤�C
  �{�b�n��䤺�������i��ƧǡCJava���Ѫ�Collections���O�i��Y��List���󤺪������ƧǡA
  �A�n��X�O���Ӥ�k�i�H�ƧǡA�M��N�Ƨǵ��G�L�X
*/
package CH09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q09_03 {

	public static void main(String[] args) {
//		List<? extends Number> ad = Arrays.asList(98, 12.345, 97.85, 12);
		List<Double> ad = new ArrayList<>();
		ad.add((double) 98);
		ad.add(12.345);
		ad.add(97.85);
		ad.add((double) 12);
		Collections.sort(ad);
		for(Double u: ad) {
			System.out.print(u + " ,");
		}

//		Collections.sort(ad);

	}

}
