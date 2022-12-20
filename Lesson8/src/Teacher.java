class Teacher {
    String name;
    public Teacher(String newName) {
        name = newName;
    }
}

class LiteratureTeacher extends Teacher {
    int pushkinLessons;
    int tolstojLessons;

    public LiteratureTeacher(int newPushkinLessons,int newTolstojLessons,String name) {
        super(name);
        pushkinLessons = newPushkinLessons;
        tolstojLessons = newTolstojLessons;

    }
}

public class Practicum {
    public static void main(String[] args) {
        LiteratureTeacher teacher = new LiteratureTeacher(12, 43, "Мария Ивановна Петрова");
        System.out.println("Уроков по Пушкину - " + teacher.pushkinLessons);
        System.out.println("Уроков по Толстому - " + teacher.tolstojLessons);
        System.out.println("Учитель - " + teacher.name);
    }
}