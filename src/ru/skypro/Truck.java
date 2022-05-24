package ru.skypro;

public class Truck extends Vehicle implements Engine{
    @Override
    public void check() {
        this.baseService();
        this.checkEngine();
        this.checkTrailer();
    }

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine(){
        System.out.println("Проверяем двигатель");
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "modelName='" + super.getModelName() + '\'' +
                ", wheelsCount=" + super.getWheelsCount() +
                '}';
    }
}
