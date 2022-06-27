/*
* Описание задания
  Потренироваться использовать стримы.

    1) Взять строковый и числовые наборы данных и применить к ним максимально возможное количество нетерминальных операций
    2) Выполнить преобразования результата из стрима в списки
*/
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HomeWork_10 {

    public static void main(String[] args){
        //Проверка через стрим
//        IntStream intStream = IntStream.rangeClosed(1, 15);

//        //System.out.println(
//                intStream
//                        .filter(x -> x % 2 !=0)
//                        .map(x -> x + 1 )
//                        .skip(4)
//                        .map(x -> x * x).forEach(System.out::println);//);

        //Стрим квадраты чисел с шагом в 2
        List<Integer> numbers = Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
                .filter(x -> x % 2 !=0)
                .map(x -> x + 1 )
                .skip(4)
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println(numbers);

        List<String> strings = Stream.of("Алоха", "Привет", "Привета", "Дадова", "Ку")
                .filter(x -> x != "Привета" )
                .map(x -> x+ '_' + x.toLowerCase())
                .map(x-> x.replace('а', 'к'))
                .map(x -> x.concat(" друг"))
                .skip(1)
                .collect(Collectors.toList());

        System.out.println(strings);
    }
}
