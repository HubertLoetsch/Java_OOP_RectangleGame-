package Games;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Rectangle implements Actor{
    private enum DIRECTION {LEFT,RIGHT,DOWN,UP}
    private float x,y;
    private float speed;
    private ObjectsGame.Direction direction;

    public Rectangle(int x, int y, float speed,ObjectsGame.Direction direction) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direction = direction;
    }

    public void render(Graphics graphics){
        graphics.drawRect(this.x,this.y,200,200);
    }

    public void update(GameContainer gameContainer,int delta) {
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
