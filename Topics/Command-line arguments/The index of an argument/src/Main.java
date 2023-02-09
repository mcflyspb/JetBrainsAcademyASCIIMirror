import java.util.Arrays;
import java.util.Objects;

class Problem {
    public static void main(String[] args) {
        int counter = 0;
        for (int z = 0; z < args.length; z++) {
            if (Objects.equals(args[z], "test")) {
                counter = z;
                break;
            }
        }

        System.out.println(counter > 0 ? counter : "-1");
    }

}