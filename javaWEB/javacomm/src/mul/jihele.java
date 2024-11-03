package mul;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class jihele {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        list.parallelStream()
                .forEach(i->{
                    System.out.println(Thread.currentThread().getName()+i);
                });
    }
}
