package Strings;

public class Reverse {
    public static void main(String[] args) {

    }
    public static void reverse(String str){
        int start=str.charAt(0);
        int end = str.length()-1;
        while (start < end){

        }
    }
}
class reverse2 {
    public static void main(String[] args) {
        String str2 = "Hello";
        String rev ="";
        for (int i = str2.length()-1; i >=0 ; i--) {
           rev += str2.charAt(i);
        }
        System.out.println(rev);
    }
}
