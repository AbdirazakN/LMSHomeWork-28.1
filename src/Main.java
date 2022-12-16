import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        /**Integer массивден жуп сандарды терип алынызда алардын квадраттарынын эн чонун табыныз. */

        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 16, 25};

        System.out.println("All numbers:  ");
        System.out.println(Arrays.toString(integers));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nOnly EVEN numbers:  ");
        System.out.println(Arrays.stream(integers).filter(integer -> integer % 2 == 0).toList());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nSquare these numbers: ");
        System.out.println(Arrays.stream(integers).filter(integer -> integer % 2 == 0).map(s -> s * s).toList());
        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nThe MAXIMUM even number is: ");
        System.out.println(Arrays.stream(integers).filter(integer -> integer % 2 == 0).map(s -> s * s).max(Comparator.comparing(Integer::intValue)).stream().toList());
    }
}