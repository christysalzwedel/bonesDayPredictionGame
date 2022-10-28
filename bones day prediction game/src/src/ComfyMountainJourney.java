import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ComfyMountainJourney {

    public static void comfyMountainMethod() throws IOException {
        Scanner userInput = new Scanner(System.in);
        String comfyPic = new ImageGenerator().comfyPillow();
        System.out.print(comfyPic);
        System.out.println("Welcome to comfy mountain. You've made it up here on your own!");
        System.out.println("Truly you are worthy of wisdom from our sweet prince. Do you seek his words? (Y/N)");
        String seeker = userInput.nextLine();
        boolean getWisdom = true;
        boolean isVIP = new VIP().VIPMethod();


        if (!seeker.equals(" ")) {
            while (!seeker.equalsIgnoreCase("y") && !seeker.equalsIgnoreCase("n")) {
                System.out.println("Are you weary from your climb? You'll need to enter Y or N.");
                seeker = userInput.nextLine();

            }
            if (seeker.equalsIgnoreCase("y")) {
                getWisdom = true;
            } else if (seeker.equalsIgnoreCase("n")) {
                getWisdom = false;
            }

            }
            ComfyMountain wisdomOutput = new ComfyMountain(getWisdom, isVIP);
            System.out.println(wisdomOutput.getCurrentWisdom());

        }
    }

