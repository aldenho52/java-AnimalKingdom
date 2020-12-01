package animalkingdom;

abstract class Animal {

    private static int maxId = 0;
    protected int id;
    protected int fuel;

    public Animal() {
        this.id = maxId;
        this.fuel = 1;
        maxId++;
    }

    abstract String getMove();
    abstract String getBreath();
    abstract String getReproduce();
    abstract String getName();
    abstract int getYear();

    public void eat(){
        this.fuel++;
    }
    public void move() {
        fuel--;
    }
    public void move(int steps) {
        fuel-= steps;
    }
    public int getFuelLevel() {
        return fuel;
    }
}
