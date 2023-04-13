import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Programme_5_ArrayListWithIterator {
    public static void main(String[] args) {


        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Grapes");
        fruitList.add("Mango");
        fruitList.add("Kiwi");
        fruitList.add("BlackBerry");
        fruitList.add("Strawberry");
        fruitList.add("Cherry");
        ListIterator<String>iterator =  fruitList.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next()+ " ,");
        }
    }
}
