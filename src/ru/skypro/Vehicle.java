package ru.skypro;

public abstract class Vehicle {
    private String modelName;
    private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }
    public abstract void check(); // сделал заместо интерфейсов

    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    private void updateTyre(int i) {
        System.out.println("Меняем покрышку " + i + " из "+ wheelsCount); //вызываю его только тут
    }
    public void baseService(){
            System.out.println("Обслуживаем " + this.modelName);
            for (int i = 0; i < this.wheelsCount; i++) {
                this.updateTyre(i+1);
            }
        }

}