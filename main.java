import java.util.Scanner;
public class main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
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
        
        //TRIAL 3 START
        //hatter talks to alice, asks her a question
        System.out.println("\nThe focus of the table shifts to the figure sitting at the head. With an unhinged yellow smile, the hatter passes you a cup of tea. Its murky composition makes you refrain from drinking it.");
        System.out.println("\"SO!\" The hatter slams his fists on the table with a wild glint in his eye, \"It's a lovely day outside, is it not?\"");
        System.out.println("\nWhat do you say? (Enter 1 or 2):\n1.) \"It sure is.\"\n2.) \"No, it's absolutely dreadful.\"");
        userChoice = scnr.nextInt();
        if(userChoice == choiceOne){
            System.out.println("\nWRONG");
        }
        else{
            System.out.println("\"Absolutely! Isn't it wonderful?\" The hatter concurs happily, batting his eyelashes whilst looking directly at the sun.");
        }


        //hatter asks alice about something
        //correct: agrees heartily
        //incorrect: -5 sanity

        //hatter gets into a spat with another guest at the table
        //correct (alice sides with hatter): Hatter's like "I KNEW I could ALWAYS trust you buddy"
        //incorrect (alice either doesn't pick a side or chooses the other guest's side): -10 sanity

        //Boss question: Why is a raven like a writing desk?
        //correct (I don't know): Hatter says "I don't know either! Go find out" (alice gets to leave)
        //incorrect (they both have quills): hatter throws a chair at her lmao (alice either dies or gets kicked out)

        System.out.println("\nIt can see my input!");


        
    }
}
