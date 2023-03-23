public class BmiService {
    public int calculate (int weightKg, double heightMeter){

        double height2 = heightMeter * heightMeter;
        double index = weightKg / height2;

        return (int)index;
    }
}
