package BinarySearch;
public class BinarySearch {

    static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) /2;
        while (start<=end){
            if (arr[mid] == key )
                return mid ;
            if (arr[mid] < key )
                start = mid + 1 ;
            if (arr[mid] > key )
                end  =  mid -1;
            mid = start + (end - start) /2;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("time complexity of binary search is O(logn)");
        int a1[] = {1,2,3,4,5,6,6,7,8,989};
        int key = 4;
        System.out.println("The index of "+key+" is = "+binarySearch(a1, key));
    }
}