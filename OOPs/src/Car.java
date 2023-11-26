public class Car {
    String model;
    String color;
    private int price;
    boolean isLocked = false;

    Car(){
        // This is the default constructor function
        System.out.println("Default constructor called");
        model = "Hatchback";
        color = "Black";
        setPrice(10000);
    }
    Car(String modelName, String colorName, int priceValue){
        // This is not the default constructor function
        System.out.println("Parameterised constructor called");
        model = modelName;
        color = colorName;
        setPrice(priceValue);
    }
//  Getter for price property
    int getPrice(){
        return price;
    }

//  Setter for price property
    void setPrice(int priceValue){
        if(priceValue<0) priceValue = 0;
        price = priceValue;
    }
    void drive(){
        System.out.println("Zoom zoom zooom!!!");
    }
    void lock(){
        isLocked = true;
        System.out.println("Car is now locked");
    }

    void unlock(){
        isLocked = false;
        System.out.println("Car is now unlocked");
    }
}
