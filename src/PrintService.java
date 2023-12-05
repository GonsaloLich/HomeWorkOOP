public class PrintService {
    public void printStudents(Hogwarts[] peoples) {
        System.out.println("Всего учеников" + peoples.length);
        for (Hogwarts hogwarts: peoples) {
            System.out.println("Имя " + hogwarts.getName() + "Фамилия " + hogwarts.getSurname() + "Сила магии " + hogwarts.getPowerMagic() + "трансгрессия " + hogwarts.getTransgress()) ;
        };
    }
    public void printStudents(Griffindor[] peoples) {
        for (Griffindor griffindors : peoples) {
            System.out.println("Имя " + griffindors.getName() + " фамилия " + griffindors.getSurname() + " Сила магии " + griffindors.getPowerMagic() + " трансгрессия " + griffindors.getTransgress() + " благородство" + griffindors.getNobility() + " честь " + griffindors.getHonor() + " храбрость " + griffindors.getBravery());
        }
    }
    public void printStudents(Puffendui[] peoples) {
        for (Puffendui puffenduis : peoples) {
            System.out.println();
        }
    }
    public void printStudents(Kogtevran[] people){

    }
    public void printStudents(Slizerin[] people){

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
    public void comparisonResult(Slizerin people1, Slizerin people2) {
        int power1 = people1.getStrenghtSlizerin();
        int power2 = people2.getStrenghtSlizerin();
        if (power1 > power2) {
            System.out.println(people1.getName() + " сильнее чем " + people2.getName());
        } else if ( power1 < power2) {
            System.out.println( people2.getName() + " сильнее чем " + people1.getName());
        } else {
            System.out.println( people1.getName() + " равен по силе " + people2.getName());
        }
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
