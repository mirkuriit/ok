package com.company;
 
public class Dots {
    private double x, y;
    public Dots(double x, double y){
        this.x = x;
        this.y = y;
    }
 
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
 
    public double getStart_to_Dot(){
        double x = this.x;
        double y = this.y;
        return Math.sqrt(x*x + y*y);
    }
 
    public double getDot_to_Dot(Dots first, Dots second){
        double x1 = first.getX(), y1 = first.getY();
        double x2 = second.getX(), y2 = second.getY();
        return Math.sqrt((x2 -x1)*(x2-x1) + (y2 -y1)*(y2-y1));
    }
 
    public double[] getMidpoint(Dots first, Dots second){
        double x1 = first.getX(), y1 = first.getY();
        double x2 = second.getX(), y2 = second.getY();
        double[] a = new double[2];
        a[0] = (x1+x2)/2;
        a[1] = (y1+y2)/2;
        return a;
    }
}
