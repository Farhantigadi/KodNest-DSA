public class pallindrome {
    public static void main(String[] args) {
        ispal(123321);
    }
    public static void ispal(int n){
        int or = n;
        int a =0;

        while (n != 0){

            a = a*10+n%10;
n = n/10;
        }
        if(a==or){
            System.out.println("pallin");
        }
    }
}
