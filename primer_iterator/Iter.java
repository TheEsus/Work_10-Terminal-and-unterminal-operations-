package primer_iterator;

public class Iter {
    private Integer[] mas;
    private int count;

    public Iter(Integer[] mas){
        this.mas = mas;
        count = -1;
    }

    public int next(){
        count += 1;
        return mas[count];
    }
}
