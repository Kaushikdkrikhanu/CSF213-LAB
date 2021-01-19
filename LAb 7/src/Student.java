import java.util.ArrayList;
import java.util.Iterator;

public class Student {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Parth");
        names.add("Rumana");
        names.add("Aaifa");
        names.add("Harshal");
        names.add("Robin");
        names.remove(0);
        names.add(0,"Ruhana");
        names.remove(1);
        System.out.println(names.get(0)+"\n"+names.get(2));
        System.out.println(names.size());
        Iterator<String> iterator = names.iterator();
        System.out.println("Printing the Array List");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
