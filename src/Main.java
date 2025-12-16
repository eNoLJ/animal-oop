public class Main {

    public static void main(String[] args) {
        Animal lion = new Lion("사자", 100, 20);
        Animal eagle = new Eagle("독수리", 80, 15, 80);
        Animal turtle = new Turtle("거북이", 150, 10, 10);

        AnimalPool animalPool = new AnimalPool();
        animalPool.addAnimal(lion);
        animalPool.addAnimal(eagle);
        animalPool.addAnimal(turtle);

        Team<Animal> redTeam = new Team<>("레드");
        Team<Animal> blueTeam = new Team<>("블루");

        redTeam.addMember(animalPool.getAnimal("사자"));

        blueTeam.addMember(animalPool.getAnimal("독수리"));
        blueTeam.addMember(animalPool.getAnimal("거북이"));

        System.out.println("레드팀 전체 체력" + redTeam.getTotalHp());
        System.out.println("블루팀 전체 체력" + blueTeam.getTotalHp());

        Battle.oneVsOne(redTeam, blueTeam);
        Battle.oneVsOne(redTeam, blueTeam);
        Battle.oneVsOne(redTeam, blueTeam);

        System.out.println("레드팀 전체 체력" + redTeam.getTotalHp());
        System.out.println("블루팀 전체 체력" + blueTeam.getTotalHp());
    }
}
