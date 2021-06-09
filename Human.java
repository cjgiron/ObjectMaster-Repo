public class Human {
    Integer strength = 3;
    Integer intelligence = 3;
    Integer stealth = 3;
    Integer health = 100;

    public Human () {

    }

    public void attack (Human target) {
        target.health -= this.strength;
        System.out.println("This human attacked and reduced foe's health by " + this.strength);
    }

    public void reportHealth() {
        int healthReport = this.health;
        System.out.println("This human has " + healthReport + " health points.");
    }
}