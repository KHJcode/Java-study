class Car {
    private String modelName; // field
    private int modelYear;

    Car(String modelName, int modelYear) { // Constructor
        this.modelName = modelName;
        this.modelYear = modelYear;
    }

    Car() {
        this("Ferrari", 2022);
    }

    public String getModel(String color) { // method
        return "The " + modelYear + " " + modelName + " is " + color + ".";
    }
}

public class ex1 {
    public static void main(String args[]) {
        Car myCar = new Car("Maserati", 2021);
        Car yourCar = new Car();

        System.out.println(myCar.getModel("yellow"));
        System.out.print(yourCar.getModel("blue"));
    }
}
