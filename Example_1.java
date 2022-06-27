
/*Примеры работы со стримами Stream API
* Стрим - обход объекта, как по конвееру
*
* Стримы бывают:
* 1) Терминальные (завершают стрим после операций)
* 2) Промежуточные (Стрим не завершается и можно продолжить с ним работать, возвращая новые объекты стрима)
* */

import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example_1 {

    public static void main(String[] args){
        List<String> list = List.of("Ivan", "Bob", "Tom");
        Stream<String> listStream = list.stream();

        IntStream intStream = IntStream.range(0, 100);

        Stream<String> stream = Stream.of("Ivan", "Bob", "Tom");

        list.stream().forEach(System.out::println);
    }
}
