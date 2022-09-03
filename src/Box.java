public class Box {
    double width;
    double height;
    double length;

    public void showVolume(){
        double volume = width * height * length;
        System.out.println(volume);
    }
}
