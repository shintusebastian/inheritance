public abstract class Bank {
    private String name;
    private String address;
    private String policy;
    private double rate;

    public double getRate() {
        return rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    //public void calculateRateOfInterest(); the rate of interest is different for each bank. So, we declare it as abstract.
    public abstract void calculateRateOfInterest();
}
