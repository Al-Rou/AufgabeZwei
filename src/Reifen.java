public class Reifen implements Cloneable {
    public Reifen() {
    }
    public Reifen(Reifen other)
    {
        this.durchmesser = other.durchmesser;
    }
    @Override
    public Reifen clone() throws CloneNotSupportedException
    {
        Reifen reifen = (Reifen)super.clone();
        return reifen;
    }

    private int durchmesser;

    public int getDurchmesser() {
        return durchmesser;
    }

    public void setDurchmesser(int durchmesser) {
        this.durchmesser = durchmesser;
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
        Reifen checkR = (Reifen) object;
        if (this.durchmesser != checkR.durchmesser)
        {
            return false;
        }
        return true;
    }
}
