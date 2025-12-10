public class Main {

    public static void main(String[] args) {
        Animal lion = new Lion("사자", 100, 20);
        Animal eagle = new Eagle("독수리", 80, 15, 80);
        Animal turtle = new Turtle("거북이", 150, 10, 10);

        lion.doAAction();
        eagle.doEAction();
        turtle.doRAction();

        System.out.println("=== 전투 시작 ===");

        lion.attack(eagle);
        eagle.attack(turtle);
        turtle.attack(lion);

        ((Lion) lion).biteStrongly(eagle);
        ((Eagle) eagle).diveAttack(turtle);
        ((Turtle) turtle).hidingInTheShell(lion);

        System.out.println("전투 종료");

        System.out.println(lion);
        System.out.println(eagle);
        System.out.println(turtle);
    }
}
