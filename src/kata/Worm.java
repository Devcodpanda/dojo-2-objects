public class Worm {

    private String name;
    private int life;
    private int attack;

    public Worm(String name, int life, int attack) {
        this.name = name;
        this.life = life;
        this.attack = attack;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLife() {
        return life;
    }
    public void setLife(int life) {
        this.life = life;
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public boolean isAlive() {
        return life > 0;
    }
    public void dealDamage(Worm thatWorm) {
        thatWorm.setLife(thatWorm.getLife() - attack);
    }
}
