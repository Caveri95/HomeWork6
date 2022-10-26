public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1, 2");
        int clientOS = 0; // 0 - версия iOs, 1 - версия Андроид
        int clientDeviceYear = 2013; // с, включая 2015 год, установка облегченной версии не требуется

        switch (clientOS) {
            case 0:
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установить версию приложения для iOS по ссылке");
                } else
                    System.out.println("Установить облегченную версию приложения для iOS по ссылке");
                break;
            case 1:
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установить версию приложения для Android по ссылке");
                } else
                    System.out.println("Установить облегченную версию приложения для Android по ссылке");
                break;
        }











        System.out.println("---");
        System.out.println("Задача 3");

        int year = 2200 ;

        if (year % 400 == 0){
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0){
            System.out.println(year + " год является високосным");
        } else
            System.out.println(year + " год  не является високосным");



        System.out.println("---");
        System.out.println("Задача 4");

        int deliveryDistance = 70;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней сутки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("Потребуется дней 2");
        } else
            System.out.println("Потребуется дней 3");

        System.out.println("---");
        System.out.println("Задача 5");

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас зимний период");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весеннй период");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас летний период");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас летний период");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }

    }
}
