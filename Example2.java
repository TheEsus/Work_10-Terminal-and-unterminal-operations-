/*
* join - приостанавливает поток до тех пор, пока следующий поток не будет выполнен
* */
import static java.lang.Thread.sleep;

public class Example2 {
    public static void main(String[] args) throws InterruptedException{
        Thread th1 = new Thread(Example2::phoneCall);
        Thread th2 = new Thread(new Worker());
        Thread th3 = new Thread(Example2::answer);

        th1.start();
        th2.start();
        th3.start();

        try {
            sleep(1000);//Метод слип позволяет приостановить программу на определенное время
        }catch (InterruptedException ex){
            System.out.println("Error " + ex );
        }

        th2.join();// далее наша программа будет ждать, пока завершится th2
        System.out.println("1234213");
    }

    public static void phoneCall(){
        int i = 0;
        while (i < 1000){
            System.out.println("Phone call!!!");
            i++;
        }
    }

    public static void answer(){
        System.out.println("I answer phone!!!");
    }
}

class Worker extends Thread{
    public void run(){
        int i = 0;
        while (i < 1000000){
            System.out.println(i);
            i++;

            if(Thread.interrupted()){//Проверка - если поток прерван
                System.out.println("Подожди звонит телефон");
                break;
            }
        }
    }
}
