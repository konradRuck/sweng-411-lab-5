import java.util.List;
import java.util.ArrayList;

public class HS{
    private String name = "HS";

    public Tools pay(double bud, double dis){

        Spade s = new Spade();
        LaserGadget lg = new LaserGadget();
        Mattock m = new Mattock();
        Ruler r = new Ruler();
        Tape_Measure tm = new Tape_Measure();

        List<Tools> toolS = new ArrayList<>();

        toolS.add(s);
        toolS.add(lg);
        toolS.add(m);
        toolS.add(r);
        toolS.add(tm);

        double high = 0;
        Tools hightool = null;

        for (Tools tool : toolS) {
            if ((tool.getMSRP() * (1-dis) > high) && tool.getMSRP() * (1-dis) < bud){
                high = tool.getMSRP();
                hightool = tool;
            }
        }

        hightool.setDiscount(dis);
        return hightool;
    }

    public void setName(String n)
    {
        name = n;
    }

    public String getName(){
        return name;
    }

}