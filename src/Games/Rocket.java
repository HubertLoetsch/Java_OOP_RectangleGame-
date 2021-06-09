package Games;

import org.newdawn.slick.*;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class Rocket implements Actor{

    private Image rocketImage;
    private float x,y;
    private float speed;
    private Shape collisionshape;





    public Rocket() throws SlickException {
        Image tmp = new Image("testdata/Rocket12.png");
        this.rocketImage = tmp.getScaledCopy(200,200);

        this.collisionshape = new Rectangle(this.x,this.y,60,180);

    }

    @Override
    public void render(Graphics graphics) {
        rocketImage.draw(this.x,this.y);
        graphics.draw(this.collisionshape);
    }

    @Override
    public void update(GameContainer gameContainer, int data) {
        if(gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)){
            this.x ++;
        }
        if(gameContainer.getInput().isKeyDown(Input.KEY_LEFT)){
            this.x --;
        }
        if(gameContainer.getInput().isKeyDown(Input.KEY_UP)){
            this.y--;
        }

        if(gameContainer.getInput().isKeyDown(Input.KEY_DOWN)){
            this.y++;
        }
        this.collisionshape.setCenterX(this.x + 105);
        this.collisionshape.setCenterY(this.y + 100);



    }

    public float getX() {
        return x;// + 98;
    }

    public float getY() {
        return y;// - 10;
    }
}
