package mytask;

public class Branch {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	//<if文>課題１
		int jScore =80;
		int mScore =42;
		System.out.println( jScore + mScore );
		if (jScore <40 || mScore <40) {
			System.out.println("追試");
		}
		else if(jScore + mScore >160) {
			System.out.println("優");
		}
		else if (jScore + mScore >140) {
			System.out.println("良");
		}
		else if (jScore + mScore > 100) {
			System.out.println("可");
		}
		else {
			System.out.println("追試");
		}




//2-1
int i = 24;
if (i % 2 == 0) {
	System.out.println("偶数");
}
else {
	System.out.println("奇数");
	}
//2-2
int number = -14;
if (number % 2 == 0 && number >0) {
	System.out.println("正の偶数");
}
else if (number % 2 == 0 && number <0) {
	System.out.println("負の偶数");
}
else if (number % 2 != 0 && number > 0) {
	System.out.println("正の奇数");
}
else {
	System.out.println("負の奇数");
}

}
}