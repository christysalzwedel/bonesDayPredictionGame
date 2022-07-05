import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ComfyMountain {
    private Random wisdomSelector = new Random();
    private int wisdomNumber;
    private String currentWisdom;
    private List<String> wisdomList = new ArrayList();

    public String getCurrentWisdom() {
        return currentWisdom;
    }

    public List<String> getWisdomList() {
        return wisdomList;
    }

    //this class reads a file, creates a matching list, and randomly selects a string from the list to return

    public ComfyMountain(boolean getWisdom) throws FileNotFoundException {
        this.currentWisdom = getCurrentWisdom();

        if (getWisdom) {

            File comfyWisdom = new File("src/comfy-mountain-wisdom");
            try (
                    Scanner comfyWisdomReader = new Scanner(comfyWisdom)) {
                while (comfyWisdomReader.hasNextLine()) {
                    String currentLine = comfyWisdomReader.nextLine();
                    wisdomList.add(currentLine);
                }
                wisdomNumber = (wisdomSelector.nextInt(wisdomList.size()));
                String wisdom = wisdomList.get(wisdomNumber);

                currentWisdom = "Noodle's wisdom for you today is: \n" + (wisdom);

            }

        } else {
            currentWisdom = "If you didn't want to seek wisdom, what are you even doing here? Go home."
                    + "\n His highness is resting and I will not disturb him for the likes of you.";
        }
    }
}