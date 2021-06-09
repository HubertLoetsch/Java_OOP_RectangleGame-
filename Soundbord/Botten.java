package Soundbord;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Botten implements Actor{

    private float x,y;

    public Botten(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawRoundRect(this.x,this.y,200,80,20);

    }

    @Override
    public void update(GameContainer gameContainer, int data) {

    }
}
