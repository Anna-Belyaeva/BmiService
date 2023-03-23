public class BmiService {
    public int calculate (int weightKg, double heightMeter){

        double height2 = Math.pow(heightMeter, 2);
        double index = weightKg / height2;

        return (int)index;
    }
}
