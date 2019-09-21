package AtulS;

public class VowelCount {

	void printVowelCount(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a'||input.charAt(i) == 'e'||input.charAt(i) == 'i'||input.charAt(i) == 'o'||input.charAt(i) == 'u') {
				count = count + 1;
			}
		}
		System.out.println("Vowels count in given string is" + ":"+count);
	}

	public static void main(String[] args) {
		VowelCount vowelcnt = new VowelCount();
		vowelcnt.printVowelCount("atulshrivastava");

	}

}
