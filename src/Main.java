public class Main {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.width = 3.3;
        myBox.height = 5.7;
        myBox.length = 7.0;

        Box myBox2 = new Box();
        myBox2.width = 5;
        myBox2.height = 5;
        myBox2.length = 5;

        Box myBox3 = new Box();
        myBox3.width = 10;
        myBox3.height = 10;
        myBox3.length = 10;

        double volume = myBox.width * myBox.height * myBox.length;

        double volume2 = myBox2.width * myBox2.height * myBox2.length;

        double volume3 = myBox3.width * myBox3.height * myBox3.length;
        System.out.println(volume);
        System.out.println(volume2);
        System.out.println(volume3);
    }
}
