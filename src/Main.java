public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientDeviceYear >= 2015) {
                System.out.println("Установите приложение для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientDeviceYear >= 2015) {
                System.out.println("Установите приложение для Android по ссылке");
            }
        }

        // Задание 3
        System.out.println("Задание 3");
        int year = 2021;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDays + " срок доставки");
        } else if (deliveryDistance >=20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (deliveryDays * 2) + " срок доставки");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (deliveryDays * 3) + " Срок доставки");
        }

        // Задание 5
        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Этот месяц принадлежит к зимнему сезону");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадлежит к весеннему сезону");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит к летнему сезону");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц принадлежит к осеннему сезону");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}