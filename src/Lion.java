public class Lion {

    private String name;

    private int hp;

    private int attackPower;

    public Lion(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public void levelUp() {
        hp += 10;
        attackPower += 3;
    }

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp <= 0) {
            System.out.println(this.name + "이(가) 쓰러졌습니다!");
            return;
        }
        System.out.println(this.name + "이(가) 상처를 입었습니다.");
    }

    public void attack(Lion lion) {
        System.out.println(this.name + "이(가) " + lion.getName() + "을(를) 공격했습니다.");
        lion.takeDamage(attackPower);
    }

    public void biteStrongly(Lion lion) {
        int damage = attackPower;

        if (Math.random() < 0.3) {
            damage *= 2;
            System.out.println("강하게 물었습니다! (크리티컬 히트!)");
        }

        System.out.println(this.name + "이(가) " + lion.getName() + "을(를) 공격했습니다.");
        lion.takeDamage(damage);
    }

    public String getName() {
        return name;
    }
}
