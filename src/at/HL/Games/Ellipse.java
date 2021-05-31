package at.HL.Games;

import org.newdawn.slick.Graphics;

public class Ellipse implements Actor {

    private float x, y;
    private float speed;
    private ObjectsGame.Direction direction;


    public Ellipse(float x, float y, float speed, ObjectsGame.Direction direction) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direction = direction;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, 200, 80);
    }


    @Override
    public void update(int delta) {
        if (direction==ObjectsGame.Direction.LEFT) {
            this.x -= delta / this.speed;
            if (this.x < -100) {
                this.x = 2900;
            }
        } if (direction==ObjectsGame.Direction.RIGHT) {
            this.x += delta / this.speed;
            if (this.x > 2800){
                this.x = 0;
            }
        }


    }
}
