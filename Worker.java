public class Worker {
    private String name;
    private Tools tool;
    public Worker(String name) {
        this.name = name;
    }
    public void setTool(Tools tool) {
        this.tool = tool;
    }
    public Tools getTool() {
        return tool;
    }
}
