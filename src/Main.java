public class Main {
    public static void main(String[] args) {
        Phone iphone = createObject("iphone");
        Phone samsung = createObject("samsung");
        Phone nokia = createObject("nokia");
        iphone.print();
        samsung.print();
        nokia.print();
    }

    public static Phone createObject(String className) {
        switch (className) {
            case "iphone":
                return new Iphone(23,true);
            case "samsung":
                return new Samsung(45,"android");
            case "nokia":
                return new Nokia(true,"66");
        }
        return null;
    }

}