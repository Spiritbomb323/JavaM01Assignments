public class M01Assignment1 {
    public static double footToMeter(double foot) {
        double meter = 0.305 * foot;
        return meter;
    }
    public static double meterToFoot(double meter) {
        double foot = 3.2787 * meter;
        return foot;
    }
    public static void main(String[] args){
        double startingMeter = 20.0;
        System.out.println("Feet     Meters     |     Meters     Feet");
        System.out.println("-----------------------------------------");
        
        for (double i = 1; i <= 10; i++){
            System.out.println(i + "     " + footToMeter(i) + "     |     " + startingMeter + "     " + meterToFoot(startingMeter));
            startingMeter += 5;
        }
    }
}