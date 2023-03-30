public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
//        ... // Пишем код для задачи 2
    }
}