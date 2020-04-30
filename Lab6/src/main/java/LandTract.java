
public class LandTract {
    double length;
    double width;
    double area;
    String name;

    public LandTract(String name,double length, double width) {
        this.length = length;
        this.width = width;
        this.name =name;
    }
    
    public double getArea(){
       this.area=this.length *this.width;
        return area;
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LandTract{"+"name= "+name +",length=" + length + ", width=" + width+ " area=" + area + '}';
    }

    
   

    
    
    
    
}
