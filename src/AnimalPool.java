import java.util.HashMap;
import java.util.Map;

public class AnimalPool {

    private Map<String, Animal> animals = new HashMap<>();

    public void addAnimal(Animal animal) {
        animals.put(animal.getName(), animal);
    }

    public Animal getAnimal(String name) {
        return animals.get(name);
    }
}
