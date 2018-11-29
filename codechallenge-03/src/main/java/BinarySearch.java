public class BinarySearch {
   int binarySearch(int arr[], int x){
       int l = 0, r = arr.length-1;
       while (l<r){
           int mid = l + (r-1)/2;
           if(arr[mid] == x)
               return  mid;
           if(arr[mid] < x)
               l = mid + 1;
           else
               r = mid -1;
       }
       return  -1;
   }

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        int arr[] = {4,8,15,16,23,42};
        int n = arr.length;
        int x = 15;
        int result = obj.binarySearch(arr, x);
        if(result == -1)
            System.out.println(result);
        else
            System.out.println("element found at index "+ result );
    }
}
