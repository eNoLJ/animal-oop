public class Eagle implements Walk, Fly {

    private String name;

    private int hp;

    private int attackPower;

    private int flyingSpeed;

    public Eagle(String name, int hp, int attackPower, int flyingSpeed) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        this.flyingSpeed = flyingSpeed;
    }

    public void levelUp() {
        hp += 10;
        attackPower += 2;
        flyingSpeed += 3;
    }

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp <= 0) {
            System.out.println(this.name + "이(가) 쓰러졌습니다!");
            return;
        }
        System.out.println(this.name + "이(가) 상처를 입었습니다.");
    }

    public void attack(Eagle eagle) {
        System.out.println(this.name + "이(가) " + eagle.getName() + "을(를) 공격했습니다.");
        eagle.takeDamage(attackPower);
    }

    public void diveAttack(Eagle eagle) {
        System.out.println(this.name + "이(가) " + eagle.getName()+ "을(를) 하늘에서 내려찍었습니다.");
        eagle.takeDamage(attackPower);
    }

    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println(this.name + "이(가) 바람을 가르며 납니다.");
    }

    @Override
    public void walk() {
        System.out.println(this.name + "이(가) 바닥에서 걷습니다.");
    }
}
