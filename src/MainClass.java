import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args)
    {
        Auto auto1 = new Auto();
        Kolben kolben1 = new Kolben();
        List<Kolben> kolbenList = new ArrayList<>();
        kolbenList.add(kolben1);
        Motor motor1 = new Motor();
        motor1.setKolbens(kolbenList);
        List<Motor> motorList = new ArrayList<>();
        motorList.add(motor1);
        Reifen reifen1 = new Reifen();
        List<Reifen> reifenList = new ArrayList<>();
        reifenList.add(reifen1);
        Sitz sitz1 = new Sitz();
        List<Sitz> sitzList = new ArrayList<>();
        sitzList.add(sitz1);
        auto1.setModell("Benz");
        auto1.setMotors(motorList);
        auto1.setReifens(reifenList);
        auto1.setSitzs(sitzList);
        Auto auto2 = null;
        try {
            auto2 = auto1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //System.out.println(Sitz.counter);
        System.out.println(auto1.getModell());
        System.out.println(auto2.getModell());
        //System.out.println(sitz3.getFarbe());
    }
}
