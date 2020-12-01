package animalkingdom;

public class Fish extends Animal {
    private String name;
    private int year;

    public Fish (String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String getMove(){
        return "swim";
    }
    @Override
    public String getBreath() {
        return "gills";
    }
    @Override
    public String getReproduce() {
        return "eggs";
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
        return "Animals{id=" + id + " name='" + name + "', yearNamed=" + year + "}";
    }
}