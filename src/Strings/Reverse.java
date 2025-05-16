package Strings;

public class Reverse {
    public static void main(String[] args) {
   reverse("hello");
    }
    public static void reverse(String  str){
        char []str2 = str.toCharArray();
        int start=0;
        int end = str2.length-1;

        while (start < end){
     char temp = str2[start];
            str2[start]=str2[end];
            str2[end]=temp;
            start++;
            end--;
        }
        System.out.println(str2);
    }
}
class reverse2 {
    public static void main(String[] args) {
        String str2 = "Hello World";
        //to remove spaces
       //   str2=str2.replaceAll("\\s","");
        String rev ="";
        for (int i = str2.length()-1; i >=0 ; i--) {
           rev += str2.charAt(i);
        }
        System.out.println(rev);
    }
}
class sunstring{
    public static void main(String[] args) {
        String str = "World Of java";
        System.out.println(str.substring(1,4));
    }
}
