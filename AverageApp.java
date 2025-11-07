import java.util.Scanner;

public class AverageApp {
    static Scanner userinput = new Scanner(System.in);

    //This method takes the average of an array of integers.
    static double calculateAverage(double[] nums){

        //Initialize variables to hold the count, sum, and average.
        int count = 0;
        int sum = 0;
        double average;

        //Iterate through the array of doubles.
        for(int i = 0; i < nums.length; i++){
            //Add one to the count.
            count++;
            //Add each double in the array into the sum variable.
            sum += nums[i];
        }

        //Calculate the average.
        average = (double)sum/count;

        //Return the average.
        return average;
    }

    public static void main(String[] args) {

        //Initialize an integer to hold the number of doubles the user wants to enter.
        int numQuantity;

        //Formatting.
        System.out.println("\n");

        //Prompt the user for the numver of doubles they want to enter.
        System.out.print("Enter how many numbers you want to take the average of --> ");
        numQuantity = userinput.nextInt();
        userinput.nextLine();

        //Initialize an array of doubles to hold the numbers the user entered.
        double[]  userNums = new double[numQuantity];

        //Iterate through the legth of the array.
        for (int i = 0; i < numQuantity; i++){
            //Formatting.
            System.out.println("\n");
            
            //Prompt the user to enter each double.
            System.out.print("Enter number " + i + " --> ");
            userNums[i] = userinput.nextDouble();
            userinput.nextLine();
        }

        //Call the calculateAverage method and store the value in a double called userAverage.
        double userAverage = calculateAverage(userNums);

        //Formatting.
        System.out.println("\n");

        //Display the average, to two decimal places.
        System.out.format("The average of the numbers you entered is: %5.2f%n",userAverage);

        //Formatting.
        System.out.println("\n");

        //Close the scanner.
        userinput.close();

        //Tell the user the program is ending.
        System.out.println("The program is ending...");

        //Formatting.
        System.out.println("\n");
    }
}
