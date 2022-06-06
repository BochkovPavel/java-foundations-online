package ru.itsjava.oopPractice.Birds;

public class Parrot extends Birds {

    public Parrot(String name, boolean canFlight,
                  boolean canTalk, int adg) {
        super(name, canFlight, canTalk, adg);
    }

    public void say() {
        if (super.isCantalk()) {
            if (Math.random() * 3 >= 2) {
                System.out.println("Попугай " + super.getName() + " говорит: \"КАРРАММБА!\"");
            } else {
                System.out.println("Попугай " + super.getName() +
                        " говорит: \"Свистать всех на верх, тысяча чертей!\"");
            }

        } else {
            System.out.println("Попугай говорит: Чик-Чирик");
        }
    }

    public void sayWords(String words) {
        if (super.isCantalk()) {
            System.out.println("Попугай " + super.getName() + " говорит: " + words.toUpperCase() + "!");
        } else {
            System.out.println("Попугай говорит: Чик-Чирик");
        }
    }

    public void submit() {
        System.out.println("Попугай " + super.getName() + ((super.isCanflight()) ? " может летать" : " не умеет летать")
                + ((super.isCantalk()) ? " может говорить" : " не умеет говорить") + " возраст " + super.getAdg());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
