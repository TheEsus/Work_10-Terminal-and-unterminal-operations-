// 2 варианта
//1) Создание класса с имплементацией интерфейса
/*
class myThread implements Runnable {
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println(i + "Привет от потока - " + Thread.currentThread().getName());
        }
    }
}
*/


//2) Через анонимный класс
class myThread extends Thread {
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println(i + "Привет от потока - " + Thread.currentThread().getName());
        }
    }
}
