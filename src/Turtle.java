public class Turtle extends Animal implements Walk, Swim{

    private int moveSpeed;

    public Turtle(String name, int hp, int attackPower, int moveSpeed) {
        super(name, hp, attackPower);
        this.moveSpeed = moveSpeed;
    }

    @Override
    public void doAAction() {
        System.out.println(getName() + "(이)가 두리번 두리번 먹이를 찾습니다.");
    }

    @Override
    public void doWAction() {
        System.out.println(getName() + "(이)가 엉금엉금 땅을 걷습니다.");
    }

    @Override
    public void doEAction() {
        System.out.println(getName() + "(이)가 짝을 찾아 돌아다닙니다.");
    }

    @Override
    public void doRAction() {
        System.out.println(getName() + "(이)가 먹이를 베어 먹습니다.");
    }

    @Override
    public void levelUp() {
        setHp(getHp() + 20);
        setAttackPower(getAttackPower() + 1);
        moveSpeed += 2;
    }

    public void hidingInTheShell(Animal animal) {
        int damage = getAttackPower();

        if (getShellBlockChance() < 0.3) {
            damage /= 2;
        }

        System.out.println(getName() + "(이)가 등껍질 속으로 숨었습니다.");
    }

    public double getShellBlockChance() {
        return Math.random();
    }

    @Override
    public void swim() {
        System.out.println(getName() + "(이)가 설렁설렁 헤엄칩니다.");
    }

    @Override
    public void walk() {
        System.out.println(getName() + "(이)가 느릿느릿 땅을 걷습니다.");
    }
}
