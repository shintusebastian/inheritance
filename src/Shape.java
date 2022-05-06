public interface Shape {
    double PI=3.14D;
    void draw();//by default, all the methods will be public and abstract.So there is no need to declare them as public abstract.

    default void myMethod() {

        //here, we have declared a default method along with its body.
        //this is a feature of Java8.
//this is an exceptional method.  This is a popular interview question.
        //using this feature, there is a possibility to add a concrete method.
        //so, in this scenario diamond problem can occur if two interfaces are implemented by a class.
        //so we have to implement the method which is overriding to avoid confusion for the compiler. So, it is the
        //responsibility of the implementing class to override the method and provide the definition.


    }
}
