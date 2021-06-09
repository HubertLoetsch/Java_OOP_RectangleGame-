package SnakeGame;
import org.newdawn.slick.geom.Shape;
abstract class CollisionActor implements Actor{

    private Shape collisionShape;

    public CollisionActor() {
    }



    public Shape getCollisionShape() {
        return collisionShape;
    }

    public void setCollisionShape(Shape collisionShape) {
        this.collisionShape = collisionShape;
    }
}

