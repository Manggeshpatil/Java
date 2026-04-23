package Exception;

public class Test6 {
public static void main(String[] args) {
	int a = 45;
	System.out.println(a);//45
	Integer i =Integer.valueOf(a);
	System.out.println(i);//45
	System.out.println("__________________________");
	char ch = 'E';
	System.out.println(ch);//E
	Character j = Character.valueOf(ch);
	System.out.println(j);//E
	System.out.println("----------------------");
	boolean b1 = false;
	System.out.println(b1);//false
	Boolean b2 = Boolean.valueOf(b1);
	System.out.println(b2);//false
	int a2 = i.intValue();
	System.out.println(a2);
	char ch1 = j.charValue();//un-boxing 
	System.out.println(ch1);
}
}
