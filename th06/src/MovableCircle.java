public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x,int y, int xSpeed, int ySpeed,int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
    }

    public MovableCircle(int x, int y, int xSpeed, int ySpeed) {
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius=0;
    }


    @Override
    public String toString() {
        return "MovableCircle{}"+center.toString()+" r= "+radius;
    }

    @Override
    public void moveUp() {
        center.y+=center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x-=center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x+= center.xSpeed;
    }

    @Override
    public void moveDown() {
        center.y-= center.ySpeed;
    }
}
