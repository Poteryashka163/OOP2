public class Truck extends Car {
    public boolean trailer;

    public Truck(String modelName, int wheelsCount, String engine, boolean trailer) {
        super(modelName, wheelsCount, engine);
        this.trailer = trailer;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
