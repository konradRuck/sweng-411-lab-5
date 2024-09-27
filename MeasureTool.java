public class MeasureTool extends Tools {
    private static String category;
    public MeasureTool() {
        category = "M_TOOL";
    }
    public void setCategory(String n){
        category = n;
    }
    public String getCategory(){
        return category;
    }
    public void displayTool() {
        super.displayTool();
        System.out.println("Category: " + category);
    }
    public Double Measure(Wall wall, int xCoord, int yCoord) {
        return Math.sqrt(Math.pow(wall.getXCoord() - xCoord, 2) + Math.pow(wall.getYCoord() - yCoord, 2));
    }
}
