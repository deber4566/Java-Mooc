
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        
int[] numbers = {8, 3, 7, 9, 1, 2, 4};
MainProgram.sort(numbers);
    }
    
    public static int smallest(int [] myArr){
        int smallest = myArr[0];
        
        for (int i: myArr){
            if (smallest>i){
                smallest=i;
            }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int [] myArr){
        int smallest= myArr[0];
        int index=0;
        
        for (int i=0;i<myArr.length;i++){
            if (smallest>myArr[i]){
                smallest=myArr[i];
                index=i;
            }
        }
        
        return index;
    }
    
    public static int indexOfSmallestFrom(int [] myArr, int index){
          int smallest=myArr[index];
          
          int temp=index;
          
          for (int i=index;i<myArr.length;i++){
              if (smallest>myArr[i]){
                  smallest=myArr[i];
                  temp=i;
              }
          }
          
          return temp;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp=array[index1];
        
        array[index1]=array[index2];
        array[index2]=temp;
        
        
    }
    
    public static void sort(int [] array){
        
        int iterator=0;
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(array));
        
        while (iterator!=array.length-1){
            MainProgram.swap(array, iterator, MainProgram.indexOfSmallestFrom(array, iterator));
            
            iterator+=1;
            
            System.out.println(Arrays.toString(array));
        }
        
    }

}
