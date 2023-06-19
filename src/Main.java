import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //Kiểm thử Class Shape
        System.out.println("---------SHAPE----------");
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);

        //Kiểm thử Class Circle
        System.out.println("---------CIRCLE----------");
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        //Kiểm thử RECTANGLE
        System.out.println("---------RECTANGLE----------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
        //Kiểm thử SQUARE

        System.out.println("---------SQUARE----------");
        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square(5.8, "yellow", true);
        System.out.println(square);
        // SS9 Comparable
        System.out.println("---------COMPARABLE----------");
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[1] = new ComparableCircle();
        circles[0] = new ComparableCircle(3.6);
        circles[2] = new ComparableCircle(3.5,"green",false);
        System.out.println("Pre-sorted: ");
        for(ComparableCircle comparableCircle:circles){
            System.out.println(comparableCircle);
        }
        Arrays.sort(circles);
        System.out.println("After-sorted");
        for(ComparableCircle comparableCircle:circles){
            System.out.println(comparableCircle);
        }
        // SS9 Comparator
        System.out.println("---------COMPARATOR----------");
        Circle[] circles1 = new Circle[3];
        circles1[0] = new Circle();
        circles1[1] = new Circle(3.6);
        circles1[2] = new Circle(3.5,"green",false);
        System.out.println("Pre-sorted");
        for(Circle circle1:circles1){
            System.out.println(circle1);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles1,circleComparator);
        System.out.println("After-sorted");
        for(Circle circle1:circles1){
            System.out.println(circle1);
        }
    }
}