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
            System.out.print("                                                                                \n" +
                    "                                        ^                                       \n" +
                    "                           :#&^       :&@&~       :B&~                          \n" +
                    "                          J@BG@5     !@#.P@Y     ?@BP@P                         \n" +
                    "                         !@G  J@Y    @@.  &@.   !@G  J@Y                        \n" +
                    "                         ~@#~^G@J    ?@#5B@5    ~@#~^G@J                        \n" +
                    "                          .YGB5:      ^JPY~      .YGB5^                         \n" +
                    "                          P#BB#G     !@&G#@5     5#BB#G                         \n" +
                    "                          @@:.&@.    7@Y ~@P     &@^.&@.                        \n" +
                    "                          &@  &@.    J@Y ~@P     &@  #@.                        \n" +
                    "                        .~@@  &@#####&@J ~@@#####@@  #@7.                       \n" +
                    "                     7B&#B@@^.&@^..  ?@#JB@P  ...@@^.&@##&BJ.                   \n" +
                    "                    P@#:  YBBB#G     .7???7.     5#BBBG  .P@#                   \n" +
                    "                    B@&#BPJ7~^...               ...:~7?5B#&@&                   \n" +
                    "                    B@^^@@#YGBB###&&#########&&&###BGYG@@!.@&                   \n" +
                    "                    B@&&B&@~     G@@7.......!@@#.    :&@B&#@&                   \n" +
                    "                    B@7   Y&&G5P&&?G@G!:.:~G@B7&&G5P#@P.  ^@&                   \n" +
                    "                 ^JG@@:     :!7!:   .JGBBBGJ:   .~7!:      @@BY~.               \n" +
                    "               J&#Y~?&&5!:.                           .:~Y#@Y~JB@P              \n" +
                    "              .@@?.   :?PB###BGP5YYJ??77777??JJY5PGB###BGJ^    !@@~             \n" +
                    "              .@@B&#GY7~:...::^~!77?JJJYYYJJJ??7!~^::...:^7JG#&B&@~             \n" +
                    "              .@&  .&@GPB####BBGGPP55YYYYYYY55PPGGBB####BGP@@^  P@~             \n" +
                    "              .@& .5@@5     ...:&@P^!!!!7!!!!^5@@^...     !@@G. G@~             \n" +
                    "              .@@#&B~5@G.      7@@&.          &@@Y       Y@B~G&#@@~             \n" +
                    "              .@&     ^#@BJ775&@J^&@5:     :5@&^7&&P?7JG&&!     G@~             \n" +
                    "              .@@^      .~J55J^    ^P#&###&#P^    ^?Y5J!.      :&@:             \n" +
                    "               .5&&B5?~:.               .               .:^75B&&P:              \n" +
                    "                  .^?5GB####BBGP5YYJJ???7???JJYY5PGGB#####G5?~.                 \n" +
                    "                          ..:^~!!7?JJYYYYYYYJJ?77!~^:..                         \n" +
                    "                                                                                ");

        }


        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to the bones day predictor and comfy mountain pilgrimage simulator");
        System.out.print("...........     .....     ..............................................      .....     ..........." + "\n" +
                ".........  .~JPBB###BG57^   ..........................................   :!YGB###BBGY!:   ......... " + "\n" +
                ".......  :J#&GJ7~^^^~75B&G7. ........................................  ~5&&GJ!~^^^!?5#&P~  ........ " + "\n" +
                "......  7&@J:           ~P@G^ ...................................... .Y@&?:          .!G@5. ....... " + "\n" +
                ".....  ?@#^   .........   7@&^                                      .P@G:   .........   J@G. ...... " + "\n" +
                "..... :&@~ ..............  J@P.::::::::::::::::::::::::::::::::::::.?@&: ..............  5@J ......" + "\n" +
                "..... !@#. ............... ^&&######################################&@5  ............... 7@P  ....." + "\n" +
                "..... ^@@^ ...............  ::^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^::. ...............  5@Y  ....." + "\n" +
                ".....  J@B:  ..............                                            ..............   7@B: ......" + "\n" +
                "......  ?&&?:  ..................................................................... .~P@G: ......." + "\n" +
                ".......  !@@G. ..................................................................... ?@@P. ........" + "\n" +
                "......  J@#7.  ..................................................................... .!G@G: ......." + "\n" +
                ".....  J@P.  ..............                                            ..............   Y@#: ......" + "\n" +
                "..... ^@&: ............... .^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^. ...............  B@Y  ....." + "\n" +
                "..... !@B  ............... !@@######################################&@J ................ Y@G  ....." + "\n" +
                "..... :&&^ ..............  5@P......................................!@B. .............. .B@J  ....." + "\n" +
                "...... ?@B:   .........   ?@#^                                       5@5.   ........   .P@G. ......" + "\n" +
                "......  7&&J:          .!G@G^ ......................................  J@#7.          .7#@5. ......." + "\n" +
                ".......  :J#&GY7~^^~!?5#&G!  ........................................  ^Y##PJ!~^^~!JP&&P~  ........" + "\n" +
                ".........  .~?PGBB#BBG57:   ...........................................  .~JPGBBBBBPY!:   ........." + "\n" +
                "...........     .....     ...............................................     ....      ..........." + "\n" +
                "..............        ......................................................        ..............." + "\n");
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
                    System.out.print("                              .^^~!!!!JJ!~:.                             \n" +
                            "                              ^!~~7YPPYPY77!!?J?!~7?7!:                         \n" +
                            "                           :YBPJ@P7!:  .J      .^!. .:^!~                       \n" +
                            "                          J&P^ J@^    . 5^ ?: ^:..?~   ~@~                      \n" +
                            "                       .?BB!  J@! .~^ !^?~.Y:J&PG5P&: ^#P.                      \n" +
                            "                      :#G~  ^G#~^YP#P5J..~~~~BGYBBBBYY#Y.                       \n" +
                            "                       ~7: ^@P :&BBB?#?!BBBGPG@##P~ !&~                         \n" +
                            "                        .!?##P  ~G#GB@@@#&@&@@@@@7   5J                         \n" +
                            "                          ::7&.  .^7&@@@@@GPBB@@@@B^ JB                         \n" +
                            "                            JB   75@@@@@BJ5::!&@@@B: ^G:                        \n" +
                            "                            5B   !G#@@@GY#@&&@@@B7    :5:                       \n" +
                            "                           J@7 .^: .!5B&@@@@@@B!.      ^P.                      \n" +
                            "                          !@7  .^:^~^^~7JP#B5!.         ~5                      \n" +
                            "                          !#    ^~^::^~~!??.            .BY                     \n" +
                            "                          ~&~     .^~!7777~            ^P!P!                    \n" +
                            "                          PB^^:.                     :J5^ ^B.                   \n" +
                            "                          BY  .^~~~~^.            .~JY!    B?                   \n" +
                            "                         .#J      .:^~~^^:.  .  !JY?^      G5                   \n" +
                            "                         ~&^  .       .:^~:    .^:    .!5?.&J                   \n" +
                            "                         ^&:                    :^!7?YYJ~ J@:                   \n" +
                            "                         ^@^                    :^^^:.   ^@J                    \n" +
                            "                         G#:                             J#                     \n" +
                            "                        J@^:!        .~.          ^7~:   ^B.                    \n" +
                            "                      7BG!  !J      :#G:        .YPJ#!    P?                    \n" +
                            "                    .G#!     JY     Y#.          . ~~     ?G                    \n" +
                            "                    ^@^      :#^    5P     :.      #P     ?#                    \n" +
                            "                    J@:   ^.  B?    PP    .G:     55G^    ?#                    \n" +
                            "                  ^B#!    .^:.5P    B5    7G    ^GJ !P    ?#                    \n" +
                            "                 .#G.       .:JB   .&?   .#!  :YG~   JJ   7#.                   \n" +
                            "                 ~@:          ^&:  .&!  .G5 ^YP7      P~  ^&:                   \n" +
                            "                 P#.          .#!   #7.7#5  7!       .YB   B7                   \n" +
                            "            .!??P#~::::        GJ   Y5.#!       :^~!!JJ&^  ~G                   \n" +
                            "            G#JJ!^~^~GY:...... BP   .5P5 ..:^^7Y?!7Y!:5@^   !J^.                \n" +
                            "            ^7YYJPY5GJ!!?JJJJY#&7^ ^7:!55YYYYJ????J5P5GG?  : :J77:              \n" +
                            "               .....         ^@5?5~JG?.?B.              P77PG~5B&B.             \n" +
                            "                              ^J5PP5PPY5J.               ^7??777!^              \n" +
                            "                                                                       ");
                    System.out.println("It's a bones day!");
                    String commentary = new CommentaryOutputGenerator(true).getCommentString();
                    System.out.println(commentary);

                    //this section allows the user to choose to get wisdom
                    followUpComfyMountain("Would you like to climb Comfy Mountain now? (Y/N)",
                            "I'm sorry. You'll need to use that bones day energy to enter either y or n.",
                            "Okay! Thanks for stopping by! Have a great day!");

                }
            } else {
                System.out.print("                                                                               \n" +
                        "                                                                                \n" +
                        "                       .~~~:     .~?JJ7^                                        \n" +
                        "                    .^55~:^?#&BGPJ~.  .~5#YJJYJJ?7~^:.                          \n" +
                        "              .^?JP&&5:   ^7?Y#&&G?!.    !P7^....:^!?JY55YY?!^.                 \n" +
                        "    .^~!!~~!JY?~.^#^       ^G@#?.          ^?Y5Y?!:       ..^7YPY^              \n" +
                        " .75J!^^^^:.   . PY    .^Y&@&!.                 .~?Y5J^.        :JG!            \n" +
                        "JY~           ^..&.  ~B&&#BPJ!~.                     .:~7:         PP           \n" +
                        ":   !        !:~#~  5P:    :^^:...                      .:!7^       5P          \n" +
                        "   :~       Y.YG .:^J    :7~........                       .:^:.     GJ         \n" +
                        "   J:      P.!# :Y7:     .          ....   ..                 :7Y?:   #^        \n" +
                        "   G      57 G57B&@^    ^?PBBGG5~     .:57  J^   ^               :YG. ^#        \n" +
                        "  .B     ~B  .?5@@#     ...:@@@@@&^     :&. .#  J7   .:..          ~&. P~       \n" +
                        "  .B     #~    P@B     .^~!!&@@@@@@7     #J !& ~B :77^..         :. Y& .G       \n" +
                        "  .#     &.    G@:          .:!55.!#.    PB.&^.&^~^   ..         .P  #P ?^      \n" +
                        "   #.    B?     B#     .^^:.          .^^: !5 .?!!!??~...         5P  GG?5      \n" +
                        "   !G    !#      &^   ?Y^~7J5Y?!^..!P7.   .   :~~^^~~!!.       ^  :@B  .?GG!    \n" +
                        "    !G:  .&.     P^~ 7:       :!YB@@G??YP#&     ......^YP!     ^P .@@&.   .Y#~  \n" +
                        "     .JY: #~     :&~              #5?Y~ :B@#.  :         7P!    :#&@@@7     :@~ \n" +
                        "        ~~GY     .@#                :^. . ^&@Y :BP55Y?!^   !P    ^@@@?       BG \n" +
                        "    .^!7?JPGJYJYYY&@&Y:.^~7J?J?!:   :~ .@: J@@. .P@@@@@@@7  ^     7@G       .@~ \n" +
                        "7JJJ7~:..          .:755Y?J&@&7YY5YP&P  JPP&@@:   ~B@@&J?@~       Y@@       P#  \n" +
                        ".                       .:!Y&&7Y: .7#&^      5@^    .Y?  .~ ..:~P@@@@?~^:.  @!  \n" +
                        "                             .!5#P:  ?@G      Y@.    .!??Y55YJ?7!~^^^~!7?Y55&BJ?\n" +
                        "                                 :?Y5BGBJ      G&~J55Y7~:.                    .:\n" +
                        "                                   .^?YYJ~^!7JYYY!:                             \n" +
                        "                                      .::::..                                   ");
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

        System.out.print("                                      .G&!                                      \n" +
                "                                     Y@@@@#:                                    \n" +
                "                                   .P##@@#GB~                                   \n" +
                "                                      .@@7                                      \n" +
                "                                      :@@?                                      \n" +
                "                                      :@@?                                      \n" +
                "                                       B#~                                      \n" +
                "         .75GGPJ^     !YPGPY~   .555555^   ?55555Y  Y5555555?:555J  ?555~       \n" +
                "        7@@@@@@@@#. ~@@@@@@@@@^ ~@@@@@@#  .@@@@@@@  @@@@@@@@&.@@@@: @@@@:       \n" +
                "       .@@@@J^@@@@5 &@@@G:#@@@& ^@@@@@@@. 7@@@@@@@  @@@@B???! J@@@J!@@@G        \n" +
                "       ^@@@@. #@@@G @@@@~ Y@@@& ^@@@@@@@! G@@@@@@@  @@@@?      @@@&#@@@.        \n" +
                "       ^@@@@. ?PPP! @@@@! Y@@@& ^@@@B&@@G @@@G@@@@  @@@@@&&&Y  J@@@@@@P         \n" +
                "       ^@@@@.       @@@@! Y@@@& ^@@@GJ@@&~@@@!@@@@  @@@@@@@@P   @@@@@@.         \n" +
                "       ^@@@@. ?PPP7 @@@@! Y@@@& ^@@@G.@@@&@@&.@@@@  @@@@Y....   J@@@@P          \n" +
                "       ^@@@@. #@@@B @@@@! Y@@@& ^@@@B #@@@@@Y @@@@  @@@@?       .@@@@:          \n" +
                "       :@@@@^ &@@@G @@@@J G@@@& ^@@@B 7@@@@@: @@@@  @@@@?        @@@@.          \n" +
                "        B@@@@@@@@@~ J@@@@@@@@@7 ^@@@B .@@@@&  @@@@  @@@@?        @@@@.          \n" +
                "         7B&@@&&P:   ^G&@@@&P:  ^&&&P  P&&&J  &&&#  #&&&!        #&&&.          \n" +
                "                                                                                \n" +
                "       !####. !####. 7B&&BY .##5 Y##.?##7.##Y~&#####.^####P  B#P G##:^##!       \n" +
                "       J@@@@? #@@@@:7@@#P@@G.@@& B@@.P@@&^@@B:P&@@#5 5@@@@@  @@& &@@G7@@J       \n" +
                "       J@@@@B.@@@@@:Y@@!.@@&.@@# B@@.P@@@5@@B  P@@~  #@&P@@: @@& &@@@P@@?       \n" +
                "       J@@Y@@?@@P@@:Y@@!.@@#.@@# B@@.P@@@@@@B  G@@!  @@B~@@7 @@& &@@@@@@?       \n" +
                "       J@@^&@@@GJ@@:Y@@!.@@&.@@# B@@.P@@B@@@B  G@@! :@@P:@@P @@& &@@#@@@?       \n" +
                "       J@@.5@@@~J@@:Y@@?:@@#.@@& #@@.P@@!&@@B  G@@! 7@@@@@@&.@@& &@@~@@@?       \n" +
                "       J@@::@@@ Y@@:.&@@@@@! P@@@@@G G@@^J@@#  G@@! P@@7.&@@:@@& &@@.#@@?       \n" +
                "       .~~  ^~: .~~   :!!^    .~!~.  :~~  ~~:  :~~. :~~  :~^ ^~^ ^~^ .~~.       \n" +
                "                                                                                \n" +
                "                                                                                \n");
        System.out.println("Welcome to comfy mountain. You've made it up here on your own!");
        System.out.println("Truly you are worthy of wisdom from our sweet prince. Do you seek his words? (Y/N");
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



