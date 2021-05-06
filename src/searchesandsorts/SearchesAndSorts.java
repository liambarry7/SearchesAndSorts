package searchesandsorts;
import java.util.*;

public class SearchesAndSorts {

    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Integer> numberList = new ArrayList<>();
    
    public static int[] number = new int [15];
    public static Random rand = new Random();
    
    public static void main(String[] args) {
        getNumbers();
        boolean loop = true;
        while (loop == true) {
            System.out.println("1 - Linear Search");
            System.out.println("2 - Binary Search");
            System.out.println("3 - Bubble Sort");
            System.out.println("4 - Insertion Sort");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    LinearSearch();
                case 2:
                    BinarySearch();
                case 3:
                    BubbleSort();
                case 4:
                    InsertionSort();
                case 0:
                    System.exit(choice);
            }
        }

    }
    
    public static int randomNumbers(int min, int max) {
        return rand.nextInt((max-min)+1)+min;
    }
    
    public static void getNumbers() {
        
        for (int i = 0; i < number.length; i++) {
            number[i] = randomNumbers(1,25);
        }
        
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");            
        }
        
        System.out.println("");
        
    }
    
    public static void LinearSearch() {
        boolean valid = false;
        System.out.println("What number do you want to find?");
        int find = input.nextInt();
        for (int i = 0; i < number.length; i++) {
            if (number[i] == find) {
                valid = true;
            } else {
                System.out.print("");
            }
        }
        
        if (valid == true) {
            System.out.println("The list contains that number");
        } else {
            System.out.println("The list does no contain that number");
        }
    
    }
    
    public static void BinarySearch() {
        BubbleSort();
        
        int low = 0;
        int high = 10;
        int mid = (low + high) / 2;
        
        
        System.out.println("What number do you want to find?");
        int find = input.nextInt();
      
        while (true) {
            if (number[mid] > find) {
                mid = number[mid/2];
                
            } else if (number[mid] < find) {
                //go up
            } else if (number[mid] == find) {
                System.out.println("Your number has been found!");
            }
        }
        
        
    }
    
    public static void BubbleSort() {

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length - i - 1; j++) {

                if (number[j] > number[j + 1]) {
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;

                } else {
                    System.out.print("");
                }

            }
        }
        System.out.println(Arrays.toString(number));
        
        
    }
    
    

    public static void InsertionSort() {

    }
    
    
    
}
