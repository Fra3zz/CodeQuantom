import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Alice's Adventure is Wonderland!");
        System.out.println("You find yourself falling down a very deep rabbit hole... ");
        System.out.println("After what feels like hours, you land softly on pile of leaves.");

        boolean hasKey = false;
        boolean hasCake = false;
        boolean hasDrink = false;
        boolean metCheshire = false;
        int sanity = 100;
        String userName;
        int userChoice;

        //Define username
        System.out.println("Please input your name: ");
        userName = scanner.nextLine().toString();
        while (userName.isBlank()){
            System.out.println("Please input your name: ");
            userName = scanner.nextLine().toString();
        }
        

        while (true) {
            System.out.println("\nYou see several paths:");
            System.out.println("1. A small door with a tiny golden key on a table");//Done
            System.out.println("2. A garden with a talking caterpillar on a mushroom");
            System.out.println("3. A tea party with the Mad Hatter and March Hare"); //Done
            System.out.println("4. The Cheshire Cat's tree");
            System.out.println("5. Try to wake up from this dream");
            System.out.print("Where would you like to go (1-5):");


            //Level 1
            int choice = scanner.nextInt();
                    if (!hasKey) {
                    System.out.println("\nYou pick up the tiny golden key. Maybe it opens something?");
                    hasKey = true;
                    } else {
                        System.out.println("\nThe table is empty.");
                    }
                    System.out.println("The door is too small to enter.  You notice a bottle labeled 'DRINK ME' nearby.");
                    String drinkChoice = scanner.next();
                    if (drinkChoice.equalsIgnoreCase("yes")) {
                        System.out.println("\nYou shrink to a tiny size! Now you can enter the door.");
                        hasDrink = true;
                    } else {
                        System.out.println("\nYou remain your current size.");
                    }
                    

        //Level 2
        if(choice == 2){
            System.out.println("\nThe caterpillar blows smoke rings at you and asks: 'Who...are...you?'");
        System.out.println("Nearby you see mushroom with one side labeled 'EAT Me'");
        System.out.println("Would you like to eat some mushroom? (yes/no)");
        String eatChoice = scanner.next();
        if (eatChoice.equalsIgnoreCase("yes")) {
            System.out.println("\nYou grow to an enormous size! Birds are now at eye level.");
            System.out.println("A cake labeled 'EAT ME' falls from a tree. You pick it up.");
            hasCake = true;
        } else {
            System.out.println("\nThe caterpillar shrugs and continues smoking.");
        }
        }
        
        //TRIAL 3 START
        //hatter talks to alice, asks her a question about the weather
        System.out.printf("\nThe focus of the table shifts to the figure sitting at the head. With an unhinged yellow smile, the Hatter passes you a cup of tea. Its murky composition makes you refrain from drinking it.");
        System.out.println("\"SO!\" The Hatter slams his fists on the table with a wild glint in his eye, \"It's a lovely day outside, is it not?\"");
        System.out.println("What do you say? (Enter 1 or 2):\n1.) \"It sure is!\"\n2.) \"No, it's absolutely dreadful!\"");
        choice = scanner.nextInt();
        //bad choice
        if(choice == 1){
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
        choice = scanner.nextInt();
        //bad choice
        if(choice == 2){
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
        userChoice = scanner.nextInt();
        //bad choice
        if(userChoice == 2){
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
        userChoice = scanner.nextInt();
        //bad choice
        if(userChoice == 1){
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


        //Level 4
        if(choice == 4){
            //level 4
            if (metCheshire) {
                System.out.println("\nA grin appears in the air, followed by the rest of the Cheshire Cat.");
                System.out.println("'We're all mad here,' says the car. 'You must be mad too or you wouldn't have come.'");
                System.out.println("The cat disappears slowly, leaving only its grin floating in the air.");
                metCheshire = true;
            } else {
                System.out.println("\nThe floating grin remains.  You hear a voice. 'Imagination is the only weapon in the war againsy reality,'");
            }
        }

        //Level 5 Final
        if(choice == 5){
            //level 5
            System.out.println("\nYou pinch yourself and suddenly wake up in a field of bluebonnets.");
            System.out.println("Your sister is nearby, asking if you had a nice nap.");
            System.out.println("Was it all a dream?");
            System.out.println("\nTHE END");
            scanner.close();
            return;
        }
            }
        }
    }
