import java.util.Scanner;

public class LanguageLearningGame {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("Welcome to the Language Learning Game!");
        System.out.println("Please enter the correct translation for each word.");

        // Define arrays of words and their translations
        String[] words = {"hello", "goodbye", "thank you", "please", "yes", "no"};
        String[] translations = {"hola", "adios", "gracias", "por favor", "si", "no"};

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Iterate through each word and prompt the user for translation
        for (int i = 0; i < words.length; i++) {
            System.out.print("Translate '" + words[i] + "': ");
            String userInput = scanner.nextLine().toLowerCase(); // Convert input to lowercase for case-insensitive comparison

            // Check if the user input matches the correct translation
            if (userInput.equals(translations[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct translation is: " + translations[i]);
            }
        }

        // Game over message
        System.out.println("Game over. Thanks for playing!");
    }
}
