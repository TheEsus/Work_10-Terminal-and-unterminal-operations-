import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* Терминальные операции - выполняется один раз, чтобы снова запустить метод - нужен новый стрим */

public class Example_2 {

    public static void main(String[] args){
        IntStream intStream = IntStream.range(0, 100); //Создает стрим в диапазоне 0 - 100(не включая правую границу)
        //intStream.forEach(System.out::println); // - вывод элементов
        //System.out.println(intStream.count()); // - посмотреть глубину
        //System.out.println(intStream.reduce((x,y) -> x + y));// - сумма элементов списка (благодаря редьюс)
        //System.out.println(intStream.findFirst());// - возвращает первый элемент
        //System.out.println(intStream.allMatch(x -> x <= 99));// - вернет true если выполнено условие в скобках
                                                                // (сейчас проверка, что есть числа <= 99 есть в списке)
        //System.out.println(intStream.anyMatch(x -> x > 90)); //- если есть элемент больше 90 - получаем true
        //System.out.println(intStream.noneMatch(x -> x > 98));// - вернул false т к есть  x > 98(не должно выполнится
                                                                // ни для кого)

        // - Коллекторы - позволяют собрать элементы в тип данных(в списки, множества и в др)
        // Превратили набор данных(в скобках) в лист
        //List<Integer> numbers = Stream.of(1, 10, 100, 1000).collect(Collectors.toList());// - коллектор
        //Поищем минимальный элемента
        Optional<Integer> numbers = Stream.of(1, 10, 100, 1000).min(Integer::compareTo);
        System.out.println(numbers);
    }
}
