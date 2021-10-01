import java.util.Scanner;
//      //Use the Scanner class to:
////        //Ask a user for their lucky number
////        //Then ask a user for their name.
////        //Then print out the user's name and lucky number.
////        // For example: Your name is Mikaila and you said your
////        // lucky number is 19
public class Question4 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Whats your lucky number?");
        String number = num.nextLine();

        Scanner name = new Scanner(System.in);
        System.out.println("Whats your name?");
        String names = name.nextLine();

        System.out.println("Your lucky number is \n "+number+""  + "Your name is" + " "+ names);
        }

    }

