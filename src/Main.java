import search.LinearSearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {11,33,44,55,66,77,88,3,99};
        int target  = 99;
        System.out.println(LinearSearch.linearSearch(arr,target));
        String name = "Rajan";
        char letter = 'a';
        System.out.println(LinearSearch.searchCharInString(name,letter));
        System.out.println("small");
        LinearSearch.getSmallestElement(arr);
    }
}