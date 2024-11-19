import java.util.List;

public class Main {
        //it's Main origin
public static void main(String[] args){
    List<Car> cars = new ArrayList<>();
    list.add(new Acura(2017, "Красный", "Седан", "Механическая", "Передний", "Бензин"));
    list.add(new Buick(2020, "Черный", "Купе", "Автоматическая", "Задний", "Электрический"));
    list.add(new Citroen(2005, "Зеленый", "Внедорожник", "Автоматическая", "Полный", "Дизель"));
    list.add(new Dodge(2012, "Белый", "Хэтчбек", "Механическая", "Передний", "Бензин"));
    list.add(new Exeed(2021, "Серебристый", "Седан", "Автоматическая", "Полный", "Электрический"));
    list.add(new Fiat(2004, "Зеленый", "Спорткар", "Механическая", "Задний", "Бензин"));
    list.add(new GMC(2009, "Зеленый", "Пикап", "Автоматическая", "Передний", "Дизель"));
    list.add(new Honda(2002, "Желтый", "Купе", "Механическая", "Задний", "Бензин"));
    list.add(new Infinity(2023, "Голубой", "Минивэн", "Автоматическая", "Полный", "Электрический"));
    list.add(new Jeep(2014, "Зеленый", "Универсал", "Механическая", "Передний", "Бензин"));
    public static void printCarsAfter2006(List<Car> cars) {
        for (Car car : cars) {
            if (car.getYear() > 2006) {
                System.out.println(car.getCarInfo());
            } else {
                System.out.println("Устаревший авто: " + car.getBrand());
            }
        }
    }
}
        public static void changeColorIfGreen(List<Car> cars) {
            for (Car car : cars) {
                if (car.getColor().equals("зеленый")) {
                    car.setColor("красный");
                    System.out.println("Цвет автомобиля " + car.getBrand() + " изменен на красный.");
                }
            }
        }

        public static void printCarsWithTransmission(List<Car> cars) {
            for (Car car : cars) {
                if (car.getTransmissionType().equals("механическая")) {
                    System.out.println("Механическая коробка: " + car.getCarInfo());
                } else {
                    System.out.println("Автомат: " + car.getCarInfo());
                }
            }
        }
    }
    }
