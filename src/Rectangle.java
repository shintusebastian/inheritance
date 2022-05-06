public class Rectangle implements Shape {
    private String name = "Shintu";//alt+ins key is a short-cut to generate getter and setter for the data members.

    public void myFunction() {
        System.out.println("This is myFunction()");
    }/*but we cannot access this method as this class is bound with the interface. Anything other than the
    implementing methods will not work. If we want to define anything, we should define it inside the methods.*/


    // Thumb rule: this method will be only seen if we cast the reference variable to Rectangle type.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void draw() {

    }

}
