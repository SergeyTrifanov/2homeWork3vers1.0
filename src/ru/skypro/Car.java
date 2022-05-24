package ru.skypro;

public class Car extends Vehicle implements Engine{
    @Override
    public void check() {
        this.baseService();
        this.checkEngine();
    }

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine(){
        System.out.println("Проверяем двигатель");
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + super.getModelName() + '\'' +
                ", wheelsCount=" + super.getWheelsCount() +
                '}';

    }
}
