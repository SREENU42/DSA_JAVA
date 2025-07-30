/******************************************************************************
DSA THROUGH JAVA
Linear Search:-Linear Search is the simplest searching algorithm.
It checks each element in the list one by one until it finds the target value or reaches the end.
HOW IT WORKS:-Start from the first element.

Compare it with the target.

If found, return the index.

If not, move to the next element.

If you reach the end and still not found, return -1.

TIME COMPLEXITY:
If the target is found at the 1st Array it will be best case 0(1)
If the target is found at the middle of array it will be Average case 0(n)
If the target is not found it will be 0(n)
*******************************************************************************/
class LinearSearch{
    public static void main(String[] args){
        int[] arr={10, 20, 30, 40, 50};
        int target=30;
        boolean found=false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                System.out.println("Target is found at index: "+i);
                found=true;
                break;
            }
            }
            if(!found){
                System.out.println("Target is not found");
            }
        }
    }