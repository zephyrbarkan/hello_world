public class Animal {
	public String name;
	private int size;
	public String sound = "default";

	public Animal(String name, int size) {
		this.name = name;
		this.size = size;
		System.out.println("Animal sound " + this.name);
	}
	public String makeNoise() {
		return this.sound + " says " + this.name;
	}

	public String soundAt(Animal a) {
		return this.sound + " at " + a.name;
	}

	public static void main(String[] args) {
		Animal jerry = new Dog("jerry", 300);
		System.out.println(jerry.makeNoise());
		Dog lil = new Dog("lil", 30);
		Golden zev = new Golden("zev", 75);
		System.out.println(zev.makeNoise());
		Animal whatever = new Animal("whatever", 0);
		System.out.println(whatever.makeNoise());


		Animal a = new Dog("tester one", 1);
		Animal b = new Dog("other tester", 2);
		System.out.println(a.soundAt(b));
		System.out.println("Next");
		Dog d = new Dog("doggo", 1);
		System.out.println(a.soundAt(d));
	}
}