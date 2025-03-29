import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int sanity = 100;
        String userName;
        boolean DEBUG = true;
        int userChoice;
        int choiceOne = 1;
        int choiceTwo = 2;

        //Defining username from user input
        System.out.println("You remembered your name is: ");
        userName = scnr.nextLine().toString();
        while(userName.isEmpty()){
            System.out.println("You rememberd your name is: ");
            userName = scnr.nextLine().toString();
        }

        if(DEBUG){
            System.out.printf("User name: %s", userName);
        }

        while(sanity > 0){
            //Door Mouse Trial
            System.out.println(""); //Opening context
            userChoice = scnr.nextInt();

            //Request user choice again
            while(userChoice != choiceOne || userChoice != choiceTwo) {
                System.out.print("Please input the number of your choice: ");
                userChoice = scnr.nextInt();
            }

            //Do action on user choice
            if( userChoice == choiceOne){
            System.out.println("");
            } else {
                sanity = sanity - 30;
            }
            

        }
        



        //Beginning of story

        //Trials 1, 2, 3 ...


        
    }
}