import edu.princeton.cs.algs4.*;
public class statsbag
{
    public static void main(String[] args) {
         Bag<Double> numbers = new Bag<Double>();
         Stack<Integer> stack = new Stack<Integer>();
         
         for(int i=0 ;i <5;i++) {
             numbers.add(StdIn.readDouble());
             stack.push(StdIn.readInt());
         }
         int num = numbers.size();
         double sum = 0.0;
         for(Double x : numbers)
             sum +=x;
         double average = sum/num;
         double sum2 = 0.0;
        for(Double x :numbers)
            sum2 += (x - average)*(x - average);
        sum2 = Math.sqrt(sum2/(num - 1));
        StdOut.println("avarage = "+average);
        StdOut.printf("sum2 = %.2f\n",sum2);
        //stack reverse output
        for(Integer x : stack) 
            StdOut.println("i="+x);
        
    }
}