package Soundbord;

import org.newdawn.slick.*;
import org.newdawn.slick.gui.AbstractComponent;
import org.newdawn.slick.gui.ComponentListener;
import org.newdawn.slick.gui.MouseOverArea;
import org.newdawn.slick.gui.TextField;

import java.security.cert.CertificateFactorySpi;
import java.util.List;


public class Main extends BasicGame {
    private Sound sound;
    private Image background;
    private TextField field;
    private GameContainer container;
    private Font font;
    private String message = "SoundBoard";
    private List<Actor> actors;


    public Main(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        sound = new Sound("Sound/Lachen.ogg");

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : this.actors) {
            actor.update(gameContainer,delta);

        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        /*
        for (Actor actor : this.actors) {
            actor.render(graphics);

         */

        background.draw(0, 0, 800, 500);

        graphics.setColor(Color.white);
        graphics.drawString("Press Space to play the sound", 500, 500);



        }


    public void keyPressed(int key, char c) {
        if (key == Input.KEY_SPACE) {
            sound.play();
        }
    }


    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Main("SoundBord"));
            container.setDisplayMode(1500, 1500, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
