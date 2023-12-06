public class Slizerin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int strenghtSlizerin;


    public Slizerin(String name, String surname, int powerMagic, int transgress, int cunning, int determination, int ambition, int resourcefulness, int lustPower) {
        super(name, surname, powerMagic, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustPower = lustPower;
        this.strenghtSlizerin = cunning + determination + ambition + resourcefulness + lustPower;
    }
    public int getStrenghtSlizerin() {
        return strenghtSlizerin;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustPower() {
        return lustPower;
    }

    public void setLustPower(int lustPower) {
        this.lustPower = lustPower;
    }

    private int resourcefulness;
    private int lustPower;
    public void comparisonResult(Slizerin people1, Slizerin people2) {
        int power1 = people1.getStrenghtSlizerin();
        int power2 = people2.getStrenghtSlizerin();
        if (power1 > power2) {
            System.out.println(people1.getName() + " сильнее чем " + people2.getName());
        } else if (power1 < power2) {
            System.out.println(people2.getName() + " сильнее чем " + people1.getName());
        } else {
            System.out.println(people1.getName() + " равен по силе " + people2.getName());
        }
    }
}
