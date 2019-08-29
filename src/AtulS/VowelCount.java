package AtulS;

public class VowelCount {

	void printVowelCount(String input, char ch) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ch) {
				count = count + 1;
			}
		}
		System.out.println(ch + ":"+count);
	}

	public static void main(String[] args) {
		VowelCount vowelcnt = new VowelCount();
		vowelcnt.printVowelCount("atulShrivastava", 'a');

	}

}
