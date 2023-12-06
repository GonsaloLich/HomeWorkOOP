public class Puffendui extends Hogwarts {
    private int diligence;
    private int fealty;
    private int honesty;
    private final int strenghtPuffendui;
    public Puffendui(String name, String surname, int powerMagic, int transgress, int diligence, int fealty, int honesty) {
        super(name, surname, powerMagic, transgress);
        this.diligence = diligence;
        this.fealty = fealty;
        this.honesty = honesty;
        this.strenghtPuffendui = diligence + fealty + honesty;
    }

    public int getStrenghtPuffendui() {
        return strenghtPuffendui;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getFealty() {
        return fealty;
    }

    public void setFealty(int fealty) {
        this.fealty = fealty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public void comparisonResult(Puffendui people1, Puffendui people2){
        int power1 = people1.getStrenghtPuffendui();
        int power2 = people2.getStrenghtPuffendui();
        if (power1 > power2) {
            System.out.println(people1.getName() + " сильнее чем " + people2.getName());
        } else if ( power1 < power2) {
            System.out.println( people2.getName() + " сильнее чем " + people1.getName());
        } else {
            System.out.println( people1.getName() + " равен по силе " + people2.getName());
        }
    }
}
