//例子：可以读取文件的数据，但是不能读取网站的数据
import edu.princeton.cs.algs4.*;
public class ReadNet {
    public static void main (String[] args) {
        Out out = new Out(args[args.length-1]);
        In in = new In(args[0]);
        String s = in.readAll();
        out.println(s);
        in.close();
        out.close();
    }
 }