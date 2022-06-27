package primer_iterator;

public class Run {

    public static void main(String[] args){
        Integer[] a = new Integer[] {10, 20 , 55 , 66};

        Iter aIter = new Iter(a);

        System.out.println(aIter.next());
    }
}
