import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Texas a land of Adventure!");
        System.out.println("You find yourself falling down a very deep rabbit hole... ");
        System.out.println("After what feels like hours, you land softly on pile of leaves.");

        boolean hasKey = false;
        boolean hasCake = false;
        boolean hasDrink = false;
        boolean metCheshire = false;

        while (true) {
            System.out.println("\nYou see several paths:");
            System.out.println("1. Trying to remember your name");
            System.out.println("2. A garden with a talking roadrunner on a bluebonnet");
            System.out.println("3. A tea party with the Mad Cowboy Hatter and March Hare");
            System.out.println("4. The Cheshire Cat's tree");
            System.out.println("5. Try to wake up from this dream");
            System.out.print("Where would you like to go (1-5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (hasKey) {
                        System.out.println("\nYou pick up several names. Maybe it opens something?");
                        hasKey = true;
                    } else {
                        System.out.println("\nThe table is empty now.  You already have the key. ");
                    }
                    System.out.println("Thh door is too small to enter.  You notice a bottle labeled 'DRINK ME' nearby.");
                    String drinkChoice = scanner.next();
                    if (drinkChoice.equalsIgnoreCase("yes")) {
                        System.out.println("\nYou shrink to a tiny size! Now you can enter the door.");
                        hasDrink = true;
                    } else {
                        System.out.println("\nYou remain your current size.");
                    }
                    break;
                case 2:
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
                    break;
                case 3:
                    System.out.println("\nThe Mad Cowboy Hatter shouts No room! No room! but there's plenty of room.");
                    System.out.println("The March Hare offers you tea but there's none in the pot. ");
                    System.out.println("They ask you a riddle: 'Why is a raven like a writing desk?'");
                    System.out.println("Do you want to try answering? (yes/no)");
                    String riddleChoice = scanner.next();
                    if (riddleChoice.equalsIgnoreCase("yes")) {
                        System.out.println("\nWhatever you answer, the Hatter Cowboy says: Wrong! Nobody knows the answer!'");
                        System.out.println("They both laugh hysterically and throw tea cups in the air.");
                    } else {
                        System.out.println("\nThe Hatter sighs. 'Nobody ever wants to play with us.'");
                    }
                    break;

                case 4:
                    if (metCheshire) {
                        System.out.println("\nA grin appears in the air, followed by the rest of the Cheshire Cat.");
                        System.out.println("'We're all mad here,' says the car. 'You must be mad too or you wouldn't have come.'");
                        System.out.println("The cat disappears slowly, leaving only its grin floating in the air.");
                        metCheshire = true;
                    } else {
                        System.out.println("\nThe floating grin remains.  You hear a voice. 'Imagination is the only weapon in the war againsy reality,'");
                    }
                    break;

                case 5:
                    System.out.println("\nYou pinch yourself and suddenly wake up in a field of bluebonnets.");
                    System.out.println("Your sister is nearby, asking if you had a nice nap.");
                    System.out.println("Was it all a dream?");
                    System.out.println("\nTHE END");
                    scanner.close();
                    return;

                default:
                    System.out.println("\nThat's not a valid choice in Texas land!");
            }
        if (hasKey && hasDrink && hasCake && metCheshire) {
            System.out.println("\nYou hear the Queen of Hearts shouting: 'Off with their heads!'");
            System.out.println("The Cheshire Cat reappears: I think it's time you woke up now.'");
            System.out.println("Everything starts fading around you ...");
            System.out.println("\nYou wake up with a start, back in the real world.");
            System.out.println("THE END - You've completed your Journey to Texas!");
            scanner.close();
            return;
            }
        }
    }
}

