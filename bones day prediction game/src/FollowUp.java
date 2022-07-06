import java.io.FileNotFoundException;
import java.util.Scanner;

public class FollowUp {

    public static void followUpComfyMountain(String message, String badEntryMessage, String exitMessage) throws FileNotFoundException {
        Scanner userInput = new Scanner(System.in);
        //this method allows the user to continue to comfy mountain after a bones day prediction

        System.out.println(message);
        String userChoice = userInput.nextLine();
        if (!userChoice.equals("")) {
            while (!userChoice.equalsIgnoreCase("y") && !userChoice.equalsIgnoreCase("n")) {
                System.out.println(badEntryMessage);
            }
            if (userChoice.equalsIgnoreCase("y")) {
                ComfyMountainJourney.comfyMountainMethod();

            } else if (userChoice.equalsIgnoreCase("n")) {
                System.out.println(exitMessage);
            }

        }
    }
}
