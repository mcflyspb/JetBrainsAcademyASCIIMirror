import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        //ArrayList<String> name = new ArrayList<>(nameList);
        List<Integer> digit = Arrays.asList(1,2,3,4);
        List<Integer> digit2 = new ArrayList<>(digit);
        digit2.add(8);
        //List<String> name = Collections.unmodifiableList(nameList);
        System.out.println(digit2);

        // write your code here
    }
}