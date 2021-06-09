package SelfMadeGame;

import org.newdawn.slick.*;
import org.newdawn.slick.Graphics;


import java.util.ArrayList;
import java.util.List;


public class Main extends BasicGame {

    public static final int GRID_SIZE = 40;
    public static final int CLOCK = 500;

    private List<Actor> actors;
    private Player tail, tip;
    private int elapseTime = 0;

    public Main(String title) {
        super(title);
    }


    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();

        Player p1 = new Player(100, 100);
        Player p2 = new Player(101, 100);
        Player p3 = new Player(102, 100);
        Player p4 = new Player(103,100);

        p1.setNext(p2);
        p2.setNext(p3);
        p3.setNext(p4);

        this.tail = p1;
        this.tip = p4;

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : this.actors) {
            actor.update(gameContainer, delta);
        }
         System.out.println("ping");


        this.elapseTime += delta;
        if (this.elapseTime > CLOCK) {

            Player tmp = this.tail;
            this.tail = tmp.getNext();
            tmp.setNext(null);
            tip.setNext(tmp);

            //Bewegung
            int newX = this.tip.getX();
            int newY = this.tip.getY();

            newX--;
            if(newX < 500){
                newX = 0;
            }

            newY--;
            if (newY < 0) {
                newY = 100;
            }
            tmp.setX(newX);
            tmp.setY(newY);
            this.elapseTime = 0;

        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor : this.actors) {
            actor.render(gameContainer, graphics);
        }

    }


    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Main("SnackeGame"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();

        }
    }
}
