package dota_heroes;

public class Hero {
    private String nameHero;
    private int lvl;
    private double hp;
    private double attackPower;
    private boolean dead;

    public Hero(String nameHero, int lvl, double hp, double attackPower, boolean dead) {
        this.nameHero = nameHero;
        this.lvl = lvl;
        this.hp = hp;
        this.attackPower = attackPower;
        this.dead = dead || hp <= 0;
    }

    public void attacking(double damage, Hero attacked) {
        attacked.hp -= damage;
        System.out.println("Герой " + this.nameHero + " атаковал героя " + attacked.nameHero + " на " + damage + " урона.");
        if (attacked.hp <= 0) {
            System.out.println(attacked.nameHero + " мертв");
        }
    }

    public void attacking(Hero attacked, Hero attacked2) {
        attacked.hp -= this.attackPower;
        attacked2.hp -= this.attackPower;
        System.out.println("Герой " + this.nameHero + " атаковал героя " + attacked.nameHero + " на " + this.attackPower + " урона," + " а также сплешом нанес " + attacked2.nameHero + " " + this.attackPower / 2 + " урона.");
        if (attacked.hp <= 0) {
            System.out.println(attacked.nameHero + " мертв");
        } else if (attacked2.hp <= 0) {
            System.out.println(attacked2.nameHero + " мертв");
        }
    }

    public void attacking(double damage, Hero attacked, Hero attacked2) {
        attacked.hp -= damage;
        attacked2.hp -= damage;
        System.out.println("Герой " + this.nameHero + " атаковал героя " + attacked.nameHero + " на " + damage + " урона," + " а также сплешом нанес " + attacked2.nameHero + " " + damage / 2 + " урона.");
        if (attacked.hp <= 0) {
            System.out.println(attacked.nameHero + " мертв");
        } else if (attacked2.hp <= 0) {
            System.out.println(attacked2.nameHero + " мертв");
        }
    }

    public void attacking(Hero attacked) {
        attacked.hp -= this.attackPower;
        System.out.println("Герой " + this.nameHero + " атаковал героя " + attacked.nameHero + " на " + this.attackPower + " урона.");
        if (attacked.hp <= 0) {
            System.out.println(attacked.nameHero + " мертв");
        }
    }

    public void heals(double treatment, Hero treated) {
        treated.hp += treatment;
        System.out.println("Герой " + this.nameHero + " вылечил " + treated.nameHero + " на " + treatment + " хп.");
    }

    public void heals(double treatment) {
        hp += treatment;
        System.out.println("Герой " + this.nameHero + " вылечил себя на " + treatment + " хп.");
    }

    public void lvlUp(int lvl) {
        System.out.println("Герой " + this.nameHero + " повышает уровень на " + lvl);
    }

    public void showDead(boolean dead) {
        this.dead = dead;
        if (this.hp <= 0) {
            System.out.println(this.nameHero + " мертв");
        }
    }


    public String getNameHero() {
        return nameHero;
    }

    public void setNameHero(String nameHero) {
        this.nameHero = nameHero;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }
}
