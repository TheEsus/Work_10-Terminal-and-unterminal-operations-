/*
* Прмоежуточные операции
* Выполняют ряд операций, но, в отличие от терминальных,
* они возвращают не тип данных, а стрим для дальнейшей работы
*/


import java.util.stream.IntStream;

public class Example_3 {
    public static void main(String[] args){
        IntStream intStream = IntStream.range(0, 10);
        //Эта запись относится к терминальным, т к foreEach - терминальный метод, завершающий стрим
        //intStream.filter(x -> x>50).forEach(System.out::println);//Вывел все числа что больше 50
//        System.out.println(
//                intStream
//                        .filter(x -> x>=5)
//                        .map(x->x * x)//Позвоялет выполнить функцию изскобок к каждому элементу стрима
//                        .skip(3)//пропускает первые 10 элементов
//                        .reduce((x,y) -> x + y)
//        );

        //intStream.map(x->x * 2).forEach(System.out::println);
        //intStream.limit(5).forEach(System.out::println);//срез до элемента, который указан в ()
        //intStream.skip(3).forEach(System.out::println);
        //intStream.dropWhile(x -> x < 90).forEach(System.out::println);// Похож на фильтр, т к тоже работает от
                                                                        //условия в скобках
    }
}
