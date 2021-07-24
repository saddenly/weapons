import Weapons.*;

public class Player {
    private final Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new Knife(),
                new Pistol(),
                new Riffle(),
                new Shotgun()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shootWithWeapon(int slot) {
        Weapon weapon = weaponSlots[slot - 1];
        weapon.shoot();
    }
}