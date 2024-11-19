import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;

public abstract class Car {

abstract class Car {
    private int year;
    private String color;
    private String bodyType;
    private String transmission;
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

        public String getCarInfo() {
            return String.format("Год выпуска: %d, Цвет: %s, Тип кузова: %s, Тип коробки передач: %s, Привод: %s, Тип двигателя: %s",
                    year, color, bodyType, transmissionType, driveType, engineType);
        }
        static void changeColorIfGreen;(List< Car > cars) {
            for (Car car : cars) {
                if (car.getColor().equals("зеленый")) {
                    car.setColor("красный");
                    System.out.println("Цвет автомобиля " + car.getBrand() + " изменен на красный.");
                }
            }
        }
        public abstract String getBrand();

        class Acura extends Car {
            private String model;

            public Acura(int year, String color, String bodyType, String transmissionType, String driveType, String engineType, String model) {
                super(year, color, bodyType, transmissionType, driveType, engineType);
                this.model = model;
            }

            @Override
            public String getBrand() {
                return "Acura, модель: " + model;
            }
        }

        class Buick extends Car {
            private String model;

            public Buick(int year, String color, String bodyType, String transmissionType, String driveType, String engineType, String model) {
                super(year, color, bodyType, transmissionType, driveType, engineType);
                this.model = model;
            }

            @Override
            public String getBrand() {
                return "Buick, модель: " + model;
            }
        }

        class Honda extends Car {
            private String model;
            public Honda(int year, String color, String bodyType, String transmissionType, String driveType, String engineType, String model) {
                super(year, color, bodyType, transmissionType, driveType, engineType);
                this.model = model;
            }

            @Override
            public String getBrand() {
                return "Honda, модель: " + model;
            }
        }

        class Dodge extends Car {
            private String model;

            public Dodge(int year, String color, String bodyType, String transmissionType, String driveType, String engineType, String model) {
                super(year, color, bodyType, transmissionType, driveType, engineType);
                this.model = model;
            }

            @Override
            public String getBrand() {
                return "Dodge, модель: " + model;
            }
        }

        class GMC extends Car {
            private String model;

            public GMC(int year, String color, String bodyType, String transmissionType, String driveType, String engineType, String model) {
                super(year, color, bodyType, transmissionType, driveType, engineType);
                this.model = model;
            }

            @Override
            public String getBrand() {
                return "GMC, модель: " + model;
            }
        }
    }

