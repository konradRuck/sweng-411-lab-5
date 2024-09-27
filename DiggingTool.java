public class DiggingTool extends Tools {
    private static String category;
    public DiggingTool() {
        category = "D_TOOL";
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
        System.out.println("ERROR: Non-measuring tools cannot measure.");
        return null;
    }
}
