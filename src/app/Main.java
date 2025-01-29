package app;

public class Main {

    private static  final double CONV_K = 2.20462;

    public static void main(String[] args) {
        System.out.println("Convert app");

        double kg = 5;
        double pound = getConvK(kg);
        System.out.println("Result is " + pound + " pounds.");
    }
    private static double getConvK(double kg){
        return kg * CONV_K;
    }
}
