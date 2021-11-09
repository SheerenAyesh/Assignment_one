package modle.java;

import java.util.ArrayList;

public class sportes_data {
  private   ArrayList<sportss> sp=new ArrayList<>();

    public sportes_data() {
        sp.add(new sportss("football"));
        sp.add(new sportss("basketball"));
        sp.add(new sportss("handball"));
    }

    public ArrayList<sportss> getSp() {
        return sp;
    }

    public void setSp(ArrayList<sportss> sp) {
        this.sp = sp;
    }
    public String [] cat(){
        String [] types=new String[3];
        types[0]="football";
        types[1]="basketball";
        types[2]="handball";
        return types;

    }
}
