public class Turtle extends Animal implements Walk, Swim{

    private int moveSpeed;

    public Turtle(String name, int hp, int attackPower, int moveSpeed) {
        super(name, hp, attackPower);
        this.moveSpeed = moveSpeed;
    }

    @Override
    public void levelUp() {
        setHp(getHp() + 20);
        setAttackPower(getAttackPower() + 1);
        moveSpeed += 2;
    }

    public void hidingInTheShell() {
        System.out.println(getName() + "이(가) 등껍질 속으로 숨었습니다.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + "이(가) 설렁설렁 헤엄칩니다.");
    }

    @Override
    public void walk() {
        System.out.println(getName() + "이(가) 느릿느릿 땅을 걷습니다.");
    }
}
