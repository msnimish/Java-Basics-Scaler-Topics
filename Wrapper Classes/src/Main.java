import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        22-11-2023
//        Wrapper Classes
//        Java Wrapper Classes provides us a way to primitive data types as objects
//        for eg: for int => Integer
//                for char => Character
//                for double => Double
//                for long => Long ... & so on
//
//        Why do we need wrapper classes?
//        1. Java Collections requires objects to passed and not datatypes for using them. So if we have a collection
//        that requires integers then we need to Integer Wrapper class instead of int datatype
//        ArrayList<int> arr = new ArrayList<int>();              // ...Error
//        ArrayList<Integer> arr1 = new ArrayList<Integer>();     // ...Correct

//        2. Synchronization
//        Java synchronization works with objects in Multithreading and wrapper classes helps to create objects of
//        primitive Datatypes



//        23-11-2023
//        int x = 5;
//        float y = 3.14F;
//        long z = 6000;
//        long az = 4000;

        // Autoboxing
//        Integer intObj = x;
//        Float floatObj = y;
//        Long longObj = z;
//        Long alongObj = az;

//        System.out.println(intObj);
//        System.out.println(floatObj);
//        System.out.println(longObj.compareTo(alongObj));

        Integer n = 5;
        Integer m = 5;
        boolean isEqual = n == m;
        System.out.println(isEqual);

        Integer intObj1 = 5;
        Float floatObj1 = 3.14F;
        Long longObj1 = 6000L;
        Long alongObj1 = 4000L;

// Unboxing
        int x1 = intObj1 ;
        float y1 = floatObj1 ;
        long z1 = longObj1 ;
        long az1 = alongObj1 ;

        Integer a = 12;
        Integer c = 34;


        System.out.println(x1);
        System.out.println(y1);
        System.out.println(z1);
        System.out.println(a+c);

        Integer x = 5;
        Character y = 'y';
        Double z = 2.1;

        System.out.println(x + y + z);
    }
}