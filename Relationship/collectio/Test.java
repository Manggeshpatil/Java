package collectio;

import java.util.ArrayList;

public class Test {
public static void main(String[] args) {
	ArrayList a1 = new ArrayList <>();
	a1.add(10);
	a1.add("ok");
	a1.add(true);
	a1.add('e');
	a1.add(10);
	a1.add(null);
	System.out.println(a1);//[10,ok,true,e,10,null]
	a1.add(2, 8.5);
	System.out.println(a1);//[10,ok,8.5,true,e,10,null]
	
	ArrayList a2 = new ArrayList<>();
	a2.add(false);
	a2.add(5.4);
	a2.addAll(1, a1);
	System.out.println(a2);//[false, 10, ok, true, e, 5.4]
	
	System.out.println(a2.contains("Ok"));//false
	
	System.out.println(a2.containsAll(a1));//true
	
	System.out.println(a1.indexOf("true"));//-1
	
	System.out.println(a1.remove("ok"));//true
	
    a2.removeAll(a1);
	System.out.println(a2);//[false,ok,5.4]
	
	a2.retainAll(a1);
	System.out.println(a2);//[10,ok,true,e]
	
	a1.clear();
	System.out.println(a1);//[]
	
	a1.remove(1);
	System.out.println(a1);//[10,true,e,10,null]
}
	
}
