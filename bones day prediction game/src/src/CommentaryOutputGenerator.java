import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CommentaryOutputGenerator {

    private Random randomPicker = new Random();
    private int randomNumber;
    private List<String> bonesComments = new ArrayList<>();
    private List<String> randomizedOutput = new ArrayList<>(4);
    private String commentString;
    private String addressOfListFile;

    public CommentaryOutputGenerator() throws FileNotFoundException {
    }

    public List<String> getBonesComments() {
        return bonesComments;
    }

    public int getRandomNumber() {
        return randomNumber;
    }
    public String getCommentString(){
        return commentString;
    }

    public CommentaryOutputGenerator(Boolean trueOrFalse) throws FileNotFoundException {
    this.commentString = getCommentString();

    // first the correct file is chosen based on the random bones or no bones option

    if (trueOrFalse){
        addressOfListFile = "src/bones-day-text" ;
    }
    if (!trueOrFalse){
        addressOfListFile = "src/no-bones-day-text" ;
    }

    //the file is read in and a list is constructed

    File bonesDayWords = new File(addressOfListFile);
    try(Scanner bonesReader = new Scanner(bonesDayWords)) {
        while (bonesReader.hasNextLine()) {
            String currentLine = bonesReader.nextLine();
            bonesComments.add(currentLine);
        }
    }

    //This section selects 4 random strings from the list and creates a new list
    for (int i = 0; i<4; i++){
        randomNumber = (randomPicker.nextInt(bonesComments.size()));
        String addLine = bonesComments.get(randomNumber);

        //unique strings are added
        if (!randomizedOutput.contains(addLine)){
            randomizedOutput.add(addLine);
        }

        //duplicate strings are NOT added and int i is returned to the previous count
        else if (randomizedOutput.contains(addLine)){
            i = i - 1;

        }

        }
    //comments are concatenated for output
    commentString = randomizedOutput.get(0) + " " + randomizedOutput.get(1) + "\n" + randomizedOutput.get(2) + " " + randomizedOutput.get(3);
    }
    }



