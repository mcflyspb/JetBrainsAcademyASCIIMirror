package asciimirror;

import com.sun.source.tree.ArrayAccessTree;
import com.sun.source.tree.NewArrayTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    private static final String INPUT = "Input the file path:";
    private static final String FILE_NOT_FOUND = "File not found!";

    public static void main(String[] args)  {
        System.out.println(INPUT);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        File file = new File(userInput);
        List<String> list = new ArrayList<>();

        try (Scanner filescanner = new Scanner(file)) {
            while (filescanner.hasNext()) {
                list.add(filescanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(FILE_NOT_FOUND);
        }
        int maxStringLenght = 0;
        for (String x : list) {
            if (x.length() > maxStringLenght) {
                maxStringLenght = x.length();
            }
        }

        for (int k = 0; k < list.size(); k++) {
            if (list.get(k).length() < maxStringLenght) {
                StringBuilder spaceString = new StringBuilder();
                spaceString.append(list.get(k));
                for (int z = list.get(k).length(); z < maxStringLenght; z++) {
                    spaceString.append(" ");
                }
                list.set(k, spaceString.toString());
            }
        }

        List<String> list2 = new ArrayList<>();
        for (String x : list) {
            String[] temp = x.split("");
            for (int z = 0; z < temp.length; z++) {
                if (Objects.equals(temp[z],")")) {
                    temp[z] = "(";
                } else if (Objects.equals(temp[z],"(")) {
                    temp[z] = ")";
                } else if (Objects.equals(temp[z],"]")) {
                    temp[z] = "[";
                } else if (Objects.equals(temp[z],"[")) {
                    temp[z] = "]";
                } else if (Objects.equals(temp[z],"<")) {
                    temp[z] = ">";
                } else if (Objects.equals(temp[z],">")) {
                    temp[z] = "<";
                } else if (Objects.equals(temp[z],"\\")) {
                    temp[z] = "/";
                } else if (Objects.equals(temp[z],"/")) {
                    temp[z] = "\\";
                }


            }
            StringBuilder output = new StringBuilder();
            for (int z = temp.length - 1; z >= 0; z--) {
                output.append(temp[z]);
            }
            list2.add(output.toString());
        }


        for (int x = 0; x < list.size(); x++) {
            System.out.printf("%s",list.get(x));
            System.out.print(" | ");
            System.out.printf("%s",list2.get(x));
            System.out.println();
        }
    }
}