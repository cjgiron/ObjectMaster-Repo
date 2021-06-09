class HumanTest { 

    public static void main (String[] args) {
        Human ciara = new Human();
        Human corey = new Human();

        ciara.attack(corey);
        corey.reportHealth();
    }
}