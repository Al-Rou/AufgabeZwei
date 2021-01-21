import java.util.ArrayList;
import java.util.List;

public class Motor implements Cloneable {
    public Motor(){}
    public Motor(Motor other)
    {
        this.hubraum = other.hubraum;
        this.kolbens = new ArrayList<Kolben>(other.kolbens);
        for(int j=0; j < other.kolbens.size(); j++)
        {
            this.kolbens.set(j, new Kolben(other.kolbens.get(j)));
        }
    }
    @Override
    public Motor clone() throws CloneNotSupportedException
    {
        Motor motor = (Motor)super.clone();
        motor.kolbens = (List<Kolben>)((ArrayList<Kolben>)kolbens).clone();
        for (int j=0; j < kolbens.size(); j++)
        {
            motor.kolbens.set(j, kolbens.get(j).clone());
        }
        return motor;
    }
    private int hubraum;
    private List<Kolben> kolbens;

    public int getHubraum() {
        return hubraum;
    }

    public void setHubraum(int hubraum) {
        this.hubraum = hubraum;
    }

    public List<Kolben> getKolbens() {
        return kolbens;
    }

    public void setKolbens(List<Kolben> kolbens) {
        this.kolbens = kolbens;
    }
    @Override
    public boolean equals(Object object)
    {
        if (object == null)
        {
            return false;
        }
        if(this == object)
        {
            return true;
        }
        if (this.getClass() != object.getClass())
        {
            return false;
        }
        Motor checkM = (Motor) object;
        if (this.hubraum != checkM.hubraum)
        {
            return false;
        }
        if(!this.kolbens.equals(checkM.kolbens))
        {
            return false;
        }
        return true;
    }
}
