public class Wizard extends Human {

    public Wizard (String name) {
        super();
        this.name = name;
        this.health = 50;
        this.intelligence = 8;
    }

    public void heal(Human target) {
        target.health += this.intelligence;
        System.out.println(this.name + " wizard healed " + target.name + " by " + this.intelligence);
    }

    public void fireball (Human target) {
        int reduction = 3 * this.intelligence;
        target.health -= reduction;
        System.out.println(this.name + " wizard threw a fireball and reduced "+ target.name+"'s health by " + reduction);
    }
}