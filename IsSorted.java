public class IsSorted {

    // Public function: called by the user
    public static boolean isSorted(int[] a) {
        return isSorted(a, 0);
    }

    // Helper recursive function
    private static boolean isSorted(int[] a, int i) {
       if (i + 1 == a.length) {
        return true; 
       }
       if (a[i+1] < a[i]){
       return false; 
       }
       return (isSorted (a, i+1));
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 5};
        System.out.println(isSorted(a)); // true

        int[] b = {1, 3, 2, 0};
        System.out.println(isSorted(b)); // false
    }
}
