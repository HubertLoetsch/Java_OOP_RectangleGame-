package Games;

import org.newdawn.slick.*;

import java.util.*;

public class ObjectsGame extends BasicGame {
    private List<Actor> actors;
    enum Direction {LEFT, RIGHT}
    Direction direction;
    private Rocket rocket;


    public ObjectsGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException { //Objekte Zusammenbauen
        this.actors = new ArrayList<>();
        Random random = new Random();
/*
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

 */
        //Rocket player

        Rocket rocket = new Rocket();
        this.rocket = rocket;
        this.actors.add(rocket);

        //Methode Rectangle
        for (int i = 0; i < 0; i++) {
            Rectangle rectangle = new Rectangle(random.nextInt(1500), random.nextInt(1800),10,Direction.RIGHT);
            this.actors.add(rectangle);
        }
        //Methode Circle
        for (int i = 0; i < 5; i++) {
            Circle circle = new Circle(random.nextInt(1500), random.nextInt(1800),5,Direction.RIGHT);
            this.actors.add(circle);
        }
        //Methode Ellipse
        for (int i = 0; i < 0; i++) {
            Ellipse ellipse = new Ellipse(random.nextInt(1500), random.nextInt(1800), 4,Direction.LEFT);
            this.actors.add(ellipse);

        }




    }


    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : this.actors) {
            actor.update(gameContainer,delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor : this.actors) {
            actor.render(graphics);
        }

    }

    //Tasteneingabe
    public void keyPressed(int key, char c){
        if(key== Input.KEY_SPACE){
            System.out.println("BOOM");
            Cannonboll cb = new Cannonboll(this.rocket.getX(),this.rocket.getY());
            this.actors.add(cb);
        }

    }




    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsGame("Rocket Game"));

            container.setDisplayMode(3000, 2000, false);
            container.start();

        } catch (SlickException e) {
            e.printStackTrace();

        }
    }


}
