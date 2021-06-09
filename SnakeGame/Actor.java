package SnakeGame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

interface Actor {
    void update(GameContainer gameContainer, int delta) throws SlickException;
    void render(GameContainer gameContainer, Graphics graphics) throws SlickException;
}
