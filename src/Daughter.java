public class Daughter extends Father {
    private String friend;

    public Daughter(String lastName, String address, long assetValue, String friend) {
        super(lastName, address, assetValue);
        this.friend = friend;
    }
}
