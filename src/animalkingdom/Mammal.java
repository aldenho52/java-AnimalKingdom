package animalkingdom;

public class Mammal extends Animal {
    private String name;
    private int year;

    public Mammal(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String getMove(){
        return "walk";
    }
    @Override
    public String getBreath() {
        return "lungs";
    }
    @Override
    public String getReproduce() {
        return "live births";
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Animals{id=" + id + ", name='" + name + "', yearNamed=" + year + "}";
    }

}
