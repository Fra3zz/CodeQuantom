import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int sanity = 100;
        String userName;
        boolean DEBUG = true;

        //Defining username from user input
        System.out.println("You remembered your name is: ");
        userName = scnr.nextLine().toString();
        while(userName.isEmpty()){
            System.out.println("You rememberd your name is: ");
            userName = scnr.nextLine().toString();
        }

        if(DEBUG){
            System.out.println(userName);
        }



        //Beginning of story

        //Trials 1, 2, 3 ...


        
    }
}