package animalkingdom;

public class Bird extends Animal{
    private String name;
    private int year;

    public Bird (String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String getMove(){
        return "fly";
    }
    @Override
    public String getBreath() {
        return "lungs";
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