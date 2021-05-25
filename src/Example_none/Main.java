package Example_none;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String name = "Jan Andrzej Kowalski";
        //System.out.println(name.trim() + " 1");

        System.out.println(name.indexOf(" "));

        System.out.println(name.substring(name.lastIndexOf(" ")+1));
        int from = name.lastIndexOf(" ");
        System.out.println(name.substring(from + 1));

        String name2 = "Jan Kowalski-Nowak";
        name2 = name2.substring(name2.indexOf("-") + 1);
        System.out.println(name2);

        int[] arr = {1, 2 ,3};
        System.out.println(Arrays.toString(arr));
        arr[0] = 7;
        System.out.println(Arrays.toString(arr));
    }
}
