package Tasks;
                             /* Day 4 and 5 Task 1 */
import java.util.Scanner;

public class Matrix {
    int rows;
    int cols;
    int[][] data;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }

    public void fill(int[] values) {
        if (values.length != rows * cols) {
            throw new IllegalArgumentException("Number of values provided are bigger than matrix dimensions");
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = values[i*cols+j];
            }
        }
    }
    
    public void print() {
    	 for (int i=0; i<data.length; i++) {
    		 int[] row = data[i];
    		 for (int j = 0; j < row.length; j++) {
    			    int value = row[j];
                 System.out.print(value + " ");
             }
             System.out.println();
         }
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print(" Enter dimensions of matrix ");
    	int m=sc.nextInt();
    	int n=sc.nextInt();
        Matrix matx = new Matrix(m,n);
        int[] values=new int[m*n];
        System.out.print(" Enter the values of Matrix ");
        for(int i=0; i<m*n; i++) {
        	values[i]=sc.nextInt();
        }
        matx.fill(values);
       matx.print();
        sc.close();
    }
}

