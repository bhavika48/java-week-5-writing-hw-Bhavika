import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Programme_6_RetriveArrayListAtGivenIndex {
    public static void main(String[] args) {


        ArrayList<String> vegetableList = new ArrayList<>();
        vegetableList.add("CUCUMBER");
        vegetableList.add("POTATO");
        vegetableList.add("CAULIFLOWER");
        vegetableList.add("BRINJLE");
        vegetableList.add("ONION");
        vegetableList.add("BEETROOT");
        vegetableList.add("MASHROOM");
        vegetableList.add("OKRA");
        vegetableList.add("CABAGE");
        System.out.println(vegetableList);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter index number :");
        int index = scan.nextInt();
        if (index < vegetableList.size()) {
            System.out.println(vegetableList.get(index));

        } else {
            System.out.println("Invalid index");
        }
        scan.close();


    }
}