import java.util.ArrayList;
import java.util.List;

public class Auto extends Fahrzeug {

    private String modell;
    private List<Reifen> reifens;
    private List<Motor> motors;
    private List<Sitz> sitzs;
    public Auto(){}
    public Auto(Auto other)
    {
        super(other);
        this.modell = other.modell;
        this.reifens = new ArrayList<Reifen>(other.reifens);
        for (int j=0; j < other.reifens.size(); j++)
        {
            this.reifens.set(j, new Reifen(other.reifens.get(j)));
        }
        this.motors = new ArrayList<Motor>(other.motors);
        for(int j=0; j < other.motors.size(); j++)
        {
            this.motors.set(j, new Motor(other.motors.get(j)));
        }
        this.sitzs = new ArrayList<Sitz>(other.sitzs);
        for (int j=0; j < other.sitzs.size(); j++)
        {
            this.sitzs.set(j, new Sitz(other.sitzs.get(j)));
        }
    }

    @Override
    public Auto clone() throws CloneNotSupportedException
    {
        Auto auto = (Auto)super.clone();
        auto.reifens = (List<Reifen>)((ArrayList<Reifen>)reifens).clone();
        for(int j=0; j < reifens.size(); j++)
        {
            auto.reifens.set(j, reifens.get(j).clone());
        }
        auto.motors = (List<Motor>)((ArrayList<Motor>)motors).clone();
        for(int j=0; j < motors.size(); j++)
        {
            auto.motors.set(j, motors.get(j).clone());
        }
        auto.sitzs = (List<Sitz>)((ArrayList<Sitz>)sitzs).clone();
        for (int j=0; j < sitzs.size(); j++)
        {
            auto.sitzs.set(j, sitzs.get(j).clone());
        }
        return auto;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public List<Reifen> getReifens() {
        return reifens;
    }

    public void setReifens(List<Reifen> reifens) {
        this.reifens = reifens;
    }

    public List<Motor> getMotors() {
        return motors;
    }

    public void setMotors(List<Motor> motors) {
        this.motors = motors;
    }

    public List<Sitz> getSitzs() {
        return sitzs;
    }

    public void setSitzs(List<Sitz> sitzs) {
        this.sitzs = sitzs;
    }
    @Override
    public boolean equals(Object object)
    {
        if(!super.equals(object))
        {
            return false;
        }
        Auto checkA = (Auto)object;
        if(!this.modell.equalsIgnoreCase(checkA.modell))
        {
            return false;
        }
        if(!this.motors.equals(checkA.motors))
        {
            return false;
        }
        if(!this.reifens.equals(checkA.reifens))
        {
            return false;
        }
        if(!this.sitzs.equals(checkA.sitzs))
        {
            return false;
        }
        return true;
    }
}
