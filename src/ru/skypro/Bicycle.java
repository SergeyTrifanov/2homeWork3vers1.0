package ru.skypro;

public class Bicycle extends Vehicle implements Engine {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check(){
        this.baseService();

    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "modelName='" + super.getModelName() + '\'' +
                ", wheelsCount=" + super.getWheelsCount() +
                '}';
    }
}
