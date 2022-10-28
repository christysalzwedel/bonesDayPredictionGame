import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VIP {

    public boolean VIPMethod() throws FileNotFoundException {
        List<String> vipTest = new ArrayList<>();
        List <String> tempLog = new ArrayList<>();
        boolean result = false;

        File vipCheck = new File("src/BonesLogger");
        if (vipCheck.exists()) {
            Scanner currentLine = new Scanner(vipCheck);
            while(currentLine.hasNextLine()){
                tempLog.add(currentLine.nextLine());
            }

            for (String readLine: tempLog) {
                String date = readLine.substring(0, 10);
                if (!vipTest.contains(date)) {
                    vipTest.add(date);
                }
            } if (vipTest.size() >= 7) {
                result = true;
            }

        }

        return result;
    }
}
