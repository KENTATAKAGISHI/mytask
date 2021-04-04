package mytask;

public class bmi {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
double weight = 70.0;
double height = 1.7;
double bmi = weight / height /height;
System.out.println(bmi);
int Bmi = 24;

if (Bmi < 18) {
	System.out.println("低体重");
}
else if ( Bmi < 25  ) {
	System.out.println("普通");
}
else {
	System.out.println("肥満");
}



	}

}
