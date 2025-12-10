public class Eagle extends Animal implements Walk, Fly {

    private int flyingSpeed;

    public Eagle(String name, int hp, int attackPower, int flyingSpeed) {
        super(name, hp, attackPower);
        this.flyingSpeed = flyingSpeed;
    }

    @Override
    public void doAAction() {
        System.out.println(getName() + "이(가) 하늘 위에서 먹이를 찾습니다.");
    }

    @Override
    public void doWAction() {
        System.out.println(getName() + "이(가) 바람을 가르며 하늘을 납니다.");
    }

    @Override
    public void doEAction() {
        System.out.println(getName() + "이(가) 짹짹 웁니다.");
    }

    @Override
    public void doRAction() {
        System.out.println(getName() + "이(가) 먹이를 쪼아 먹습니다.");
    }

    @Override
    public void levelUp() {
        setHp(getHp() + 10);
        setAttackPower(getAttackPower() + 2);
        flyingSpeed += 3;
    }

    public void diveAttack(Animal animal) {
        System.out.println(getName() + "이(가) " + animal.getName()+ "을(를) 하늘에서 내려찍었습니다.");
        animal.takeDamage(getAttackPower());
    }

    @Override
    public void fly() {
        System.out.println(getName() + "이(가) 바람을 가르며 납니다.");
    }

    @Override
    public void walk() {
        System.out.println(getName() + "이(가) 바닥에서 걷습니다.");
    }
}
