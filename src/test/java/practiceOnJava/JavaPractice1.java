package practiceOnJava;

public class JavaPractice1 {

	public static void main(String[] args) {

		String[] words = { "Ball", "Apple", "Dog", "Cat" };

		String tem;

		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if ((words[i].compareTo(words[j]) > 0)) {
					tem = words[i];
					words[i] = words[j];
					words[j] = tem;
				}
			}
		}

		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}

	}
}
