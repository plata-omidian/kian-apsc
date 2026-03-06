package polygon;

import java.awt.geom.*; // for Point2D.Double
public class Main {
    public static void main(String [] args)
    {
        IrregularPolygon myPolygon = new IrregularPolygon();
        double[][] parallelogramPoints = { { 90, -20 }, { 100, 60 }, { 90, 30 }, { 60, 10 } };
        for (double[] p: parallelogramPoints){
            Point2D.Double point = new Point2D.Double(p[0],p[1]);
            myPolygon.add(point);
        }
        myPolygon.draw();

        TestSuite.run();
    }
    
}
