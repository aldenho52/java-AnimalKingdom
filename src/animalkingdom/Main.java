package animalkingdom;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static List<Animal> filterAnimals(List<Animal> theList, checkAnimal tester)
    {
        List<Animal> tempList = new ArrayList<>();

        for (Animal v : theList)
        {
            if (tester.test(v)) {
                tempList.add(v);
            }
        }

        return tempList;
    }

    public static void main(String[] args) {
        
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        List<Animal> animals = new ArrayList<>();

        animals.add(panda);
        animals.add(zebra);
        animals.add(koala);
        animals.add(sloth);
        animals.add(armadillo);
        animals.add(raccoon);
        animals.add(bigfoot);
        animals.add(pigeon);
        animals.add(peacock);
        animals.add(toucan);
        animals.add(parrot);
        animals.add(swan);
        animals.add(salmon);
        animals.add(catfish);
        animals.add(perch);

        animals.forEach((animal) -> System.out.println(animal));

        System.out.println("**** MVP ****");
        System.out.println("\n*** List all the animals in descending order by year named ***");

        animals.sort((v1, v2)-> v2.getYear() - v1.getYear());
        System.out.println(animals);

        System.out.println("\n*** List all the animals alphabetically ***");
        animals.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        System.out.println(animals);

        System.out.println("\n*** List all the animals order by how they move ***");
        animals.sort((v1, v2) -> v1.getMove().compareToIgnoreCase(v2.getMove()));
        System.out.println(animals);

        System.out.println("\n*** List only those animals the breath with lungs ***");
        List<Animal> animalsWithLungs = filterAnimals(animals, (v) -> v.getBreath() == "lungs");
        animalsWithLungs.forEach(v -> System.out.println(v.getName() + " " + v.getReproduce() + " " + v.getMove() + " " + v.getBreath() + " " + v.getYear()));

        System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
        List<Animal> animalWithLungsAndNamedIn1758 = filterAnimals(animalsWithLungs, (v) -> v.getYear() == 1758);
        animalWithLungsAndNamedIn1758.forEach(v -> System.out.println(v.getName() + " " + v.getReproduce() + " " + v.getMove() + " " + v.getBreath() + " " + v.getYear()));

        System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");
        List<Animal> animalsWithEggsAndLungs = filterAnimals(animals, (v) -> (v.getReproduce() == "eggs") && (v.getBreath() == "lungs"));
        animalsWithEggsAndLungs.forEach(v -> System.out.println(v.getName() + " " + v.getReproduce() + " " + v.getMove() + " " + v.getBreath() + " " + v.getYear()));

        System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
        List<Animal> animalsNamedIn1758 = filterAnimals(animals, (v) -> v.getYear() == 1758);
        animalsNamedIn1758.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        animalsNamedIn1758.forEach(v -> System.out.println(v.getName() + " " + v.getReproduce() + " " + v.getMove() + " " + v.getBreath() + " " + v.getYear()));

        System.out.println("\n*** Stretch Goal ***");
        System.out.println("\n*** For the list of animals, list alphabetically those animals that are mammals ***");
        List<Animal> mammalsInAlphabeticalOrder = filterAnimals(animals, (v) ->  (v.getBreath()== "lungs" && v.getMove() == "walk" && v.getReproduce() == "live births"));
        mammalsInAlphabeticalOrder.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        mammalsInAlphabeticalOrder.forEach(v -> System.out.println(v.getName() + " " + v.getReproduce() + " " + v.getMove() + " " + v.getBreath() + " " + v.getYear()));
    }
} 