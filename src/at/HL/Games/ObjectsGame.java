package at.HL.Games;

import org.newdawn.slick.*;

import java.util.*;

public class ObjectsGame extends BasicGame {
    private List<Actor> actors;
    enum Direction {LEFT, RIGHT}
    Direction direction;


    public ObjectsGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException { //Objekte Zusammenbauen

        this.actors = new ArrayList<>();
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.println("1 LEFT, 2 RIGHT");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                direction = Direction.LEFT;
                break;
            case 2:
                direction = Direction.RIGHT;
                break;
        }


        //Methode Rectangle
        for (int i = 0; i < 1000; i++) {
            Rectangle rectangle = new Rectangle(random.nextInt(1500), random.nextInt(1800),3,direction);
            this.actors.add(rectangle);
        }
        //Methode Circle
        for (int i = 0; i < 1000; i++) {
            Circle circle = new Circle(random.nextInt(1500), random.nextInt(1800),7,direction);
            this.actors.add(circle);
        }
        //Methode Ellipse
        for (int i = 0; i < 1000; i++) {
            Ellipse ellipse = new Ellipse(random.nextInt(1500), random.nextInt(1800), 4,direction);
            this.actors.add(ellipse);
        }
    }
        /*
        for (int i = 0; i < 10; i++) {
            Rectangle rectangle = new Rectangle(random.nextInt(2000), random.nextInt(2000), random.nextInt(10));
            Circle circle = new Circle(random.nextInt(2000), random.nextInt(2000), random.nextInt(50));
            Ellipse ellipse = new Ellipse(random.nextInt(2000), random.nextInt(2000), random.nextInt(5));
            this.actors.add(circle);
            this.actors.add(rectangle);
            this.actors.add(ellipse);
         */

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : this.actors) {
            actor.update(delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor : this.actors) {
            actor.render(graphics);
        }

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsGame("Das beste spiel Überhaupt"));


            container.setVSync(true);
            container.setDisplayMode(3000, 2000, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();

        }
    }


}
