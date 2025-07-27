package Arrays.SlidingWindow;

public class LongestSubStringTwoOccurence {
    public static void main(String[] args) {
        String str = "aabacccd";
        subString(str);
    }
    public static void subString(String str) {
        int max =0;
        String LongestSubstring ="";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <=str.length(); j++) {

                String substring = str.substring(i, j);
                System.out.print(substring + " ");
                max = Math.max(max,substring.length());
              if (LongestSubstring.length()<substring.length()){
                  LongestSubstring = substring;
              }
            }
            System.out.println();
        }
        System.out.println(LongestSubstring+"  and max length is " + max);
    }
}
class prac{
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        int target =3;
        int elements  = 3;


    }
    public static void KClosest(int arr[],int target,int elements){
        int j=0;
        int newArr [] = new int[arr.length];
        int result [] = new int[elements];
        for (int i = 0; i < arr.length; i++) {
            newArr[j++]  = arr[i]-target;
        }
        for (int i = 0; i < newArr.length; i++) {
            
        }
    }
}