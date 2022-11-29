public class Nokia extends Phone{

    boolean network;
    String launch;

    @Override
    public void print() {
        System.out.println(network);
        System.out.println(launch);
    }

    public Nokia(boolean network, String launch) {
        this.network = network;
        this.launch = launch;
    }
}
