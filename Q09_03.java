/*Q3
  在程式中定義一個ArrayList<Double> ad，然後將98, 12.345, 97.85, 12放入其中。
  現在要對其內的元素進行排序。Java提供的Collections類別可對某些List物件內的元素排序，
  你要找出是哪個方法可以排序，然後將排序結果印出
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
