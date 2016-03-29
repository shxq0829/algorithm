//对于原始数据类型，是赋值；对于抽象数据类型，是引用。
//习题：1.2.4
import edu.princeton.cs.algs4.*;
public class Test2 {
    public static void main (String[] args) {
         String string1 = "hello";
         String string2 = string1;
         string1 = "world";
         StdOut.println(string1);
         StdOut.println(string2);
         int a = 1;
         int b = a;
         b = 2;
         StdOut.println(a+""+b);
         Counter c1 = new Counter("ones");
         c1.increment();
         Counter c2 = c1;
         c2.increment();
         StdOut.println(c2);
    }
}