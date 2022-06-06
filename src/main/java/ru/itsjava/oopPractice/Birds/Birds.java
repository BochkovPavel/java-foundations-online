package ru.itsjava.oopPractice.Birds;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Birds {
    private final String name;
    private final boolean canflight;
    private final boolean cantalk;
    private int adg;

    public String getName() {
        return name;
    }

    public void say() {
        System.out.println("Птичка говорит: Чик-Чирик");
    }

    public void submit(){
        System.out.println("Птичка");
    }

    public void sayWords(String words) {
        System.out.println("Птичка говорит: Чик-Чирик");
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true; // Проверяем равенство ссылок
//        if (!(o instanceof Birds)) return false; //проверяем пренодлежность к нужному классу
//        Birds birds = (Birds) o; // явно приводим к нужному классу
//        return CANFLIGHT == birds.CANFLIGHT && CANTALK == birds.CANTALK
//                && adg == birds.adg && NAME.equals(birds.NAME); //Сравниваем поля/данные объектов
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(NAME, CANFLIGHT, CANTALK, adg);
//        /* вызываем метод hash класса Objects. B методе hash вызываем метод hashCode класса Array. В метод hashCode
//        передается массив из переменных.
//        public static int hashCode(float a[]) {
//        if (a == null)  проверяем на null и возвращаем 0 ели null
//            return 0;
//
//        int result = 1;  создаем и инициализируем целочисленную переменную типа int
//        for (float element : a)  сокращенная запись цикла for
//            result = 31 * result + Float.floatToIntBits(element); расчет hash кода
//
//        return result; возвращаем результат
//    }
//
//        */
//    }
}
