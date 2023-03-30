import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");
//        ... // Задача 1
//Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным, и выводит результат в консоль.
//Эту проверку вы уже реализовывали в задании по условным операторам.
//
//Текст прошлого задания
//
//Теперь проверку оберните в метод и используйте год, который приходит в виде параметра.
//Результат программы выведите в консоль. Если год високосный, то напечатайте сообщение:
// «...  год — високосный год». Если год невисокосный, то: «... год — невисокосный год».

        int year = 2023;
        isYearLeap(year);

    }
    public static void isYearLeap( int currentYear) {
        if (currentYear % 4 == 0 && currentYear % 100 != 0 || currentYear % 400 == 0) {
            System.out.println(currentYear + " год - високосный год");
        } else {
            System.out.println(currentYear + " год - невисокосный год");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");

        // Вспомните задание 2 из урока «Условные операторы», где вы предлагали пользователю облегченную версию приложения.
//
//Текст прошлого задания:
//
// Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.
//Если устройство старше текущего года, предложите ему установить облегченную версию.
//Текущий год можно получить таким способом:
//int currentYear = LocalDate.now().getYear();
//Или самим задать значение вручную — ввести в переменную числовое значение.
//В результате программа должна выводить в консоль сообщение, какую версию приложения
// (обычную или облегченную) и для какой ОС (Android или iOS) установить пользователю.


        String osName = "iOS";
        int clientDeviceYear = 2015;


      offerApp(checkOs(osName), clientDeviceYear);


    }

    public static int checkOs (String osName){
        if (osName.contains("iOS")) {
            return 0;
        } else if (osName.contains("Android")) {
            return 1;
        } else {
            throw new RuntimeException("Операционная система устройства не опознана");
        }
    }

    public static void offerApp (int existingOs, int deviceYear){



        int currentYear = LocalDate.now().getYear();
        boolean isYearActual = deviceYear == currentYear;

        if(existingOs == 0){

            if (!isYearActual) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите приложение для iOS по ссылке");
            }

        } else if (existingOs == 1) {

            if (!isYearActual) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите приложение для Android по ссылке");
            }

        }
    }


    public static void task3() {
        System.out.println("Задача 3");
//        Возвращаемся к задаче на расчет дней доставки банковской карты.
//
//Ваша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки.
//

        int deliveryDistance = 95;

        calculateDeliveryTime(deliveryDistance);
    }

    public static void calculateDeliveryTime (int deliveryDistance) {
        int deliveryTime = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance <= 60) {
            deliveryTime += 1;
            System.out.println("Потребуется дней: " + deliveryTime);

        } else if (deliveryDistance <= 100) {
            deliveryTime += 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("По данному адресу доставка невозможна");
        }

    }
}

