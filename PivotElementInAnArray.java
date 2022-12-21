package BinarySearch;
    public class PivotElementInAnArray {

        static int getPivot(int arr[]){
            int start = 0 ;
            int end = arr.length-1;
            int mid = start + (end - start) / 2 ;

            while (start < end){
                if(arr[mid] >= arr[0])
                    start = mid + 1 ;
                else
                    end = mid ;
                mid = start + (end - start) / 2 ;
            }
            return end ;
        }
        public static void main(String[] args) {

            int arr[ ] = {3,8,10,17,1};
            System.out.println("Pivot element is at Index  = "+getPivot(arr));
        }
}
