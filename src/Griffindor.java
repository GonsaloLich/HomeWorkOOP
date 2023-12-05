public class Griffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;
    private final int strenghtGriffindor;

    public Griffindor(String name, String surname, int powerMagic, int transgress, int nobility, int honor, int bravery) {
        super(name, surname, powerMagic, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
        this.strenghtGriffindor = nobility + honor + bravery;

    }


    public int getStrenght() {return strenghtGriffindor; }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    public void comparisonResult(Griffindor people1, Griffindor people2) {
        int power1 = people1.getStrenght();
        int power2 = people2.getStrenght();
        if (power1 > power2) {
            System.out.println(people1.getName() + " сильнее чем " + people2.getName());
        } else if ( power1 < power2) {
            System.out.println( people2.getName() + " сильнее чем " + people1.getName());
        } else {
            System.out.println( people1.getName() + " равен по силе " + people2.getName());
        }
    }

}
