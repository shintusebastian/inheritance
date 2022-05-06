public class Son extends Father { // if we do not create a constructor, this line will show error.
    /*Because before creating the object of child class, we have to initialize the inherited part of the child */
    private String hobby;

    public Son(String lastName, String address, long assetValue, String hobby) {
        super(lastName, address, assetValue);// This is not a call to the constructor of Son Class.
        //super refers to the inherited portion of the child class.
        //super will not refer to the current object. That is, it will refer to the object of parent class.
        this.hobby = hobby;
    }

    @Override
    public void dishForDinner() {
        System.out.println("burger");
    }
public void myPersonalMethod(){

}
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

}
