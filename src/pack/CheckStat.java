package pack;

public class CheckStat {
	static int count=0;
	int age=10;
	int roll=22;
CheckStat(){
	count++;
	}

public static int count() {
	return count;
}
public  void fuc() {	
	System.out.println(age);
	System.out.println(roll);
	System.out.println(count);
}


}
