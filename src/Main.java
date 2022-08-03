public class Main {
    public static void main(String[] args) {
        // Задача 1
        // byte a = 126;
        // short b = 32;
        // int c = 123;
        // long n = 123L;
        // float f = 5432.12F;
        // double rub = 421.42;

        // Задача 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double overall = boxer2 + boxer1;
        System.out.println("Общий вес боксёров " + overall + " кг");
        double difference = boxer2 - boxer1;
        System.out.println("Разница боксёров в весе " + difference + " кг");

        // Задача 3
        var bananaWeight = 80;
        var bananas = 5;
        var bbananasWeight = bananaWeight * bananas;

        var milkWeight100 = 105;
        var milk = 2;
        var mmilkWeight = milkWeight100 * milk;

        var icecreamWeight1block = 100;
        var icecream = 2;
        var iicecreamWeight = icecreamWeight1block * icecream;

        var eggWeight = 70;
        var eggs = 4;
        var eeggsWeight = eggWeight * eggs;

        double productsWeightGram = eeggsWeight + iicecreamWeight + mmilkWeight + bbananasWeight;
        double pproductsWeightKilo = productsWeightGram / 1000;
        System.out.println("Вес спортивного завтрака в кг: " + pproductsWeightKilo);

        // Задача 4
        var minusWeightKilo = 7;
        var minusWeightGram = minusWeightKilo * 1000;
        var weight250Day = 250;
        var day250 = minusWeightGram / weight250Day;
        System.out.println("Если терять по 250 каллорий,то уйдёт " + day250 + " дней");
        var weight500Day = 500;
        var day500 = minusWeightGram / weight500Day;
        System.out.println("Если терять по 500 каллорий,то уйдёт " + day500 + " дней");

        // Задача 5
        double mashaOldSalary = 67760;
        double mashaNewSalary = mashaOldSalary * 1.1;
        double mashaDifSalary = mashaNewSalary - mashaOldSalary;

        double denOldSalary = 83690;
        double denNewSalary = denOldSalary * 1.1;
        double denDifSalary = denNewSalary - denOldSalary;

        double krisOldSalary = 76230;
        double krisNewSalary = krisOldSalary * 1.1;
        double krisDifSalary = krisNewSalary - krisOldSalary;
        System.out.println("Маша теперь получает " + mashaNewSalary +" рублей. Годовой доход вырос на " + mashaDifSalary + " рублей");
        System.out.println("Денис теперь получает " + denNewSalary +" рублей. Годовой доход вырос на " + denDifSalary + " рублей");
        System.out.println("Кристина теперь получает " + krisNewSalary +" рублей. Годовой доход вырос на " + krisDifSalary + " рублей");





    }
}