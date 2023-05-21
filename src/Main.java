
public class Main {
    public static void main(String[] args) {
        Car car = new Car("ford",4,"v6");
        Car car2 = new Car("mazda",4,"ecoboost");

        Truck truck = new Truck("volvo",6,"v12",false);
        Truck truck2 = new Truck("man",8,"v12",true);

        Bicycle bicycle = new Bicycle("stels",2);
        Bicycle bicycle2 = new Bicycle("forward",2);


        ServiceStation station = new ServiceStation();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);


    }
}