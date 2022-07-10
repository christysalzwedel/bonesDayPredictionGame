import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;
import java.lang.*;

public class BonesDayPredictor {
    public static void main(String[] args) throws IOException {
        Scanner userInput = new Scanner(System.in);
        boolean isVIP = new VIP().VIPMethod();
        LocalDate today = LocalDate.now();
        String thisYear = Integer.toString(today.getYear());
        String noodleString = thisYear + "-07-04";
        LocalDate noodleDay = LocalDate.parse(noodleString);
        if (today.isEqual(noodleDay)) {
            System.out.println("OH MY GOSH! IT'S NOODLE'S BIRTHDAY! HAPPY NOODLE DAY EVERYONE!!!");
            String noodleDaySurprise = new ImageGenerator().printCake();
            System.out.println(noodleDaySurprise);

            // System.out.println("Press enter to continue");


        }
        if (isVIP) {
            System.out.println("Hello VIP! Noodle Loves you!");
        } else {
            System.out.println("Hello there!");
        }


        System.out.println("Welcome to the bones day predictor and comfy mountain pilgrimage simulator");
        String boner = new ImageGenerator().throwMeABone();
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
                    if (isVIP) {
                        boolean isItASuperBonesDay = new BonesOrNoBones().VIPBonesDay();
                        if (isItASuperBonesDay) {
                            String superBonesDay = new ImageGenerator().SuperBones();
                            System.out.print(superBonesDay);
                            FollowUp.followUpComfyMountain("Do you want to use those super bones to dash up comfy mountain?", "I know super bones days are exciting, but I need you to focus: y or n", "Alrighty! Have the most amazing day ever!");
                        } else {
                            String bonesDayPug = new ImageGenerator().goBones();
                            System.out.println(bonesDayPug);
                            System.out.println("It's a bones day!");
                            String commentary = new CommentaryOutputGenerator(true).getCommentString();
                            System.out.println(commentary);
                            LogMaker log = new LogMaker("It is a bones day");


                            //this section allows the user to choose to get wisdom
                            FollowUp.followUpComfyMountain("Would you like to climb Comfy Mountain now? (Y/N)",
                                    "I'm sorry. You'll need to use that bones day energy to enter either y or n.",
                                    "Okay! Thanks for stopping by! Have a great day!");
                        }


                    }
                }else {
                        String noBonesHere = new ImageGenerator().bonelessPug();
                        System.out.print(noBonesHere);
                        System.out.println("\n oh... ha ha ha... nope. No bones today.");
                        String commentary = new CommentaryOutputGenerator(false).getCommentString();
                        System.out.println(commentary);
                        LogMaker log = new LogMaker("It is a no bones day");

                        //this should allow the user to choose wisdom
                        FollowUp.followUpComfyMountain("Would you like to bark for a lift up Comfy Mountain now? (Y/N)",
                                "I know we aren't doing hard things today, but you still need to either enter y or n.",
                                "Okay. Thanks for visiting! Have a super relaxing day! Take care!");

                    }

                } else if (whereToGo.equalsIgnoreCase("c")) {
                    try {
                        ComfyMountainJourney.comfyMountainMethod();
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                }
            }


        }
    }





