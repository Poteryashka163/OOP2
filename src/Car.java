public class Car extends Bicycle {
    public String engine;

    public Car(String modelName, int wheelsCount, String engine) {
        super(modelName, wheelsCount);
        this.engine = engine;
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }


    public void doService() {
        super.doService();
        this.checkEngine();
    }
}
