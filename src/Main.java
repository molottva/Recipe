public class Main {
    public static void main(String[] args) {

        int eaters = 3; // сколько людей будут есть
        int water = 3001; // миллилитров воды
        int potatoes = 7; // картофелин
        int chicken = 5; // куриных бёдер
        int spices = 13; // ложек специй

        float eatersFloat = (float) eaters;

        System.out.println("Сварили суп. На одного человека вышло:");
        System.out.println((water / eatersFloat) + " миллилитров воды");
        System.out.println((potatoes / eatersFloat) + " картофелин(а)");
        System.out.println((chicken / eatersFloat) + " куриных(ое) бёдер(ро)");
        System.out.println((spices / eatersFloat) + " ложек(ка) специй");
    }
}