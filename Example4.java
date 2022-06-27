/*
 * Синхронизация
 *
 * */

public class Example4 {
    public static int value = 0;

    public static void main(String[] args){
        //Создаем 3 потока и передаем им функции через "::"
        Thread th1 = new Thread(Example4::safeInc);
        Thread th2 = new Thread(Example4::safeInc);
        Thread th3 = new Thread(Example4::safeInc);

        th1.start();
        th2.start();
        th3.start();
    }
    // Не безопасный(danger) метод взаимодействия с переменными
    // должно быть 1 2 3, но есть шанс других вариаций, которые есть плохо
    public static void dangerInc(){
        System.out.println("Start");
        System.out.println("Value before " + value);
        value ++;
        System.out.println("Value after " + value);
        System.out.println("End");
    }
    // Этот метод безопаснее, т к данный метод может одновременно выполнять
    // только 1 поток (за счет synchronized в конструкции метода)
    // метод превращается в монитор (по принципу команаты - 1 зашел -> 1 вышел -> 2 зашел и тд)
    public static synchronized void safeInc(){
        System.out.println("Start");
        System.out.println("Value before " + value);
        value ++;
        System.out.println("Value after " + value);
        System.out.println("End");
    }

    // Метод позволяет за счет отдельной synchronized создать отдельный многопоточный код,
    // прочий код можно написать как до synchronized, так и после
    public static void safeInc2(){
        synchronized (Example4.class){
            System.out.println("Start");
            System.out.println("Value before " + value);
            value ++;
            System.out.println("Value after " + value);
            System.out.println("End");
        }
    }
}
