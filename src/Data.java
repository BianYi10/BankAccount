import java.util.ArrayList;

public class Data{
    public static float average(Measurable[] arr){
        float sum=0;
        for(int i=0;i< arr.length;i++){
            sum+=arr[i].getMeasure();
        }
        return sum/ arr.length;
    }
}