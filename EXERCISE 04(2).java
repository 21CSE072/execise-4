interface RegularPolygon
{
    public void getsidelength();
    public int getNumberOfSides();
    public double getperimeter();
    public void triangle();
    public void rectangle();
    public void square();
}

class Triangle implements RegularPolygon {
    static int numberOfSides = 3;
    double side1;
    double side2;
    double side3;
Triangle(int,int,int)
{
   
}
}
 public void Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public int getNumberOfSides(){
        return numberOfSides;
    }
    
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
}

class Rectangle implements RegularPolygon {
    Rectangle(int,int)
    {
        
    }
    static int numberOfSides = 4;
    double side1;
    double side2;
    
    public void Rectangle(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }
    
    public int getNumberOfSides(){
        return numberOfSides;
    }
    
    public double getPerimeter(){
        return side1 + side1 + side2 + side2;
    }
} 

class Square implements RegularPolygon {
    Square(int)
    {
        
    }
    public void Square(double side){
        super(side,side);
    }
} 

class solution{
    public static void print(RegularPolygon p){
        System.out.println( "A " + p.getClass().getName() + " has " + p.getNumberOfSides() + " sides." );
        System.out.println( "The perimeter of this shape is: " +  p.getPerimeter() + '\n');
    }
    public class irr{
    public static void main(String[] args){
        Polygon triangle = new Triangle(1, 2, 3);
        print(triangle);
        
        Polygon rectangle = new Rectangle(2, 3);
        print(rectangle);
        
        Polygon square = new Square(2);
        print(square);
        
    }
}

		
           





