package VarshaT;

public class Asngmt2_Ques14 {
	void Even(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				System.out.print(a[i] + " ");
		}

	}

	public static void main(String[] args) {
		int a[] = { 15, 24, 52, 49, 62, 10 };
		Asngmt2_Ques14 asngmt2_Ques14 = new Asngmt2_Ques14();
		asngmt2_Ques14.Even(a);

	}

}
