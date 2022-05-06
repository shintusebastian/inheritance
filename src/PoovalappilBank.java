public class PoovalappilBank extends Bank {
    private double finalRate;
    private double specificRate;


    @Override
    public void calculateRateOfInterest() {
        finalRate = getRate() + specificRate;
    }
}
