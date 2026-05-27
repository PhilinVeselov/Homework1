public class hw3 {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("=== Задача 1 ===");
        int myInt = 42;
        byte myByte = 10;
        short myShort = 1000;
        long myLong = 9999999999L;
        float myFloat = 3.14f;
        double myDouble = 2.718281828;

        System.out.println("Значение переменной myInt с типом int равно " + myInt);
        System.out.println("Значение переменной myByte с типом byte равно " + myByte);
        System.out.println("Значение переменной myShort с типом short равно " + myShort);
        System.out.println("Значение переменной myLong с типом long равно " + myLong);
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);

        // Задача 2
        System.out.println("=== Задача 2 ===");
        double firstValue = 27.12;
        long secondValue = 987678965549L;
        float thirdValue = 2.786f;
        int fourthValue = 569;
        int fifthValue = -159;
        int sixthValue = 27897;
        byte seventhValue = 67;

        System.out.println(firstValue);
        System.out.println(secondValue);
        System.out.println(thirdValue);
        System.out.println(fourthValue);
        System.out.println(fifthValue);
        System.out.println(sixthValue);
        System.out.println(seventhValue);

        // Задача 3
        System.out.println("=== Задача 3 ===");
        int lyudmilaStudents = 23;
        int annaStudents = 27;
        int ekaterinaStudents = 30;
        int totalSheets = 480;
        int totalStudents = lyudmilaStudents + annaStudents + ekaterinaStudents;
        int sheetsPerStudent = totalSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

        // Задача 4
        System.out.println("=== Задача 4 ===");
        int bottlesPerTwoMinutes = 16;
        int bottlesPerMinute = bottlesPerTwoMinutes / 2;

        int bottlesIn20Minutes = bottlesPerMinute * 20;
        int bottlesInDay = bottlesPerMinute * 60 * 24;
        int bottlesIn3Days = bottlesInDay * 3;
        int bottlesInMonth = bottlesInDay * 30;

        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesInDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesInMonth + " штук бутылок");

        // Задача 5
        System.out.println("=== Задача 5 ===");
        int totalPaintCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int cansPerClass = whiteCansPerClass + brownCansPerClass;
        int classCount = totalPaintCans / cansPerClass;
        int whiteCans = classCount * whiteCansPerClass;
        int brownCans = classCount * brownCansPerClass;
        System.out.println("В школе, где " + classCount + " классов, нужно "
                + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски");

        // Задача 6
        System.out.println("=== Задача 6 ===");
        int bananaCount = 5;
        int bananaWeightGrams = 80;
        int milkMl = 200;
        int milkGramsPer100ml = 105;
        int iceCreamCount = 2;
        int iceCreamWeightGrams = 100;
        int eggCount = 4;
        int eggWeightGrams = 70;

        int totalGrams = (bananaCount * bananaWeightGrams)
                + (milkMl * milkGramsPer100ml / 100)
                + (iceCreamCount * iceCreamWeightGrams)
                + (eggCount * eggWeightGrams);
        double totalKilograms = (double) totalGrams / 1000;

        System.out.println("Вес спортзавтрака: " + totalGrams + " граммов");
        System.out.println("Вес спортзавтрака: " + totalKilograms + " килограммов");

        // Задача 7
        System.out.println("=== Задача 7 ===");
        int weightToLoseGrams = 7000;
        int lossPerDayMin = 250;
        int lossPerDayMax = 500;

        int daysMin = weightToLoseGrams / lossPerDayMax;
        int daysMax = weightToLoseGrams / lossPerDayMin;
        int daysAverage = (daysMin + daysMax) / 2;

        System.out.println("При потере 500 г/день уйдёт " + daysMin + " дней");
        System.out.println("При потере 250 г/день уйдёт " + daysMax + " дней");
        System.out.println("В среднем потребуется " + daysAverage + " дней");

        // Задача 8
        System.out.println("=== Задача 8 ===");
        double mashaSalary = 67760;
        double denisSalary = 83690;
        double kristinaSalary = 76230;

        double mashaNewSalary = mashaSalary * 1.1;
        double denisNewSalary = denisSalary * 1.1;
        double kristinaNewSalary = kristinaSalary * 1.1;

        double mashaYearlyDiff = (mashaNewSalary - mashaSalary) * 12;
        double denisYearlyDiff = (denisNewSalary - denisSalary) * 12;
        double kristinaYearlyDiff = (kristinaNewSalary - kristinaSalary) * 12;

        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaYearlyDiff + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisYearlyDiff + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaYearlyDiff + " рублей");
    }
}