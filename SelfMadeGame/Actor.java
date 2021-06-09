package SelfMadeGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public interface Actor {
    public void render(GameContainer gameContainer,Graphics graphics);
    public void update(GameContainer gameContainer,int data);
}
