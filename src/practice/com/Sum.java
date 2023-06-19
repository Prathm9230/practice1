package practice.com;

public class Sum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Sum of the elements of given array is:"+sum);
    }

}
