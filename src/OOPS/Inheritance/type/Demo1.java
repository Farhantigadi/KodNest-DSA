package OOPS.Inheritance.type;

public class Demo1 {
    int a ;
    String b;

   Demo1() {
       super();
   }
   Demo1(int a) {
       this.a = a;
   }
   Demo1(int a,String b) {
       this.a = a;
       this.b=b;
   }
   Demo1(String b) {
       this.b = b;
   }
}
 class Demo2  {
    String c;
    String d;
    Demo2() {
        super();
    }
    Demo2(String c) {
        this.c = c;
    }
    Demo2(String c ,String d) {
        this(c);
        this.d = d;
    }
 }
