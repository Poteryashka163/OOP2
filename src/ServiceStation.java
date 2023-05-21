public class ServiceStation {

    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.modelName);
            car.updateTyre();
            car.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.modelName);
            truck.updateTyre();
            truck.checkEngine();
            if (truck.trailer){
                truck.checkTrailer();
            }
            else {
                System.out.println("Прицепа нет.");
            }
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.modelName);
            bicycle.updateTyre();
        }
    }
}
