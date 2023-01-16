package CollectionsEX;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class collectionInterfaceEX {
    public static void main(String[] args){
        //Collection interface
        System.out.println("addAll method");
        System.out.println("containsAll method");
        System.out.println("removeAll method");

        System.out.println("removeIf(Predicate<? super E> filter) method");
        Collection<Integer> items = new ArrayList<>();
        Collections.addAll(items,10, 20, 30);
        items.removeIf(e -> (e % 3 == 0));
        printItems(items);//expected:10 20  output: 10 20

        System.out.println("retainAll method");
        System.out.println("toArray() method");
        System.out.println("\n");


        //List interface
        System.out.println("add(int index, E element) method");
        System.out.println("addAll(int index, Collection<? extends E> c) method");
        System.out.println("get(int index) method");

        System.out.println("replaceAll(UnaryOperator<E> operator) method");
        List<Integer> listR = new ArrayList<>();
        Collections.addAll(listR, 10, 20, 30);
        listR.replaceAll(e -> ++e);
        printItems(listR);//expected:11 21 31  output: 11 21 31

        System.out.println("set(int index, E element) method");
        System.out.println("subList(int fromIndex, int toIndex) method");
        List<Integer> lists = new ArrayList<>();
        Collections.addAll(lists, 1, 2, 3, 4);
        printItems(lists.subList(1,3));//expected:2 3 output: 2 3

    }
    public static void printItems(Collection collection){
        collection.forEach(e-> System.out.print(e + " "));
        System.out.println();
    }
}
