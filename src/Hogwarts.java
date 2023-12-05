public class Hogwarts {
    private String name;
    private String surname;
    private int powerMagic;
    private int transgress;
    private int totalStrengt;



    public Hogwarts(String name, String surname, int powerMagic, int transgress) {
        this.name = name;
        this.surname = surname;
        this.powerMagic = powerMagic;
        this.transgress = transgress;
        this.totalStrengt = powerMagic + transgress;

    }
    public int getTotalStrengt() {
        return totalStrengt;
    }

    public Hogwarts() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }
}
