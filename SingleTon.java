public class SingleTon {
    public static void main(String[] args) {
        // Car car1 = new Car("Thar", "Mahindra", "Diesel");
        Car car1 = Car.createSingleObject("Thar", "Mahindra", "Diesel");
        Car car2 = Car.createSingleObject("Scorpio", "Mahindra", "Diesel");
        System.out.println(car1.carname);
        System.out.println(car2.carname);
    }
}

class Car {
    static Car obj = null;
    String carname;
    String brandName;
    String _fuelType;

    private Car(String carName, String brandName, String fuelType) {
        carname = carName;
        this.brandName = brandName;
        _fuelType = fuelType;
    }

    static Car createSingleObject(String carName, String brandName, String fuelType) {

        if (obj == null) {
            obj = new Car(carName, brandName, fuelType);
        }
        return obj;
    }
}
