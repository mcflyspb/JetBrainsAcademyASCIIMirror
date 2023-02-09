import java.util.List;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        int countInFirstList = 0;
        int countInSecondList = 0;
        for (Integer x : list1) {
            if (x == elem) {
                countInFirstList++;
            }
        }

        for (Integer y : list2) {
            if (y == elem) {
                countInSecondList++;
            }
        }



        return countInFirstList == countInSecondList;
    }
}