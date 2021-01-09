/**
 * Created on 09/Jan/2021 to Monotonic-Array
 */
public class monotonicArray {

    private static boolean monotonicDecreasing(int[] matrix){
        boolean isMonotonic = false;

        for(int i = 0; i < matrix.length - 1; i++){
            if(matrix[i] > matrix[i + 1]){
                isMonotonic = true;
            }
            else{
                isMonotonic = false;
                break;
            }
        }
        return isMonotonic;
    }

    private static boolean monotonicIncreasing(int[] matrix){
        boolean isMonotonic = false;

        for(int i = 0; i < matrix.length - 1; i++){
            if(matrix[i] < matrix[i + 1]){
                isMonotonic = true;
            }
            else{
                isMonotonic = false;
                break;
            }
        }
        return isMonotonic;
    }

    public static void main(String args[]){
        int[] matrix = {25,23,19,16,9,7};

        if(monotonicIncreasing(matrix) || monotonicDecreasing(matrix)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
