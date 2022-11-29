public class Samsung extends Phone{
    int memory;
    String platform;
    @Override
    public void print() {
        System.out.println(memory);
        System.out.println(platform);



    }

    public Samsung(int memory, String platform) {
        this.memory = memory;
        this.platform = platform;
    }
}
