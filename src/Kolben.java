public class Kolben implements Cloneable {
    public Kolben(){}
    public Kolben(Kolben other)
    {
        this.dicke = other.dicke;
    }
    private float dicke;

    @Override
    public Kolben clone() throws CloneNotSupportedException
    {
        Kolben kolben = (Kolben)super.clone();
        return kolben;
    }
    public float getDicke() {
        return dicke;
    }

    public void setDicke(float dicke) {
        this.dicke = dicke;
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
        Kolben checkK = (Kolben)object;
        if (this.dicke != checkK.dicke)
        {
            return false;
        }
        return true;
    }
}
