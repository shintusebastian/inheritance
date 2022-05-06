public class Circle implements Shape, Color {//we are implementing the interface shape.
    //we declare that whatever was missing in the shape, the circle class will implement.
    /*providing the missing implementation is the focus here, and not inheritance.
    The Circle class is not extending Shape. It just provides the implementation for the methods in the interface Shape.
     Although it is not inheriting any properties from the interface, like a reference variable of parent class can
      hold the object of child class a similar relationship exists between interface and it's implementing class*/


    @Override//here it's overriding which means it's not inheriting. But providing the implementation of draw().
    public void draw() {
        System.out.println("Draw circle");

    }

    @Override
    public void coloring() {

    }
}
