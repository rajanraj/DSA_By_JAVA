package search;

public class LinearSearch {

// search int in int array.
    public static boolean linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for (int element:arr
             ) {
            if(element == target){
                System.out.println(element);
                return true;
            }
        }
        return false;
    }

    //search char in a string

    public static boolean searchCharInString(String name, char target){
        if(name.length() == 0){
            return false;
        }
        for (char element:name.toCharArray()
             ) {
            if(element==target){
                System.out.println(element);
                return true;
            }
        }
        return false;
    }

    //find the smallest element in the given array.
    public static int getSmallestElement(int[] arr){
        int temp = arr[0];
        for (int i= 1;i<arr.length;i++) {
            if(arr[i]<temp){
                temp = arr[i];
                System.out.println(temp);
                return temp;
            }
        }
        return -1;
    }
}
