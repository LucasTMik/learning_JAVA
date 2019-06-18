package mothersday.models;

public class Admin
{
    private Son asSon = null;

    public Son getAsSon() {
        return this.asSon;
    }

    @Override
    public String toString() {
        return "Admin user";
    }
}