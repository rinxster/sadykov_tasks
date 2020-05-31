package task_1;

public class task1 {
    public static void main(String[] args) {

        int arr[] = {26, 7, 5, 1, -10};

        int max=arr[0];
        int min =arr[0];
        float average;
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
            sum = sum + arr[i];

        }
        average =  (float) sum / (arr.length);
        System.out.println("Maximum number in array: " + max);
        System.out.println("Minimum number in array: " +min);
        System.out.println("Average number in array " + average);

    }

}
