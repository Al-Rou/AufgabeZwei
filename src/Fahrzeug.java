public class Fahrzeug implements Cloneable {
    public Fahrzeug() {
    }

    public Fahrzeug(int ID) {
        this.ID = ID;
    }
    public Fahrzeug(Fahrzeug other)
    {
        this.ID = other.ID;
    }
    @Override
    public Fahrzeug clone() throws CloneNotSupportedException
    {
        Fahrzeug fahrzeug = (Fahrzeug)super.clone();
        return fahrzeug;
    }

    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public boolean equals(Object object)
    {
        if (object == null)
        {
            return false;
        }
        if (this == object)
        {
            return true;
        }
        if(this.getClass() != object.getClass())
        {
            return false;
        }
        Fahrzeug checkF = (Fahrzeug)object;
        if(this.ID != checkF.ID)
        {
            return false;
        }
        return true;
    }
}
