package Unit2.Enums;

//An enumeration of apple varities.

enum Apple{
    jonathan,GoldenDel,RedDel,Winesap,Cortland
}

class EnumsWithSwitch{

    public static void main(String[] args){

        Apple ap;
        ap = Apple.RedDel;

        //use and Enum to control a switch statement.
        switch (ap){
            case jonathan:
                System.out.println("Jonathan is Red");
                break;

            case GoldenDel:
                System.out.println("Golden Delicious is yellow.");
                break;
            
            case RedDel:
                System.out.println("Red Delicious is Rd");
                break;

            case Winesap:
                System.out.println("Winesap is also red");
                break;
            default:
                break;
            }
    }


}