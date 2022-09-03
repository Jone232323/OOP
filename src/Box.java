public class Box {
    double width;
    double height;
    double length;

    public double volume(){
        return  width * height * length;

    }

    public void setDimens(double width,double height, double length){
        this.width =width;
        this.height =height;
        this.length =length;
    }
}
