import java.util.ArrayList;
import java.util.List;

public class Team<T extends Animal> {

    private String name;

    private List<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addMember(T animal) {
        members.add(animal);
        System.out.println(animal.getName() + "(이)가 " + name + " 팀에 합류!");
    }

    public T getMember(int index) {
        return members.get(index);
    }

    public int getTotalHp() {
        return members.stream()
                .mapToInt(Animal::getHp)
                .sum();
    }

    public List<T> getMembers() {
        return members;
    }

    public void printAnimals(List<T> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }
}
