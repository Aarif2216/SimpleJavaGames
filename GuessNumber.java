public class GuessNumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int numberToGuess = random.nextInt(100) + 1;
        int userGuess;
        int attempts = 0;
        
        System.out.println("Welcome to 'Guess the Number' game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it.");
        
        do {
            System.out.print("Enter your guess: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
            }
            userGuess = sc.nextInt();
            attempts++;
            
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        } while (userGuess != numberToGuess);
        
        
    }
}
