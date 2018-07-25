/*Q1
假設某一Collection物件V包含下列資料:
new Integer(100)
new Double(3.14)
new Long(21L)
short型別之物件(值為100)
new Double(5.1)
"Kitty"
new Integer(200)
"Snoopy"
new BigInteger("1000")
請寫一程式完成下列功能
(1)將上述資料放到Collection物件內
(2)印出物件v內所有元素
(3)移除不是java.lang.Number家族的物件
(4)再次印出物件v內所有元素
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
		System.out.println("v的物件內有" + v);
//		for (Object x : v) {
//			System.out.println(x);
//		}

		System.out.println("刪除不是Number家的物件 然後印出");
		Iterator<Object> iterator = v.iterator();  
		while(iterator.hasNext()){  
			if(!(iterator.next() instanceof Number)){  
		        iterator.remove();  
		    }  
		}
		System.out.println("v的物件內有" + v);
		

	}

}
