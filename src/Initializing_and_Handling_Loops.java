import java.util.Scanner;
import java.util.Random;
public class Initializing_and_Handling_Loops
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int[] dataPoints = new int[100];
        for (int x = 0; x < dataPoints.length; x++) {
            dataPoints[x] = rnd.nextInt(100) + 1;
        }
        for (int x = 0; x < dataPoints.length; x++) {
            System.out.print(dataPoints[x] + " | ");
        }
        int sum = 0;
        for ( int x = 0; x < dataPoints.length; x++) {
            sum += dataPoints[x];
        }
        double average = (double) sum / dataPoints.length;
        System.out.println();
        System.out.println("The sum of the random array data points is: " + sum);
        System.out.println("The average of the random array data points is: " + average);
        int userVal = SafeInput.getRangedInt(in, "Enter a value to search for", 1, 100);
        int count = 0;
        for (int x = 0; x < dataPoints.length; x++) {
            if (dataPoints[x] == userVal) {
                count++;
            }
        }
        System.out.println("The value " + userVal + " was found " + count + " times in the array");
        userVal = SafeInput.getRangedInt(in, "Enter another value to search for", 1, 100);
        int position = -1;
        for (int x = 0; x < dataPoints.length; x++) {
            if (dataPoints[x] == userVal) {
                position = x;
                break;
            }
        }
        if (position != -1) {
            System.out.println("The value " + userVal + " was found at array index " + position);
        } else {
            System.out.println("The value " + userVal + " was not found in the array");
        }
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int x = 1; x < dataPoints.length; x++) {
            if (dataPoints[x] < min) {
                min = dataPoints[x];
            }
            if (dataPoints[x] > max) {
                max = dataPoints[x];
            }
        }
        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);
    }
}
