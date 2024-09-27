public class Wall{

    private String color;
    private int Xcoord, YCoords;

    public Wall(String color, int x, int y) {
        this.color = color;
        Xcoord = x;
        YCoords = y;
    }

    public void setColor(String c){
        color = c;
    }

    public String getColor(){
        return color;
    }

    public void setXCoord(int x){
        Xcoord = x;
    }

    public int getXCoord(){
        return Xcoord;
    }

    public void setYCoord(int y){
        YCoords = y;
    }

    public int getYCoord(){
        return YCoords;
    }

    //private String fortniteBorger(){
    //     return "My precious fortnite borger";
    //}

}