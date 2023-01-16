package CollectionsEX;

import java.util.*;

public class CollectionsClassEX {
    public static void main(String[] args){
        Collection<Integer> items = new ArrayList<>();
        System.out.println("addAll method");
        Collections.addAll(items, 20, 10, 30);
        printItems(items);//20 10 30

        List<Integer> listOther = new ArrayList<>();
        listOther.add(40);
        listOther.add(10);
        printItems(listOther);//40 10

        System.out.println("copy method");
        Collections.copy((List)items, listOther);
        printItems(items);//40 10 30

        System.out.println("disjoint method");
        System.out.println(Collections.disjoint(items, listOther));//expected:false output: false


        System.out.println("frequency method");
        items.add(20);
        items.add(10);
        System.out.println(Collections.frequency(items, 10));
        printItems(items);//40 10 30 20 10

        System.out.println("indexOfSublist method");
        System.out.println(Collections.indexOfSubList((List)items,listOther));//expected:0 output: 0
        listOther.clear();
        listOther.add(30);
        listOther.add(20);
        System.out.println(Collections.indexOfSubList((List)items,listOther));//expected:2 output: 2

        System.out.println("max method");
        System.out.println(Collections.max(items));//expected:40 output: 40

        System.out.println("replaceall method");
        System.out.println(Collections.replaceAll((List)items, 10, 11));//expected:true output: true
        printItems(items);//40 11 30 20 11

        System.out.println("reverse method");
        Collections.reverse((List)items);
        printItems(items);//11 20 30 11 40

        System.out.println("rotate method");
        Collections.rotate((List)items,1);
        printItems(items);//40 11 20 30 11

        System.out.println("rotate method");
        Collections.swap((List)items,0, 2);
        printItems(items);//20 11 40 30 11


    }
    public static void printItems(Collection collection){
        collection.forEach(e-> System.out.print(e + " "));
        System.out.println();
    }
}
