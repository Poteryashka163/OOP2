public class Car extends Bicycle {
    public String engine;

    public Car(String modelName, int wheelsCount, String engine) {
        super(modelName, wheelsCount);
        this.engine = engine;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
