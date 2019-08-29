package VarshaT;

public class Asngmt2_Ques11 {
	void Unique(int a[], int b[]) {
		int c[] = new int[a.length + b.length];
		int k = 0, count = 0;
		for (int i = 0; i < a.length; i++) {
			c[k] = a[i];
			k++;
		}
		for (int i = 0; i < b.length; i++) {
			count = 0;
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j])
					count++;

			}
			if (count == 0) {
				c[k] = b[i];
				k++;
			}
		}
		for (int i = 0; i < k; i++)
			System.out.println(c[i]);
	}

	public static void main(String args[]) {
		Asngmt2_Ques11 asngmt2_Ques11 = new Asngmt2_Ques11();
		int a[] = { 1, 3, 6, 9, 7 };
		int b[] = { 2, 5, 6, 9, 8 ,9};
		asngmt2_Ques11.Unique(a, b);
	}

}
