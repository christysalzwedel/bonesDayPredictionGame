import java.lang.*;

public class BonesOrNoBones {
    //this class generates a random boolean based on even or odd numbers generated


    public boolean BonesDayPrediction() {
       double predictor = Math.random() * 100;
       int predictionInt = ((int) predictor);
        return predictionInt % 2 == 0;
    }
    public BonesOrNoBones(){

    }
}


