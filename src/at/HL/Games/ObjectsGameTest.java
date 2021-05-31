package at.HL.Games;

import org.newdawn.slick.*;

public class ObjectsGameTest extends BasicGame {

    private float x;
    private float y;
    private float speed;


    public ObjectsGameTest(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException { //Objekte Zusammenbauen
        this.x = 100;
        this.speed = 4.0f;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException { //Wird immer wieder aufgerufen
        System.out.println(delta);

        this.x += (float)delta/speed;
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        //Rechteck
        graphics.drawRect(this.x, this.y, 200, 200);
        //Oval
        graphics.drawOval(30, this.y, 800, 400);
        //Kreis
        graphics.drawArc(this.x, 10, 300, 300, 0, 3000);


        graphics.drawString("Hello World", 1000, 1500);

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsGameTest("Rectangles"));
            container.setDisplayMode(3000, 2000, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }


}
