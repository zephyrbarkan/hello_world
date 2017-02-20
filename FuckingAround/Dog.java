public class Dog extends Animal {
	public String sound;
	private int size;

	public Dog(String name, int size) {
		super(name, size);
		this.size = size;
		if (this.size > 100) {
			this.sound = "boof";
		} else if (this.size > 50) {
			this.sound = "woof";
		} else {
			this.sound = "yip";
		}
	}

	@Override
	public String makeNoise() {
		return super.sound + " says the dog";
	}

	@Override
	public String soundAt(Animal a) {
		System.out.println("Overriden Dog");
		return this.sound + " at " + a.name;
	}

	public String soundAt(Dog d) {
		System.out.println("Not overrriden takes Dog");
		return this.sound + " at " + d.name;
	}

}