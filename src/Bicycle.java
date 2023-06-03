public class Bicycle implements InterfaceDemo{
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


    @Override
    public void doServis() {
        System.out.println();
        System.out.println("Обслуживаем " + this.modelName);
        this.updateTyre();
    }

}
