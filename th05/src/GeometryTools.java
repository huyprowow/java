import java.util.ArrayList;
import java.util.List;

public class GeometryTools {
    final static double EPSILON=0.001;
    public static boolean detectInCircle(double px, double py, double circleX, double circleY, double radius){
        return (px -circleX)*(px -circleX) + (py - circleY)*(py - circleY) < radius*radius + EPSILON;
    }
    public static boolean detectInPolygon(double px, double py, double[] xCoords, double[] yCoords){
        int i=0;
        //giả định rằng điểm không nằm trên cạnh của đa giác, nên dấu tính toán sẽ không bao giờ chính xác bằng 0.
        List<Integer> listSign=new ArrayList<Integer>();
        while(i<xCoords.length){
            if(i==xCoords.length-1){
                // coord1 to coordLast
                double vX=xCoords[0] - xCoords[i];
                double vY= yCoords[0] - yCoords[i];
                //coordLast to point
                double uX=px - xCoords[i];
                double uY= py - yCoords[i];
                if(vX*uY-vY*uX>0){
                    listSign.add(1);
                }
                if(vX*uY-vY*uX<0){
                    listSign.add(-1);
                }
            }else{
                // coord1 to coord2
                double vX=xCoords[i+1] - xCoords[i];
                double vY= yCoords[i+1]-yCoords[i];
                //coord1 to point
                double uX=px - xCoords[i];
                double uY= py - yCoords[i];
                if(vX*uY-vY*uX>0){
                    listSign.add(1);

                }
                if(vX*uY-vY*uX<0){
                    listSign.add(-1);
                }
            }
            i++;
        }
        boolean positive=true;
        boolean negative=true;
        for (Integer integer : listSign) {
            if (integer < 0) {
                positive = false;
            }
            if (integer > 0) {
                negative = false;
            }
        }
        return (positive||negative);
    }

    public static void main(String[] args) {
        //test:
        //If you are not able to do so, you should ask a TA or instructor for help. After this, you may run the test
        //program by typing

    }
}
