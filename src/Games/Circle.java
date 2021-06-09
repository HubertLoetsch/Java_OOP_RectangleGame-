package Games;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Shape;


public class Circle implements Actor {
    private float x, y, t;
    private float diameter = 50.0f;
    private float speed;
    private ObjectsGame.Direction direction;
    private Shape collisionshape;

    public Circle(float x, float y, float speed, ObjectsGame.Direction direction) {
        this.x = x;
        this.y = y;
        this.t = this.y;
        this.diameter = diameter;
        this.speed = speed;
        this.direction = direction;
        this.collisionshape = new org.newdawn.slick.geom.Circle(this.x,this.y,this.diameter);

    }

//    public Circle() {
//    }


    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, this.diameter, this.diameter);
        graphics.draw(collisionshape);
    }

    @Override
    public void update(GameContainer gameContainer,int delta) {
        if (direction == ObjectsGame.Direction.RIGHT) {
            this.x += (float) delta / this.speed;
            this.y += (float) delta / this.speed;
            this.diameter += (float) delta / this.speed;
            if (x > 2800 || y > 1500) {
                this.x = 0;
                this.y = this.t;
                this.diameter = 0;
            }
        }
        if (direction == ObjectsGame.Direction.LEFT) {
            this.x -= (float) delta / this.speed;
            this.y -= (float) delta / this.speed;
            this.diameter -= (float) delta / this.speed;
            if (x < -100 || y < -100) {
                this.x = 2900;
                this.y = this.t;
                this.diameter = 0;
            }
        }
    }

    public float getDiameter() {
        return diameter;
    }

    public void setT(float t) {
        this.t = t;
    }

}