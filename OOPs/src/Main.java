public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

//        Reading properties

        System.out.println("C1 Properties ------------------------------------------");
        System.out.println(c1.color);
        System.out.println(c1.model);
        System.out.println(c1.price);

        System.out.println("C2 Properties ------------------------------------------");
        c2.color = "Red";  // Updating c2 object property which won't affect c1
        System.out.println(c2.color);
        System.out.println(c2.model);
        System.out.println(c2.price);

//        Executing class methods
        c1.drive();
        c1.lock();
        c1.unlock();


    }
}