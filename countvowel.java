/*import java.util.Scanner;

public class Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        String input2 = scanner.nextLine();

        if (!input.matches("[a-zA-Z]+")) {
            System.out.println("Invalid Input.");
            return;
        }

        int vowelCount = 0;
        StringBuilder consonants = new StringBuilder();
        String vowels = "aeiouAEIOU";

        for (char ch : input.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                vowelCount++;
            } else {
                consonants.append(ch);
            }
        }

        System.out.println("No of Vowels : " + vowelCount);
        System.out.println("Consonants   : " + consonants.toString());
    }
}
