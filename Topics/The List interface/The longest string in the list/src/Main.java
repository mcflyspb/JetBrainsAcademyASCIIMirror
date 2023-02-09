import java.util.*;

public class Main {

    static void changeList(List<String> list) {
        String longestString =  "";
        int longestStringLenght = 0;
        for (String x : list) {
            if (x.length() > longestStringLenght) {
                longestStringLenght = x.length();
                longestString = x;
            }
        }
        for (int x = 0; x < list.size(); x++) {
            list.set(x,longestString);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}