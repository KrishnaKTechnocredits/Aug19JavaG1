package ShreyaD;

public class Assign3_Q1 {
		void arraysum(int a[]) {
			int p_sum = 0, n_sum = 0;
			int positive_cnt = 0, negative_cnt = 0;

			for (int i = 0; i < a.length; i++) {
				if (a[i] < 0) {
					negative_cnt++;
					n_sum = n_sum + a[i];

				} else {
					positive_cnt++;
					p_sum = p_sum + a[i];
				}
			}
			System.out.println("negative_count"+negative_cnt);
			System.out.println("positive_count"+positive_cnt);
			System.out.println(p_sum);
			System.out.println(n_sum);
			
		}

	public static void main(String []args)
	{
	  int a[]={10,-9,-3,-4,14,19,-23};
	  Assign3_Q1 Q1 = new Assign3_Q1();
	  Q1.arraysum(a);
	}
	}

