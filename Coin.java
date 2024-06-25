import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Coin extends Actor {
    public Coin() {
        GreenfootImage image = getImage();
        image.scale(60, 60); // Atur ukuran koin sesuai kebutuhan
    }

    public void act() {
        setLocation(getX() - FlappyWorld.pipeSpeed, getY());
        if (getX() == 0) {
            getWorld().removeObject(this);
        }
    }
}
