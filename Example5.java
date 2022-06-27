import java.beans.IntrospectionException;

public class Example5 {
    public static void main(String[] args){
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

class Store{
    private int product = 0;
    public synchronized void get(){
        while (product<1){
            try {
                wait();
            }catch (InterruptedException e) {
            }
        }
        product--;
        System.out.println(" 1 товар был приобретен");
        System.out.println(" Товаров на складе: " + product);
        notify();//Пробудил поток
    }
    public synchronized void put(){
        while (product>=3){
            try {
                wait();
            }catch (InterruptedException e) {
            }
        }
        product++;
        System.out.println(" 1 товар был добавлен");
        System.out.println(" Товаров на складе: " + product);
        notify();//Пробудил поток
    }
}

class Producer implements Runnable{
    Store store;
    Producer(Store store){this.store = store;}
    public void run(){
        for(int i = 0; i < 50; i++){
            store.put();
        }
    }
}

class Consumer implements Runnable{
    Store store;
    Consumer(Store store){this.store = store;}
    public void run(){
        for(int i = 0; i < 50; i++){
            store.get();
        }
    }
}
