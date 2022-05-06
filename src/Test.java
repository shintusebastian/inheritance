import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
//       int [] marks=new int[5];
//       marks[0]=10;
//        marks[1]=76;
//        marks[2]=86;
//        marks[3]=96;
//        marks[4]=100;
//        for(int i:marks){//enhanced for loop
//            if(i==10){
//                System.out.println("True");
//            }
//            else {
//                System.out.println("false");
//            }
//        }
//        Father father=new Son(); both of the below declared sentences are similar in some way.
//       Shape shape= new Circle();
        List<Shape> participants = takeListFromReception();
        Shape shape2 = new Rectangle();

        shape2.draw();//this approach is object-oriented approach.
        System.out.println(Shape.PI);
        Shape shape = () -> System.out.println("Hello");// this is called the lambda expression.
        // if there are multiple lines, we need to wrap it in curly braces.
        Shape shape1 = () -> {
            System.out.println("Hello");
        };
        shape.draw();// this is a functional approach

    }

    public static List<Shape> takeListFromReception() {
        List<Shape> list = new ArrayList<>();
        list.add(new Circle());
        list.add(new Rectangle());

        return list;
    }

}
