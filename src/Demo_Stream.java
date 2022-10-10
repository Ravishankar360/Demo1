import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo_Stream {
    public static void main(String[] args){
        List<Integer> mylist = new ArrayList<Integer>();
        for(int i=0; i<50 ; i++){
            mylist.add(i);
        }
        // Sequencetial Stream
        Stream<Integer> seqStream= mylist.stream();

        //Parallel Stream
        Stream<Integer> parStream= mylist.parallelStream();

        Stream<Integer> highNumber = parStream.filter(p-> p >30);
        highNumber.forEach(p-> System.out.println("High Number par: "+p));

        Stream<Integer> highNumberseq = seqStream.filter(p-> p >30);
        highNumberseq.forEach(p-> System.out.println("High Number seq: "+p));


    }
}
