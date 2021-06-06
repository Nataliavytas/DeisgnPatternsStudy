package Prototype;

public class Main {

    /**
     * Specify the kinds of objects to create using a prototypical
     * instance, and create new objects by copying this prototype.
     */
    public static void main(String[] args) {

        Enemy baseEnemy = new Enemy("image1.png", 0, 100, 2);

        Enemy enemy1 = new Enemy(baseEnemy);
        Enemy enemy2 = new Enemy(baseEnemy);
        Enemy enemy3 = new Enemy(baseEnemy);

        enemy1.setPosX(100);
        enemy2.setPosX(150);
        enemy3.setPosX(200);

        Enemy baseEnemy2 = new Enemy("image1.png", 0, 200, 2);

        Enemy enemy4 = baseEnemy2.clone();
        Enemy enemy5 = baseEnemy2.clone();
        Enemy enemy6 = baseEnemy2.clone();

        enemy4.setPosX(100);
        enemy5.setPosX(150);
        enemy6.setPosX(200);


    }
}
