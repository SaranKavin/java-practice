import java.util.*;

public class ShuffleArray {
public static void main(String[] args) {
Integer[] arr = {1, 2, 3, 4, 5};
List list = Arrays.asList(arr);
Collections.shuffle(list);
list.toArray(arr);
System.out.println(Arrays.toString(arr));
}
}
