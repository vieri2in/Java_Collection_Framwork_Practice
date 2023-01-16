package CollectionsEX;

import java.util.*;

public class StackEX {
    public static void main(String[] args){
        //Stack practice
        Stack<Integer> stackI= new Stack<>();
        stackI.push(20);
        stackI.push(10);
        stackI.push(40);
        stackI.push(30);

        Iterator<Integer> itrI = stackI.iterator();
        while (itrI.hasNext()){
            System.out.print(itrI.next() + " ");
        }
        System.out.println();

        System.out.println(stackI.peek());
        System.out.println(stackI.pop());

        itrI = stackI.iterator();
        while (itrI.hasNext()){
            System.out.print(itrI.next() + " ");
        }
        System.out.println();


    }
}
