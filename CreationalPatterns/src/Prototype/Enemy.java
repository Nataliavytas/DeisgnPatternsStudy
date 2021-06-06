package Prototype;

public class Enemy {

    private String image;
    private int posX;
    private int posY;
    private int life;

    public Enemy(String image, int posX, int posY, int life) {
        this.image = image;
        this.posX = posX;
        this.posY = posY;
        this.life = life;
    }

    public Enemy(Enemy enemy){
        this.image = enemy.getImage();
        this.posX = enemy.getPosX();
        this.posY = enemy.getPosY();
        this.life = enemy.getLife();
    }

    public Enemy clone() {
        return new Enemy(this);
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}
