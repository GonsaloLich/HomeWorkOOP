public class Kogtevran extends Hogwarts{
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;
    private int strenghtKogtevran;

    public Kogtevran(String name, String surname, int powerMagic, int transgress,int mind, int wisdom, int wit, int creativity) {
        super(name, surname, powerMagic, transgress);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
        this.strenghtKogtevran = mind + wisdom + wit + creativity;
    }

    public int getStrenghtKogtevran() {
        return strenghtKogtevran;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public void comparisonResult(Kogtevran people1, Kogtevran people2) {
        int power1 = people1.getStrenghtKogtevran();
        int power2 = people2.getStrenghtKogtevran();
        if (power1 > power2) {
            System.out.println(people1.getName() + " сильнее чем " + people2.getName());
        } else if ( power1 < power2) {
            System.out.println( people2.getName() + " сильнее чем " + people1.getName());
        } else {
            System.out.println( people1.getName() + " равен по силе " + people2.getName());
        }
    }
}
