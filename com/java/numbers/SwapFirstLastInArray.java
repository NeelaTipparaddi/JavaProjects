
public class SwapFirstLastInArray {
    public static void main (String[] args){
       int [] array = new int [] {12,23,4,5,6,9,27};
       int temp=0;
       temp=array[0];
       array[0]=array[array.length-1];
       array[array.length-1]=temp;

       for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
       }


    }
    
}
