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
    public void comparisonResult(Hogwarts people1, Hogwarts people2) {
        int power1 = people1.getTotalStrengt();
        int power2 = people2.getTotalStrengt();
        if (power1 > power2) {
            System.out.println(people1.getName() + " сильнее чем " + people2.getName());
        } else if ( power1 < power2) {
            System.out.println( people2.getName() + " сильнее чем " + people1.getName());
        } else {
            System.out.println( people1.getName() + " равен по силе " + people2.getName());
        }

    }
}
