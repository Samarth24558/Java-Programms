import java.util.Scanner;

public class sum_of_digonal_matrix {

    public static void main(String[] args) {
        // java programme to find sum of diagonal matrix

        int[][] arr=new int[10][10];

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the length of array below 10: ");
        int len=input.nextInt();

        for (int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            { 
                System.out.print("Enter the value("+i+":"+j+"): ");
                int value=input.nextInt();
                arr[i][j]=value;
            }

        }
        int sum=0;
        for (int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            { 
                if (i==j)
                {    System.out.print(arr[i][j]);
                    sum=sum+arr[i][j];
                }
                System.out.print("  ");
            }
            System.out.println();

        }
        System.out.println("Sum of diagonal matrix is: "+sum);


        
    }
    
}
