package RedRover.school.Task9_1;

public class Fighter {
    public String name;
    public int health, damagePerAttack;
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        // Your code goes here. Have fun!

        Fighter first=(firstAttacker.equals(fighter1.name)) ? fighter1 : fighter2;
        Fighter second=(first.name.equals(fighter1.name)) ? fighter2 : fighter1;
        String s="";
        while (first.health>0 && second.health>0)
        {
            battle(first,second);
            if (second.health>0)
                battle(second,first);
        }
        if (first.health>0) {
            s += first.name;
        } else {
            s += second.name;
        }
        return s;
    }

    public static void battle(Fighter fighter1, Fighter fighter2)
    {
        fighter2.health-=fighter1.damagePerAttack;
        if(fighter2.health>0) {
            System.out.println(fighter1.name + " attacks " + fighter2.name + "; "
                    + fighter2.name + " now has " + fighter2.health + " health.");
        }
        else
            System.out.println(fighter1.name + " attacks " + fighter2.name + "; "
                    + fighter2.name + " now has " + fighter2.health + " health and is dead. " +
                    fighter1.name + " wins.");
    }

    public static void main(String[] args) {
        String f = Fighter.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew");
        System.out.println(f);
    }
}
