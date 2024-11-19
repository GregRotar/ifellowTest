public abstract class Car {
    private int year;
    private String color;
    private String bodyType;
    private String transmissionType;
    private String driveType;
    private String engineType;

    // Конструктор
    public Car(int year, String color, String bodyType, String transmissionType, String driveType, String engineType) {
        this.year = year;
        this.color = color;
        this.bodyType = bodyType;
        this.transmissionType = transmissionType;
        this.driveType = driveType;
        this.engineType = engineType;
    }

    public String getCarInfo() {
        return String.format("Год выпуска: %d, Цвет: %s, Тип кузова: %s, Тип коробки передач: %s, Привод: %s, Тип двигателя: %s",
                year, color, bodyType, transmissionType, driveType, engineType);
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
    public String setColor(String newColor){
        return this.color=newColor;
    }

    public String getTransmissionType() {
        return transmissionType;
    }
}


