import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("lion", 500, "savanna", true);
        Animal animal2 = new Animal("sheep", 200, "grasslands");
        Animal animal3 = new Animal("giant panda", 250, "temperate forests", true);
        Animal animal4 = new Animal("toucan", 2, "rainforest", false);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);

        for (int i = 0;i < animals.size();i++){
            System.out.println(animals.get(i));
        }
        System.out.println(animal1.feed("steak"));
        System.out.println(animal3.feed("bamboo"));
        System.out.println(animal2.sound("baaa"));
    }
}