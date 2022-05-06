public class ArakkalBank extends Bank {

    private double primeRate;
    private double finalRate;

    @Override //this portion of code generated to implement the abstract method which was present in the parent class.
    //the @Override means that this is an overridden method.
    //this portion will override what was present in the parent class.
    //thumb rule: we can override whatever method that was given to us by the parent class.
    //thumb rule: the @Override annotation is a label. even if we remove the label, it will not show an error.
    //it says that this method was overridden from the parent class and do not change it.
    //it is a good practice to mention that it was overridden so that the next developer can understand that this is an overridden method.
    public void calculateRateOfInterest() {
        finalRate = getRate() + primeRate;
    }
}
