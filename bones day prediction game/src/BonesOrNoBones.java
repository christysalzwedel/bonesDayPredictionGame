import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.lang.*;
import java.time.LocalDate;

public class BonesOrNoBones {
    //this class generates a random boolean based on even or odd numbers generated
double predictor;
    public double getPredictor() {
        return predictor;
    }


    public boolean BonesDayPrediction() throws FileNotFoundException {
       predictor = Math.random() * 100;
       int predictionInt = ((int) predictor);
        return predictionInt % 2 == 0;
        }

        public boolean VIPBonesDay(){
        predictor= Math.random() * 100;
        int predictionInt = ((int)predictor);
        return (predictionInt % 2 == 0 && predictionInt % 3 == 0 );
        }

    }





