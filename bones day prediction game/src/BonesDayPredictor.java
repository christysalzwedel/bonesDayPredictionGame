import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;
import java.lang.*;

public class BonesDayPredictor {
    public static void main(String[] args) throws FileNotFoundException {
        LocalDate today = LocalDate.now();
        String thisYear = Integer.toString(today.getYear());
        String noodleString = thisYear + "-07-04";
        LocalDate noodleDay = LocalDate.parse(noodleString);
        if (today.isEqual(noodleDay)) {
            System.out.println("OH MY GOSH! IT'S NOODLE'S BIRTHDAY! HAPPY NOODLE DAY EVERYONE!!!");
            String noodleDaySurprise = new SneakyCake().printCake();
            System.out.println(noodleDaySurprise);


        }


        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to the bones day predictor and comfy mountain pilgrimage simulator");
        String boner = new BonePic().throwMeABone();
        System.out.println(boner);

        System.out.println("would you like to see if it is a bones day, or go to comfy mountain?");
        System.out.println("please type B for bones day or C for comfy mountain");
        String whereToGo = userInput.nextLine();

        //this loop should catch inappropriate inputs
        if (!whereToGo.equals("")) {
            while (!whereToGo.equalsIgnoreCase("b") && !whereToGo.equalsIgnoreCase("c")) {
                System.out.println("I'm Sorry. You'll need to type either B or C. Please try again.");
                whereToGo = userInput.nextLine();
            }

            if (whereToGo.equalsIgnoreCase("b")) {
                boolean isItABonesDay = new BonesOrNoBones().BonesDayPrediction();
                if (isItABonesDay) {
                    String bonesDayPug = new BonesPug().goBones();
                    System.out.println(bonesDayPug);
                    System.out.println("It's a bones day!");
                    String commentary = new CommentaryOutputGenerator(true).getCommentString();
                    System.out.println(commentary);

                    //this section allows the user to choose to get wisdom
                    followUpComfyMountain("Would you like to climb Comfy Mountain now? (Y/N)",
                            "I'm sorry. You'll need to use that bones day energy to enter either y or n.",
                            "Okay! Thanks for stopping by! Have a great day!");

                }
            } else {
                String noBonesHere = new NoBonesPug().bonelessPug();
                System.out.print(noBonesHere);
                System.out.println("\n oh... ha ha ha... nope. No bones today.");
                String commentary = new CommentaryOutputGenerator(false).getCommentString();
                System.out.println(commentary);

                //this should allow the user to choose wisdom
                followUpComfyMountain("Would you like to bark for a lift up Comfy Mountain now? (Y/N)",
                        "I know we aren't doing hard things today, but you still need to either enter y or n.",
                        "Okay. Thanks for visiting! Have a super relaxing day! Take care!");

            }

        } else if (whereToGo.equalsIgnoreCase("c")) {
            try {
                comfyMountainMethod();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public static void comfyMountainMethod() throws FileNotFoundException {
        Scanner userInput = new Scanner(System.in);
        String comfyPic = new ComfyMountainPic().comfyPillow();
        System.out.print(comfyPic);
        System.out.println("Welcome to comfy mountain. You've made it up here on your own!");
        System.out.println("Truly you are worthy of wisdom from our sweet prince. Do you seek his words? (Y/N)");
        String seeker = userInput.nextLine();
        boolean getWisdom = true;

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
            ComfyMountain wisdomOutput = new ComfyMountain(getWisdom);
            System.out.println(wisdomOutput.getCurrentWisdom());

        }
    }

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
                comfyMountainMethod();

            } else if (userChoice.equalsIgnoreCase("n")) {
                System.out.println(exitMessage);
            }

        }
    }
}



