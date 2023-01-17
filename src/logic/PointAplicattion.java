package logic;
import data2.PointController;
import data.Point;

public class PointAplicattion {
    public static void main(String[] args) {

        Point point1 = new Point(10 , 20);
        PointController pointController = new PointController();

        System.out.println("Punkt :" + point1.getX() + "; " + point1.getY() );
        pointController.AddX(point1);
        System.out.println("Punkt AddX to : " + point1.getX() + point1.getY() );
        pointController.AddX(point1);
        System.out.println("Punkt AddY to : " + point1.getX() + point1.getY() ) ;
        pointController.addY(point1);
        System.out.println("Punkt minusX to :" + point1.getX() + point1.getY() );
        pointController.minusX(point1);
        System.out.println("Punkt minus minusY to :  " + point1.getX() + point1.getY());
        pointController.minusY(point1);


    }
}
