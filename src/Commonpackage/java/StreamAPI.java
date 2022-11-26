package Commonpackage.java;

import java.util.*;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String args []){

        List<Integer> nums=Arrays.asList(9,1,7,6,8,3,4);

        Stream<Integer> da= nums.stream();
        Stream<Integer>sorted=da.sorted();
        sorted.forEach(n ->System.out.print(n));
       
    }

}
