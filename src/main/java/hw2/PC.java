package hw2;

public class PC {
    private Case myCase;
    private MotherBoard motherBoard;
    private Monitor monitor;

    public PC(Case myCase, MotherBoard motherBoard, Monitor monitor) {
        this.myCase = myCase;
        this.motherBoard = motherBoard;
        this.monitor = monitor;
    }

    public Case getMyCase() {
        return myCase;
    }

    public void setMyCase(Case myCase) {
        this.myCase = myCase;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "PC{" + "myCase=" + myCase + ", motherBoard=" + motherBoard + ", monitor=" + monitor + '}';
    }

    private void drawLogo(){
        monitor.drawPixel(10,10, "red");
    }
    public void description(){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today" + "\n" + myCase+ "\n" + monitor + "\n"+ motherBoard);
    }
    public void powerUp(){
        myCase.pressPowerButton();
        drawLogo();
        motherBoard.loadProgram("Excel");


    }

}
