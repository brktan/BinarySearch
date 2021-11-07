import java.util.*;

public class BinarySearch {

    public static void binarySearch() {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        List<Integer> List = createArray();
        int search;
        boolean found = true;

        System.out.println("Keep Numbers From 1-100: ");
        int guess = scan.nextInt();

        int pivot = List.size() / 2;
        search = List.size() / 2;
        while (found) {

            System.out.println("Is Your Number " + search + "?");
            String answer = scan2.next();

            if (answer.equals("yes")) {
                System.out.println("The Number You Are Holding Has Been Found: " + search);
                found = false;
            } else {
                System.out.println("Is It Greater Than " + search + "?");
                answer = scan2.next();

                if (answer.equals("yes")) {

                    List = List.subList(pivot, List.size());
                    pivot = (pivot + 1) / 2;
                    search = List.get(pivot);

                } else {

                    List = List.subList(0, pivot);
                    pivot /= 2;
                    search = List.get(pivot);

                }
            }
        }
    }

    public static List<Integer> createArray() {
        List<Integer> List = new ArrayList<>();

        for (int i = 1; i < 101; i++)

            List.add(i);

        return List;
    }

    public static void main(String[] args) {

        binarySearch();

    }
}
