
package interfaces;

import java.util.Arrays;
import java.util.Comparator;

public class Test implements Comparator<String> {

 public int compare(String first, String second)
{ return first.length() - second.length(); }

    public static void main(String[] args){
        String first = "this is first string";
        String second = "this is second string";
        Test test = new Test();
        Comparator<String> соmр = new Test();
        System.out.println( test.compare(first, second));
        String[] friends = { "Peter", "Paul", "Mary" };
        System.out.println(Arrays.toString(friends));
        Arrays.sort (friends, new Test() ) ;
        System.out.println(Arrays.toString(friends));
    }
}
