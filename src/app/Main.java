package app;

public class Main {

    private static  final double CONV_K = 2.20462;

    public static void main(String[] args) {
        System.out.println("Convert app");

        double kg = 5;
        double pnds = 14;
        double pound = getConvK(kg);
        double kilo = getConvP(pnds);
        System.out.println("Result is " + pound + " lb and kilo is" + kilo + " kg.");
    }
    private static double getConvK(double kg){
        return kg * CONV_K;
    }
    private  static  double getConvP(double pnds){
        return pnds/CONV_K;
    }
}
