public class Iphone extends Phone {
    int battery;
    boolean sound;
    @Override
    public void print() {
        System.out.println("battery: "+battery);
        System.out.println("Sound: "+sound);
    }

    public Iphone(int battery, boolean sound) {
        this.battery = battery;
        this.sound = sound;
    }
}
