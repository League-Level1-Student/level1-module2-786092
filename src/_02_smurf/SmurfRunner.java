package _02_smurf;

public class SmurfRunner {
	public static void main(String[]args) {
		Smurf smurf = new Smurf("Handy");
		smurf.eat();
		System.out.println(smurf.getName());
		Smurf papaSmurf = new Smurf("Papa Smurf");
		System.out.println(papaSmurf.getName());
		System.out.println(papaSmurf.getHatColor());
		System.out.println(papaSmurf.isGirlOrBoy());
		Smurf smurfette = new Smurf("Smurfette");
		System.out.println(smurfette.getName());
		System.out.println(smurfette.getHatColor());
		System.out.println(smurfette.isGirlOrBoy());
	}
}
