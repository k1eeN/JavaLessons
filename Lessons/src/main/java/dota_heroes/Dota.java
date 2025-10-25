package dota_heroes;

public class Dota {
    public static void main(String[] args) {
        Hero carry = new Hero("Sven", 7, 1000, 112, false);
        Hero fullSupport = new Hero("Witch Doctor", 5, 800, 79, false);
        Hero offLaner = new Hero("Axe", 7, 1200, 94, false);
        Hero softSupport = new Hero("Dark Willow", 6, 875, 86, false);

        carry.attacking(250, softSupport);
        offLaner.attacking(carry);
        fullSupport.heals(100, carry);
        softSupport.attacking(400, fullSupport);
        carry.attacking(offLaner, softSupport);
        offLaner.attacking(200, carry);
        softSupport.attacking(800, carry, fullSupport);
        softSupport.lvlUp(3);
        offLaner.attacking(carry);
        offLaner.lvlUp(2);

    }
}
