package BinarySearch;
    public class FirstAndLastPosition {
        static int firstOcc(int arr[], int key){
            int start = 0, end = arr.length-1, ans = -1 ;
            int mid = start + (end - start) / 2 ;
            while(start <= end){
                if (arr[mid] == key){
                    ans = mid ;
                    end = mid -1 ;
                } else if (arr[mid] < key) {
                    start = mid + 1 ;
                } else if (arr[mid] > key) {
                    end = mid -1 ;
                }
                mid = start + (end - start) / 2 ;
            }
            return  ans ;
        }

        static int lastOcc(int arr[], int key){
            int start =0, end = arr.length-1 ;
            int ans = -1, mid = start + (end-start) / 2;

            while (start <= end){
                if (arr[mid] == key){
                    ans = mid ;
                    start = mid + 1;
                } else if (arr[mid] < key) {
                    start = mid +1 ;
                } else if (arr[mid] > key) {
                    end = mid -1 ;
                }
                mid = start + (end - start) / 2 ;
            }
            return ans ;
        }
        public static void main(String[] args) {
            int arr[] = {1,2,3,3,3,3,3,5};
            int key = 3 ;
            System.out.println("first occurence of "+key+" is : "+firstOcc(arr,key));
            System.out.println("last occurence of "+key+" is : "+lastOcc(arr, key));

            int totalOcc = (lastOcc(arr,key) - firstOcc(arr,key) );
            System.out.println("Toatal number of occurence is = "+totalOcc);
        }
}
