/*
* Из итератора в стримы
* Итератор -
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Example_4 {

    public static void main(String[] args){
        //Создали список
        ArrayList<String> makers = new ArrayList<String>();
        makers.add("Ferrari");
        makers.add("Ford");
        makers.add("BMW");
        // создали итератор для списка
        Iterator<String> iter = makers.iterator();

        //обход списка
//        while (iter.hasNext()){ // пока есть следующий - выводить его
//            System.out.println(iter.next());
//        }

        // но так же мы можем преобразовать итератор в стрим
                                            // spliteratorUnknownSize - когда не знаем размер
                                            // Spliterator.ORDERED - обычный последовательный
        Spliterator<String> sp = Spliterators.spliteratorUnknownSize(iter, Spliterator.ORDERED);
        Stream<String> stream = StreamSupport.stream(sp, false);
        System.out.println(stream.findFirst());
    }
}
