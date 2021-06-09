package SelfMadeGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;


public class Player implements Actor {
    private int x,y;
    private Player next;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) {
        graphics.fillOval(this.x * Main.GRID_SIZE,this.y * Main.GRID_SIZE,Main.GRID_SIZE - 1,Main.GRID_SIZE -1);
    }//(this.x * Main.GRID_SIZE,this.y * Main.GRID_SIZE,Main.GRID_SIZE - 1,Main.GRID_SIZE -1)


    @Override
    public void update(GameContainer gameContainer, int delta)  {
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

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Player getNext() {
        return next;
    }

    public void setNext(Player next) {
        this.next = next;
    }
}
