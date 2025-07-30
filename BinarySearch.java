/******************************************************************************
DSA THROUGH JAVA
BINARY SEARCH:-
Binary Search is a fast search method that works by dividing the sorted list in half until the item is found

HOW IT WORKS:-
1.Set two pointers:

low = 0 (start of the array)

high = length - 1 (end of the array)

2.Find the middle index:
mid = (low + high) / 2

3.Compare the middle element with the target:

If it's a match →Done 

If target < middle → search in left half

If target > middle → search in right half

4.Repeat the process by updating low and high until the element is found or the range is empty.

TIME COMPLEXITIES:-
Best Case	O(1)	Target is found at the first middle check.
Average Case	O(log n)	Each step cuts the search range in half.
Worst Case	O(log n)	Keeps dividing until only 1 element is left.
*******************************************************************************/
class BinarySearch{
    public static void main(String[]args){
        int arr[]={10,20,30,40,50,60};
        int left=0;
        int right=arr.length-1;
        int target=30;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
        System.out.println("Target is found at: "+mid);
        return;
        }
    if (target<arr[mid]){
        right=mid-1;
    }else{
        left=mid+1;
     }
    }
      System.out.println("Not found");
  }
}


