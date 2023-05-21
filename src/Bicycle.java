public class Bicycle {
    public String modelName;
    private int wheelsCount;

    public int getWheelsCount() {
        return wheelsCount;
    }

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышк: "+ getWheelsCount());
    }
    public void doService() {
        System.out.println();
        System.out.println("Обслуживаем " + this.modelName);
        this.updateTyre();
    }
}
