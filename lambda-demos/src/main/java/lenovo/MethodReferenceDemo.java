package lenovo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class MethodReferenceDemo {


    public  static  void main(String[] args)
    {
        List<String> list = new ArrayList();
        list.add("abc");
        list.add("sds");
        list.add("dfd");
        list.add("eef");

        list.forEach(System.out::println);//与下一句作用相同，但是更为简洁
//        list.forEach(s -> {System.out.println(s);});

//        list.forEach(List::hashCode);
    }


}
