package VarshaT;

public class Asngmt2_Ques12 {
	void Unique(int a[], int b[]) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			count = 0;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j])
					count++;

			}
			if (count > 0) {
				System.out.print(a[i]+" ");
			}
		}
		
	}

	public static void main(String args[]) {
		Asngmt2_Ques12 asngmt2_Ques12 = new Asngmt2_Ques12();
		int a[] = { 1, 3, 6, 9, 7};
		int b[] = { 2, 5, 6, 9, 8};
		asngmt2_Ques12.Unique(a, b);
	}

}
