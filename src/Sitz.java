public class Sitz implements Cloneable {
    public Sitz()
    {
        counter++;
    }
    public Sitz(Sitz other)
    {
        this.farbe = other.farbe;
        counter++;
    }
    @Override
    public Sitz clone() throws CloneNotSupportedException
    {
        Sitz sitz = (Sitz)super.clone();
        sitz.farbe = farbe;
        counter++;
        return sitz;
    }
    private Colour farbe;
    public static int counter;

    public Colour getFarbe() {
        return farbe;
    }

    public void setFarbe(Colour farbe) {
        this.farbe = farbe;
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
        Sitz checkS = (Sitz) object;
        if (!this.farbe.equals(checkS.farbe))
        {
            return false;
        }
        return true;
    }
}
