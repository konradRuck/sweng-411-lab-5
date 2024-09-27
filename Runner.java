public class Runner {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John");
        Worker worker2 = new Worker("Louis");
        HS hardwareStore1 = new HS();
        worker1.setTool(hardwareStore1.pay(45, 0.15));
        worker2.setTool(hardwareStore1.pay(19, 0.1));
        worker1.getTool().displayTool();
        worker1.getTool().setCategory("INSTRUMENT");
        worker2.getTool().displayTool();
        Wall wall1 = new Wall("Gray", 12, 15);
        System.out.printf("%.3f", worker2.getTool().Measure(wall1, 20, 25));
    }
}
