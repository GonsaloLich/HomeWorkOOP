public class Main {
    public static void main(String[] args) {
        Hogwarts[] hogwarts = {
                new Hogwarts("Гарри", "Поттер",90,10),
                new Hogwarts("Гермиона","Грейнджер",10,10),
                new Hogwarts("Рон","Уизли",10,10),
                new Hogwarts("Драко","Малфой",10,10),
                new Hogwarts("Грэхэм","Монтегю",10,10),
                new Hogwarts("Грегори","Гойл",10,10),
                new Hogwarts("Захария ","Смит",10,10),
                new Hogwarts("Седрик","Диггори",10,10),
                new Hogwarts("Джастин","Финч-Флетчли",10,10),
                new Hogwarts("Чжоу","Чанг",10,10),
                new Hogwarts("Падма","Патил",10,10),
                new Hogwarts("Маркус","Белби",10,10),

        };

        Griffindor[] griffindors = {
                new Griffindor("Гарри", "Поттер",90,10,10,10,10),
                new Griffindor("Гермиона","Грейнджер",10,10,1,1,1),
                new Griffindor("Рон","Уизли",10,10,1,1,1),
        };

        Puffendui[] puffenduis = {
                new Puffendui("Захария ","Смит",10,10,1,1,1),
                new Puffendui("Седрик","Диггори",10,10,1,1,1),
                new Puffendui("Джастин","Финч-Флетчли",10,10,1,1,1),

        };

        Kogtevran[] kogtevrans = {
                new Kogtevran("Чжоу","Чанг",10,10,1,1,1,1),
                new Kogtevran("Падма","Патил",10,10,1,1,1,1),
                new Kogtevran("Маркус","Белби",10,10,1,1,1,1),
        };

        Slizerin[] slizerins = {
                new Slizerin("Драко","Малфой",10,10,1,1,1,1,1),
                new Slizerin("Грэхэм","Монтегю",10,10,1,1,1,1,1),
                new Slizerin("Грегори","Гойл",10,10,1,1,1,1,1),
        };
        PrintService printService = new PrintService();
        printService.printStudents(hogwarts);
        printService.printStudents(griffindors);
    }
}