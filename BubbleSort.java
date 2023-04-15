package hw14042023;

public class BubbleSort{
    public static void main(String[] args){
        int[] arr = {1,5,12,9,7};
        String[] strArr = {"on", "cat", "elephant", "bird", "a"};
        char[] charArr = {'d', 'a', 'e', 'b', 'c'};
        float[] floatArr = {3.5f, 1.2f, 9.8f, 2.1f, 5.6f};
        
        bubbleSort(arr);
        outputResult(arr);

        bubbleSort(strArr);
        outputResult(strArr); 
        
        bubbleSort(charArr);
        outputResult(charArr); 
        
        bubbleSort(floatArr);
        outputResult(floatArr); 

    }
    //bubble sorting algorithm
    static int[] bubbleSort(int[] arr){
        int size = arr.length;

        for(int step = 0; step < size - 1; step++) {

            for (int i = 0; i < size - step - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }


        return arr;
    }

    static String[] bubbleSort(String[] strArr){
        int size = strArr.length;

        for(int step = 0; step < size - 1; step++) {

            for (int i = 0; i < size - step - 1; i++) {
                if (strArr[i].length() > strArr[i + 1].length()) {
                	
                    String temp = strArr[i];
                    strArr[i] = strArr[i + 1];
                    strArr[i + 1] = temp;
                }
            }
        }

        return strArr;
    }
    
    static char[] bubbleSort(char[] charArr){
        int size = charArr.length;

        for(int step = 0; step < size - 1; step++) {

            for (int i = 0; i < size - step - 1; i++) {
                if (charArr[i] > charArr[i + 1]) {
                    char temp = charArr[i];
                    charArr[i] = charArr[i + 1];
                    charArr[i + 1] = temp;
                }
            }
        }


        return charArr;
    }
    
    static float[] bubbleSort(float[] floatArr){
        int size = floatArr.length;

        for(int step = 0; step < size - 1; step++) {

            for (int i = 0; i < size - step - 1; i++) {
                if (floatArr[i] > floatArr[i + 1]) {
                    float temp = floatArr[i];
                    floatArr[i] = floatArr[i + 1];
                    floatArr[i + 1] = temp;
                }
            }
        }


        return floatArr;
    }
    
    // function for displaying a message about the result
    static void outputResult(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println(" ");
    }
    
    static void outputResult(String[] strArr){
        for(int i = 0; i<strArr.length; i++){
            System.out.println(strArr[i]);
        }
        System.out.println(" ");
    }
    
    static void outputResult(char[] charArr){
        for(int i = 0; i<charArr.length; i++){
            System.out.println(charArr[i]);
        }
        System.out.println(" ");
    }
    static void outputResult(float[] floatArr){
        for(int i = 0; i<floatArr.length; i++){
            System.out.println(floatArr[i]);
        }
        System.out.println(" ");
    }
}
