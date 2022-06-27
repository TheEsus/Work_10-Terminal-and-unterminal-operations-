/*
* Освоение многопоточности
* Асинхронность - Выполнение одних процессов во время выполнение других
* Пример - касса и плита в маке. Не ждать готовности котлет, а во время готовки принимать заказ на кассе
* start - запускает потоки
* run -  запускате потоки в потоке
*
* Как работать с многопоточностью
* */
public class Example1 {
    public static void main(String[] args){
        //Создаем поток
        Thread myThread1 = new Thread(() -> {
            for(int i = 0; i < 50; i ++){
                System.out.println(i + "Привет от потока - " + Thread.currentThread().getName());//Получаем имя потока
            }
        });
        //3) Через лямбду
        Thread myThread2 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println(i + "Привет от потока - " + Thread.currentThread().getName());
                }
            };
        };

        Thread myThread3 = new Thread(new myThread());

        myThread1.start();
        myThread2.start();
        myThread3.start();


    }
}
