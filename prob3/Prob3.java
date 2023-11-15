package prob3;

import java.util.Arrays;
import java.util.List;

public class Prob3 {
    public static <T> boolean contains1(List<T> list,T s){
        for (T x:list){
            if (x==null&& s==null)return true;
            if (x==null||s==null)continue;
            if (x.equals(s))return true;

        }
return false;

    }

    public static void main(String[] args) {
        List<String> list= Arrays.asList("Bob","Joe","Tom");
        boolean result=contains1(list,"Bob");
        System.out.println(result);

        List<Integer> list2= Arrays.asList(23,56,78);
        boolean result2=contains1(list2,56);
        System.out.println(result2);

    }
}

