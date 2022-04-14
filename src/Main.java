import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveValue = new ArrayList<>();
        for (Integer value: intList) {
            if (value > 0 && value % 2 == 0) {
                positiveValue.add(value);
            }
        }
        positiveValue.sort(Comparator.naturalOrder());
        System.out.println(positiveValue);


    }
}
