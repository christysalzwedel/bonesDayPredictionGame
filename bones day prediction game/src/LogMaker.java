import java.io.*;
import java.time.LocalDate;

public class LogMaker {

    public LogMaker(String message) throws IOException {

        File bonesLog = new File("src/BonesLogger");
        try (FileWriter bonesWriter = new FileWriter(bonesLog, true);
             PrintWriter writeToLog = new PrintWriter(bonesWriter)) {
            writeToLog.println(LocalDate.now() + " " + message);

        }
    }
}
