import edu.princeton.cs.algs4.*;
public class Test1 {
    public static void main(String[] args) {
         int T = Integer.parseInt(args[0]);
         Point2D[] p = new Point2D[T];
         Interval1D xinterval = new Interval1D(0.0,1.0);
         Interval1D yinterval = new Interval1D(0.0,1.0);
         Interval2D box = new Interval2D(xinterval,yinterval);
         box.draw();
         for (int t = 0;t < T;t++) {
              double x = Math.random();
              double y = Math.random();
              p[t] = new Point2D(x,y);
              p[t].draw();
         }
         
         double minDistance = p[0].distanceTo(p[1]);
         Point2D[] minP = new Point2D[2];
         for (int d = 0;d < T;d++) {
             for (int s = d + 1;s < T;s++) {
                 if (minDistance > p[d].distanceTo(p[s])) {
                  minDistance = p[d].distanceTo(p[s]);
                  minP[0] = p[d];
                  minP[1] = p[s];
                 }
             }
         }
         StdOut.println("minDistance"+minDistance);
         StdOut.println("minP[0].x()="+minP[0].x());
         StdOut.println("minP[0].y()="+minP[0].y());
         StdOut.println("minP[1].x()="+minP[1].x());
         StdOut.println("minP[1].y()="+minP[1].y());
    }
}