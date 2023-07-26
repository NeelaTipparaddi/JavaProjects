import java.util.Arrays;
public class Sortanarray {
    
    public static void main (String[] args)
    {
        int [] array = new int [] {90, 23, 5, 109, 12, 67, 22, 34};
        Arrays.sort(array);
        System.out.println("Elements of array sorted");
    
    for(int i =0; i<=array.length; i++){
      System.out.println(array[i]);
    }
}
}
