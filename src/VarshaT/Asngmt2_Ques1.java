package VarshaT;

public class Asngmt2_Ques1 {
	void missing(int a[], int b[]) {

		for (int i = 0; i < a.length; i++) {
			int flag = 0;
			for (int j = 0; j < b.length; j++) {
				if (a[i]==b[j]) {
					flag++;
					break;
				}
			}
			if (flag == 0)
				System.out.println(a[i] + "is missing");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asngmt2_Ques1 asngmt2_Ques1 = new Asngmt2_Ques1();
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,10 };
		int b[] = { 1, 2, 4, 6, 4, 3 };
		asngmt2_Ques1.missing(a, b);

	}

}
