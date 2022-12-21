package BinarySearch;
  public class PeakIndexInMountainarray {

      static int peakElementInArray(int arr[]){
          int start = 0 ;
          int end = arr.length -1 ;
          int mid = start + (end - start) / 2 ;
           while (start < end ){
                if (arr[mid] < arr[mid+1]){
                    start = mid + 1 ;
                }
                else {
                    end = mid;
                }
                mid  = start + (end - start) / 2 ;
           }
           return start;
      }
      public static void main(String[] args) {

          int arr[] = { 1,2,3,4,5,6,3,4,1};
          System.out.println(peakElementInArray(arr));
      }
}
