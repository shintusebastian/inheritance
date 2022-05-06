import java.util.ArrayList;
import java.util.List;

public class Main  {//by default, every class extends Object class. So, it is  called as super class.
    //the toString()- actually comes from the object class.
    //methods defined in Object class can be accessed by any java object.
    public static void main(String[] args) {
        Father father = new Father("John", "Arakkal House", 555);
        father.dishForDinner();//{confusion will come to compiler because this method is overridden in the child class.
        //so while pressing alt+ctrl+b will show child and parent class.
        //Very important: this is called run time polymorphism
        //this happens when the methods are overriding.}
        // here, compiler will have confusion where it should go during the compile time.
        //But during the run time, it will point to the object that is standing before it and resolve this compile time problem.

        father.test();
        father.test("Shintu"); //this is called compile time polymorphism.
        // in this case, compiler will not have any confusion where it should go.

        father = new Daughter("Sebastian", "Arakkal House", 1, "xyz");
        father = new Son("Sebastian", "Arakkal House", 1, "Reading");

        // the same reference variable is used to store the address of 3 different objects.
        //this is called loose coupling
        // if we have a number of child classes, we can operate all of them using the same reference variable that is
        //used to reference the object of the parent class.
        // using parent's class reference variable to hold child object gives us loose coupling.


        ((Son) father).myPersonalMethod();// we have casted the father reference variable into the Son type for some time.
        // in this way, we can see the methods which are in the Son class and that were not able to access using the father variable.


        //java provides a feature along with inheritance to use the same remote control to access the three remote controls mentioned below.
//        Father father=new Father("John", "Arakkal House", 555);
//        Daughter daughter =new Daughter("Sebastian", "Arakkal House",1, "xyz");
//        Son son=new Son("Sebastian","Arakkal House", 1,"Reading");
        //this is called Tight Coupling.
        //we are using one remote control(son) to control the object which is of the Son type.


        //List<Integer> list = new ArrayList<>();//it is similar to Array with some features on top of it.
//        List<Father> list1 = new ArrayList<>();// this will create a list of father class, and it's child classes.
        //this means this list1 is used to store objects that are directly of Father type, or it's child.
        //each memory block in this list1 will hold reference of some Father type objects.
        //it can also hold the objects of it's child class as well because of loose coupling in Java.
        //List is a feature in Java to store parent and child objects together.
        //the below line adds the reference variable of Father to the list1
//        list1.add(new Father("John", "Arakkal House", 555));// the first member of the list has been added.
//        list1.add(new Son("Sebastian", "Arakkal House", 1, "Reading"));
//        list1.add(new Daughter("Sebastian", "Arakkal House", 1, "xyz"));

// ArrayList<Father> l=new ArrayList<>(); //this is a tight coupling
        // List <Father> list=new ArrayList<>(); - this is also an example of loose coupling
        List<Father> list = giveList();
        for (Father father1 : list) {//this is called enhanced for loop.
            //this means go through all elements in the list1.
            //every object that we take out of the list1 is stored in the father1 variable .
//            father1.dishForDinner();

        }
    }

    //line 47-49 can also be written as below
    public static List<Father> giveList() {
        List<Father> list = new ArrayList<>();
        list.add(new Father("John", "Arakkal House", 555));// the first member of the list has been added.
        list.add(new Son("Sebastian", "Arakkal House", 1, "Reading"));
        list.add(new Daughter("Sebastian", "Arakkal House", 1, "xyz"));
        return list;
    }

}
