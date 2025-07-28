package Arrays;

public class MergeTwoAlphabeticalStrings {
    public static void main(String[] args) {
        mergedString("acxz","bd");

    }
    public static void mergedString(String str1 , String str2){
        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        int i=0,j=0;
        StringBuilder merge = new StringBuilder();
        while (i<ch1.length && j<ch2.length){
            if (ch1[i] < ch2[j]){
                merge.append(ch1[i++]);
            } else {
                merge.append(ch2[j++]);
            }

        }
        while (i<ch1.length){
            merge.append(ch1[i++]);
        }
        while (j<ch2.length) {
            merge.append(ch2[j++]);

        }
        System.out.println(merge);
    }
}
