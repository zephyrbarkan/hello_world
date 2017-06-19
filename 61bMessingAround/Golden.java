public class Golden extends Dog {

    public Golden(String name, int size) {
        super(name, size);
    }

    @Override
    public String makeNoise() {
        return super.sound + " says " + this.name;
    }
}