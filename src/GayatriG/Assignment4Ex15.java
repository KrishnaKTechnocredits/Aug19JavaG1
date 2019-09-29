package GayatriG;

public class Assignment4Ex15 {
	static void SttringRevWithUpperCase(String input) {
		String[] newInput = input.split(" ");
		for (int i = newInput.length - 1; i >= 0; i--) {
			if (i == 2) {
				for (int j = newInput[i].length() - 1; j >= 0; j--) {
					System.out.print(newInput[i].toUpperCase().charAt(j));
				}
			} else {
				for (int j = newInput[i].length() - 1; j >= 0; j--) {
					System.out.print(newInput[i].charAt(j));
				}
			}
			System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		String str = "Hi Good Morning All";
		SttringRevWithUpperCase(str);
	}
}
