package ru.itsjava.oopPractice.Birds;

public class Crow extends Birds {

    public Crow(String name, boolean canFlight,
                boolean canTalk, int adg) {
        super(name, canFlight, canTalk, adg);
    }

    public void say() {
        System.out.println("Ворон говорит: КАРР!");
    }

    public void sayWords(String words) {
        if (super.isCantalk()) {
            System.out.println("Ворон " + super.getName() + " говорит: " + words.toUpperCase() + "!");
        } else {
            System.out.println("Ворон говорит: КАРР!");
        }
    }

    public void submit() {
        System.out.println("Ворон " + super.getName() + ((super.isCanflight()) ? " может летать" : " не умеет летать")
                + ((super.isCantalk()) ? " может говорить" : " не умеет говорить") + " возраст " + super.getAdg());
    }
}
