public class Main {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.width = 3.3;
        myBox.height = 5.7;
        myBox.length = 7.0;

        double volume =   myBox.width* myBox.height*myBox.length;
        System.out.println(volume);
    }
}
