import java.util.Random;
import java.util.Scanner;

public class rockPaperGame {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Random random = new Random();

        String[] choices ={"rock", "paper", "Scissors"};
        String playerChoice;
        String computerChoice;
        String  playAgain ="yes";

        //1 Method

//        do{
//            System.out.print("Enter your Move(rock , paper, scissors):  ");
//            playerChoice = obj.nextLine().toLowerCase();
//
//            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && playerChoice.equals("Scissors")){
//                System.out.println("Invalid choice");
//            }
//            computerChoice = choices[random.nextInt(3)];
//            System.out.println("Computer Choices: "+computerChoice);
//
//            if(playerChoice == computerChoice){
//                System.out.println("It is a tie!");
//            }
//            else if(playerChoice.equals("rock")&& computerChoice.equals("scissors")){
//                System.out.println("You Win!");
//            }
//            else if(playerChoice.equals("paper")&& computerChoice.equals("rock")){
//                System.out.println("Your win!");
//            }
//            else if(playerChoice.equals("Scissors")&& computerChoice.equals("paper")){
//                System.out.println("Your win!");
//            }
//            else{
//                System.out.println("You lose!");
//            }
//            System.out.println("Play again (yes/no): ");
//            playAgain = obj.nextLine().toLowerCase();
//        }while(playAgain.equals("yes"));


        //2 Method

        do{
            System.out.print("Enter your Move(rock , paper, scissors):  ");
            playerChoice = obj.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && playerChoice.equals("Scissors")){
                System.out.println("Invalid choice");
            }
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer Choices: "+computerChoice);

            if(playerChoice == computerChoice){
                System.out.println("It is a tie!");
            }
            else if((playerChoice.equals("rock")&& computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper")&& computerChoice.equals("rock")) ||
                            playerChoice.equals("Scissors")&& computerChoice.equals("paper")){

                System.out.println("You Win!");
            }
            else{
                System.out.println("You lose!");
            }
            System.out.print("Play again (yes/no): ");
            playAgain = obj.nextLine().toLowerCase();
        }while(playAgain.equals("yes"));


        System.out.println("Thanks for playing ");
        obj.close();
    }
}
