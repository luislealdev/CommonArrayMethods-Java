import java.util.Arrays;

import javax.swing.JOptionPane;

public class Exe {
    public static void main(String[] args) {

        // SORT METHOD
        // Create array
        int[] numbers = new int[5];
        // User fills the array
        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of the position: " + i));
        }
        // Print the array
        System.out.println("The array numbers is:");
        for (int i = 0; i < 5; i++) {
            System.out.print("[" + numbers[i] + "]");
        }
        // FIRST METHOD "SORT"
        Arrays.sort(numbers);
        System.out.println("The sorted array numbers is:");
        for (int i = 0; i < 5; i++) {
            System.out.print("[" + numbers[i] + "]");
        }

        // FILL METHOD
        // Create array
        String[] words = new String[5];
        // Computer fills the array with the word "Hello"
        Arrays.fill(words, "Hello");
        // Print the array
        System.out.println("The array words is:");
        for (int i = 0; i < 5; i++) {
            System.out.print("[" + words[i] + "]");
        }

        // COPY ARRAY METHOD
        int numbersCopy[] = new int[numbers.length];
        System.arraycopy(numbers, 0, numbersCopy, 0, 5);
        // Print the array
        System.out.println("The numbersCopy array is:");
        for (int i = 0; i < 5; i++) {
            System.out.print("[" + numbersCopy[i] + "]");
        }
    }
}
