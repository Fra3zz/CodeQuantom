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
        int choiceOne = 1;

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

            int choice = scanner.nextInt();
            if(choice == 1){
                    if (!hasKey) {
                    System.out.println("\nYou pick up the tiny golden key. Maybe it opens something?");
                    hasKey = true;
                    }
                    System.out.println("The door is too small to enter.  You notice a bottle labeled 'DRINK ME' nearby next to a cake labeled 'EAT ME'. Which do you take? (drink/cake) ");
                    String drinkChoice = scanner.next();
                    if (drinkChoice.equalsIgnoreCase("drink")) {
                        System.out.println("\nYou shrink to a tiny size! Now you can explore the rest of Wonderland. ");
                        hasDrink = true;
                    }else if(drinkChoice.equalsIgnoreCase("cake")) {
                        System.out.println("\nYou start growing filling the once large room. Try the drink? (yes/no) ");
                        drinkChoice = scanner.next();
                        if(drinkChoice.equalsIgnoreCase("yes")){
                          System.out.println("\nYou shrink to a tiny size! Now you can enter the door.");
                          hasDrink = true;
                        }else{
                            System.out.println("There is nothing here for you. ");
                        }
                    }
 
        

        //Trials 1, 2, 3 ...
        
        //TRIAL 3 START
        //hatter talks to alice, asks her a question about the weather
        
       
        }
            }
        }
    }

