/*Q4
String[] names = {"張君雅","潘美雪","劉雪莉","黃彬彬","潘美雪","黃美華","劉雪莉","黃彬彬","潘美雪","潘美雪"}
Java提供的Arrays類別可對某些陣列內的元素排序，你要找出是哪個方法可以排序，然後將排序結果印出
*/
package CH09;

import java.util.Arrays;

public class Q09_04 {

	public static void main(String[] args) {
		String[] names ={"張君雅","潘美雪","劉雪莉","黃彬彬","潘美雪","黃美華","劉雪莉","黃彬彬","潘美雪","潘美雪"};
		Arrays.sort(names);
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
