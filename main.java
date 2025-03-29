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
        
        //TRIAL 3 START
        //hatter talks to alice, asks her a question about the weather
        System.out.printf("\nThe focus of the table shifts to the figure sitting at the head. With an unhinged yellow smile, the Hatter passes you a cup of tea. Its murky composition makes you refrain from drinking it.");
        System.out.println("\"SO!\" The Hatter slams his fists on the table with a wild glint in his eye, \"It's a lovely day outside, is it not?\"");
        System.out.println("What do you say? (Enter 1 or 2):\n1.) \"It sure is!\"\n2.) \"No, it's absolutely dreadful!\"");
        userChoice = scnr.nextInt();
        //bad choice
        if(userChoice == choiceOne){
            System.out.printf("\n\"%s, you are as BLIND as a BAT! Can you believe this, Hare?\" The Hatter bewilderdly looks at the March Hare, who is much too focused on trying to fit an entire teacup into his mouth to notice or care.", userName);
            System.out.println("The Hatter picks up a saucer and breaks it over the table. The shards fly into the air, one narrowly missing your hands as they shield your face.");
        }
        //good choice
        else{
            System.out.println("\"Absolutely! Isn't it wonderful?\" The Hatter concurs happily, batting his eyelashes whilst looking directly at the sun shining in the cloudless green sky.");
        }


        //hatter asks alice about her opinion on something
        System.out.println("\n\"Where did you say you were from?\" The Hatter turns to look at you so quickly that his neck cracks slightly.");
        System.out.println("What do you say? (enter either 1 or 2):\n1.) \"Not here.\"\n2.) \"Oh, I'm from England.\"");
        userChoice = scnr.nextInt();
        //bad choice
        if(userChoice == choiceTwo){
            System.out.println("\"PREPOSTEROUS, WE DO NOT TOLERATE EXPLICATIVES AT THIS TABLE! MIND YOUR MANNERS!\" The Hatter downs an entire teacup of boiling tea, shaking his head angrily as he does so.");
        }
        //good choice
        else{
            System.out.println("\"You're from Not Nere? Well, what a coincidence. So is my cousin!\" The Hatter shakes his head as he laughs jauntily. \"If I had a cousin, I mean.\" The Hatter then proceeds to sneeze without covering his mouth.");
        }

        //hatter gets into a spat with the March Hare
        System.out.println("\nThe Hatter adjusts his hat as he calms down.\n\"Now. SOMEONE needs to apologize today. SOMEONE... who CHEWED on my SHOES.\" The Hatter grumbles as he glares at the March Hare.");
        System.out.println("\"I haven't the foggiest idea as to what you're talking about.\" The March Hare sleepily yawns. He puts his head down, narrowly missing the teapot that the Hatter hurls at him.");
        System.out.println("\"ALICE!!!!! ALICE TELL HIM HE'S WRONGNGNGHHHHH!\" The Hatter wails as he rolls around on the ground, slamming his fists on the dirt.");
        System.out.println("What do you say? (enter either 1 or 2):\n1.)\"The Hatter is right, Hare you must apologize at ONCE.\" \n2.)\"Hatter, your shoes are in pristine condition.\"");
        userChoice = scnr.nextInt();
        //bad choice
        if(userChoice == choiceTwo){
            System.out.println("\"EVERYONE IS SO MEAN TO ME. WHY HAVE A TEAPARTY IF NONE OF US WILL REMEMBER IT FONDLY?\" The Hatter rips off his shoe and throws it onto the table, smushing a plate of untouched teabiscuits. A shame, really. You were going to eat those.");
        }
        //good choice
        else{
            System.out.println("The March Hare wasn't listening and does not apologize. The Hatter, however, crawls off the ground and wipes his tears as he collects himself. \n\"At least,\" he whispers, \"I have ONE good friend to stick by my side.\"");
        }
        
        //BOSS QUESTION
        System.out.printf("\n\"%s, I would like to ask you something.\" The Hatter laments, sitting back down at the table and lacing his fingers together. He looks around, as if he wants to ensure nobody else is listening (despite being at the head of a table at a party with several people in attendance).", userName);
        System.out.println("Why is a RAVEN like a WRIITNG DESK?");
        System.out.println("What do you say? (enter either 1 or 2):\n1.)\"They both involve feathers-- the raven grows them and the desk uses them in the form of quills.\" \n2.)\"I don't know.\"");
        userChoice = scnr.nextInt();
        //bad choice
        if(userChoice == choiceOne){
            System.out.println("The Hatter's inquisitive grimace turns to a dreadful frown. He stands up, towering over you, before grabbing his dingy metal chair and hurling it at you.");
            System.out.println("\"OUTTTTTTTTT! YOU DO NOT BELONG IN THE KINGDOM OF SUNSHINE AS A WORM MOROSELY CRAWLING ACROSS THE PAVEMENT OF MY LIFE! AWAY! AWAY WITH YOU!\" He shrieks, commencing to chase you away from the party. He gets smaller and smaller every time you look over your shoulder until he's out of sight completely.");
        }
        //good choice
        else{
            System.out.println("\"The beautiful thing, my friend,\" The hatter looks to the sun once more, happy tears filling his eyes, \"is that I don't know either.\"");
            System.out.println("He hands you a lovely sealed bag of teacakes before bidding you farewell. You walk away from the party, the sounds of laughing and dishes breaking trailing further away into the distance.");
        }

        //statement the user gets if they were able to survive the trial
        System.out.println("For better or for worse, you have successfully left the teaparty.");


        
    }
}