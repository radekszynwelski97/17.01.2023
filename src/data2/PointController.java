package data2;

import data.Point;

public class PointController {

    int x ;
    int y ;


    public void AddX(Point p ){
        p.setX(p.getX()+1);

    }

    public void minusX(Point p ){
        p.setX(p.getX() - 1);

    }

    public void addY(Point p ){
        p.setX(p.getY() + 1);

    }

    public void minusY(Point p ){
        p.setY(p.getY() - 1);

    }
}
