package mothersday.models;

public class Admin
{
    private Son asSon = null;

    public Admin() {
        System.out.println("Hi im an admin");
    }

    public Son getAsSon() {
        return this.asSon;
    }

}