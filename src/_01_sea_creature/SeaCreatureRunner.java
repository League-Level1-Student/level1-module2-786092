package _01_sea_creature;

public class SeaCreatureRunner {
	public static void main(String[]args) {
		SeaCreature creature = new SeaCreature("Spongebob");
		creature.eat();
		creature.laugh();
		SeaCreature creation = new SeaCreature("Patrick");
		System.out.println(creation.getName());
		creation.eat();
		creation.laugh();
		SeaCreature monster = new SeaCreature("Squidward");
		System.out.println(monster.getName());
		monster.eat();
		monster.laugh();
	}
}
