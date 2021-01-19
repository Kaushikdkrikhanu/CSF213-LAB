import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(8);
        System.out.println(linkedList);
        Collections.sort(linkedList);
        System.out.println(linkedList);
        Collections.sort(linkedList,Collections.reverseOrder());
        System.out.println(linkedList);
        System.out.println("The largest element is "+linkedList.get(0)+"\nThe smallest element is "+linkedList.get(2));
        int i=0;
        int x=1;
        for (int y: linkedList) {
            if(y==x)
                i++;
        }
        System.out.println(x+" occurs "+i+" times");
        for(int y: linkedList){
            boolean flag = true;
            if(y<2)
                flag = false;
            for(int j=2;i<Math.sqrt(y);i++){
                if(y%j==0)
                    flag = false;

            }
            if(flag)
                System.out.println(y);
        }


    }
}
