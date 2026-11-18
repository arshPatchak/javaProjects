import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        char ans ='x'; 
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        // Populate the 3x3 matrix with random numbers from 0 to 9
    do {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = random.nextInt(10); // 10 is exclusive, so it generates 0-9
            }
        }
        // Print the matrix
        System.out.println("Generated 3x3 Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        } 
    System.out.print("Generate Random Numbers Again?:");
    ans = in.next().charAt(0);
    }while(ans=='y');
}  }
