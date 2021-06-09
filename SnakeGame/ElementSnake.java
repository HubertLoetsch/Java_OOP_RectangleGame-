package SnakeGame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class ElementSnake extends  Element {

    public ElementSnake(int x, int y) {

        super(x, y);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
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

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.fillOval(5 * SnakeGame.GRID_SIZE, 5 * SnakeGame.GRID_SIZE, SnakeGame.GRID_SIZE - 1, SnakeGame.GRID_SIZE - 1);

    }

}