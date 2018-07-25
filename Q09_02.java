/*Q2
 String[] names ={"張君雅","潘美雪","劉雪莉","黃彬彬","潘美雪","黃美華","劉雪莉","黃彬彬","潘美雪","潘美雪"}
 此陣列有10個元素，其中某些元素重複，請利用java.util.Set的特性，將重複的元素去除，只留一份。請將去除重複後的資料顯示在螢幕上
 */
package CH09;

import java.util.HashSet;
import java.util.Set;

public class Q09_02 {

	public static void main(String[] args) {
		 String[] names ={"張君雅","潘美雪","劉雪莉","黃彬彬","潘美雪","黃美華","劉雪莉","黃彬彬","潘美雪","潘美雪"};
		 Set<String> words = new HashSet<>();
		 for(String token : names) {
	            words.add(token);
	        }
		 System.out.println("去除重複的單字後剩下 " + words.size() +"個" + words );
	}

}
