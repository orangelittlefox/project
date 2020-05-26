package papka;

public class Main {
    public static void main(String[] args) {
        Flower flower = new Flower();

        System.out.println("Please choose colors:" + "\n" +
                "1:Red" + "\n" +
                "2:Blue" + "\n" +
                "3:Black" + "\n" +
                "4:White" + "\n" +
                "5:Green" + "\n" +
                "6:Pink" + "\n" +
                "7:Gray" + "\n" +
                "input name of color:");
        flower.totalPrice();
//        flower.outName();
    }
}
