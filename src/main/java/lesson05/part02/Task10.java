package lesson05.part02;

/**
 * Три метода и максимум
 * Написать public static методы: int max(int, int), long max(long, long), double max(double, double).
 * Каждый метод должен возвращать максимальное из двух переданных в него чисел.
 * <p>
 * <p>
 * Требования:
 * 1. Программа не должна выводить текст на экран.
 * 2. Класс задачи должен содержать четыре метода.
 * 3. Класс задачи должен содержать статический метод int max(int, int).
 * 4. Метод int max(int, int) должен возвращать максимальное из двух чисел типа int.
 * 5. Класс задачи должен содержать статический метод long max(long, long).
 * 6. Метод long max(long, long) должен возвращать максимальное из двух чисел типа long.
 * 7. Класс задачи должен содержать статический метод double max(double, double).
 * 8. Метод double max(double, double) должен возвращать максимальное из двух чисел типа double.
 */

public class Task10 {
    public static void main(String[] args) {

    }
    public static int min(int a, int b){
        int res;
        if (a>b){
            res = a;
        } else {
            res=b;
        }
        return res;
    }
    public static long min(long a, long b){
        long res;
        if (a>b){
            res = a;
        } else {
            res=b;
        }
        return res;
    }
    public static double min(double a, double b){
        double res;
        if (a>b){
            res = a;
        } else {
            res=b;
        }
        return res;
    }
}
