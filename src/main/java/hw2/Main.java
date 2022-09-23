package hw2;

public class Main {
    public static void main(String[] args) {


        Resolution resolution = new Resolution();
        Monitor monitor = new Monitor(resolution, "Mac", "Apple");
        MotherBoard motherBoard = new MotherBoard("MAC", "Apple", 10, 10, "ABC");
        Dimension dimension = new Dimension(10, 10, 10);
        Case myCase = new Case("Macbook Air", "Apple", "Electric", dimension);
        PC myPc = new PC(myCase, motherBoard, monitor);

        myPc.description();
        myPc.powerUp();
    }

}
