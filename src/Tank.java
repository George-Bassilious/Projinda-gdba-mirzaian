
import java.lang.Math;

public class Tank {

    public float xCoord;
    public float yCoord;
    public int velocity;
    public double angle;


    public Tank(int xCoord,int yCoord, int velocity,double angle ){
        this.xCoord=xCoord;
        this.yCoord=yCoord;
        this.velocity=velocity;
        this.angle=angle;
    }

    public int getSpeed(){
        return velocity;
    }

    public float getxCoord(){
        return xCoord;
    }

    public double getAngle(){
        return angle;
    }

    public float getyCoord(){
        return yCoord;
    }

    public void setxCoord(int x){
        xCoord=x;
    }
    public void setAngle(double angle1){
        angle=angle1;

    }

    public void setyCoord(int y){
        yCoord=y;
    }

    public void rotate(double change, double direction){

    }
    public void move(int direction,double angle){



        double xChange= Math.cos(angle)*direction;
        double yChange= Math.sin(angle)*direction;

        xCoord+= xChange;
        yCoord+= yChange;


    }

}
