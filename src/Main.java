import java.util.Scanner;

public class Main {
    public static int summinmax(int array[])
    {
        int max=array[0];
        int min=array[0];
        for(int i=1;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
            else if(array[i]<min)
            {
                min=array[i];
            }
        }
        int sum=max+min;
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size=scanner.nextInt();
        System.out.println("Enter the array values: ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println(summinmax(arr));
    }
}