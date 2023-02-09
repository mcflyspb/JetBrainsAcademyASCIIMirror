import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().trim().split(" ");
        List<Integer> list = new ArrayList<>();
        for (String x : array) {
            list.add(Integer.parseInt(x));
        }
        Collections.sort(list);
        int dev = Integer.MAX_VALUE;
        Integer digit = Integer.parseInt(scanner.next());
        for (Integer y : list) {
           if (dev > Math.abs(y - digit)) {
               dev = Math.abs(y - digit);
           }
        }

        for (Integer z : list) {
           if (dev == Math.abs(z - digit)) {
               System.out.printf("%d ", z);
           }
        }
    }
}