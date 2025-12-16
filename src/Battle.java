import java.util.List;
import java.util.Random;

public class Battle {

    private static Random random = new Random();

    public static void oneVsOne(Team<Animal> team1, Team<Animal> team2) {
        Animal animal1 = randomPick(team1.getMembers());
        Animal animal2 = randomPick(team2.getMembers());

        System.out.println("\n===== 1:1 전투 시작 =====");
        System.out.println(animal1.getName() + " vs " + animal2.getName());

        animal1.attack(animal2);
        animal2.attack(animal1);

        animal1.doEAction();
        animal2.doEAction();
    }

    private static Animal randomPick(List<Animal> animals) {
        return animals.get(random.nextInt(animals.size()));
    }
}
