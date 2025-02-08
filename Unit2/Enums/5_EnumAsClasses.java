package Unit2.Enums;

import java.util.Scanner;

enum Shape{
    TRIANGLE("Triangle", 2){
        @Override
        public double calculateArea(double... dimensions){
            return 0.5*dimensions[0]*dimensions[1];
        }
    },
    SQUARE("Square", 1){
        @Override
        public double calculateArea(double... dimensions){
            return dimensions[0]*dimensions[0];
        }
    };

    private final String shapeName;
    private final int requiredParams;

    Shape(String shapeName, int requiredParams){
        this.shapeName = shapeName;
        this.requiredParams= requiredParams;
    }

    public abstract double calculateArea(double... dimensions);
    

    public String getShapeName(){
        return shapeName;
    }

    public int getRequiredParams(){
        return requiredParams;

    }

    public static Shape fromUserInput(String input){
        for(Shape shape: values()){
            if(shape.shapeName.equalsIgnoreCase(input)){
                return shape;
            }
        }

        return null;
    }
}

class EnumShapeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the shape (Triangle/Square): ");
        String shapeInput = sc.next();

        Shape shape = Shape.fromUserInput(shapeInput);

        if(shape == null){
            System.out.println("Invalid Argument Enter Square or Triangle");

        }else{
            double[] dimensions = new double[shape.getRequiredParams()];

            for (int i = 0; i < shape.getRequiredParams(); i++) {
                System.out.print("Enter Dimensions "+( i + 1) + ": ");
                dimensions[i] = sc.nextDouble();

            }

            double area = shape.calculateArea(dimensions);
            System.out.println("Area of "+shape.getShapeName()+" = "+area);
        }

        sc.close();
    }
}