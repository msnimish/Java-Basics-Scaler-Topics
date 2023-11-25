public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Sedan", "Blue", 14000);
        Car c2 = new Car();

//        24-11-2023
        /*Reading properties
        System.out.println("C1 Properties ------------------------------------------");
        System.out.println(c1.color);
        System.out.println(c1.model);
        System.out.println(c1.getPrice());

        System.out.println("C2 Properties ------------------------------------------");
        c2.color = "Red";  // Updating c2 object property which won't affect c1
        System.out.println(c2.color);
        System.out.println(c2.model);
        System.out.println(c2.getPrice());*/

        /*Executing class methods
        c1.drive();
        c1.lock();
        c2.unlock();
        System.out.println(c1.isLocked);
        System.out.println(c2.isLocked);

        c1.setPrice(7_500);
        c2.setPrice(-3_000);
        System.out.println(c1.getPrice());
        System.out.println(c2.getPrice());*/

//        26-11-2023
        System.out.println(c1.getPrice());
        System.out.println(c1.model);
        System.out.println(c1.color);
        System.out.println(c2.getPrice());
        System.out.println(c2.model);
        System.out.println(c2.color);

    }
}