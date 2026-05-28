public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("=== Задача 1 ===");
        int myInt = 40000;
        byte myByte = 22;
        short myShort = 1500;
        long myLong = 9876543210L;
        float myFloat = 3.75f;
        double myDouble = 2.718281828;

        System.out.println("Значение переменной myInt с типом int равно " + myInt);
        System.out.println("Значение переменной myByte с типом byte равно " + myByte);
        System.out.println("Значение переменной myShort с типом short равно " + myShort);
        System.out.println("Значение переменной myLong с типом long равно " + myLong);
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);

        // Задача 2
        System.out.println("\n=== Задача 2 ===");
        double value1 = 27.12;
        long value2 = 987678965549L;
        double value3 = 2.786;
        short value4 = 569;
        short value5 = -159;
        int value6 = 27897;
        byte value7 = 67;

        System.out.println("27.12 -> double: " + value1);
        System.out.println("987678965549 -> long: " + value2);
        System.out.println("2.786 -> double: " + value3);
        System.out.println("569 -> short: " + value4);
        System.out.println("-159 -> short: " + value5);
        System.out.println("27897 -> int: " + value6);
        System.out.println("67 -> byte: " + value7);

        // Задача 3
        System.out.println("\n=== Задача 3 ===");
        int ludmilaStudents = 23;
        int annaStudents = 27;
        int katerinaStudents = 30;
        int totalPaper = 480;
        int totalStudents = ludmilaStudents + annaStudents + katerinaStudents;
        int paperPerStudent = totalPaper / totalStudents;

        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");

        // Задача 4
        System.out.println("\n=== Задача 4 ===");
        int bottlesPerTwoMinutes = 16;
        int minutesInTwoMinutes = 2;
        int bottlesPerMinute = bottlesPerTwoMinutes / minutesInTwoMinutes;

        int minutes20 = 20;
        int minutesInDay = 60 * 24;
        int minutesIn3Days = minutesInDay * 3;
        int minutesInMonth = minutesInDay * 30;

        long bottlesIn20Min = (long) bottlesPerMinute * minutes20;
        long bottlesInDay = (long) bottlesPerMinute * minutesInDay;
        long bottlesIn3Days = (long) bottlesPerMinute * minutesIn3Days;
        long bottlesInMonth = (long) bottlesPerMinute * minutesInMonth;

        System.out.println("За 20 минут машина произвела " + bottlesIn20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesInDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesInMonth + " штук бутылок");

        // Задача 5
        System.out.println("\n=== Задача 5 ===");
        int totalPaintCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int cansPerClass = whiteCansPerClass + brownCansPerClass;
        int classCount = totalPaintCans / cansPerClass;
        int whiteCans = classCount * whiteCansPerClass;
        int brownCans = classCount * brownCansPerClass;

        System.out.println("В школе, где " + classCount + " классов, нужно "
                + whiteCans + " банок белой краски и "
                + brownCans + " банок коричневой краски");

        // Задача 6
        System.out.println("\n=== Задача 6 ===");
        int bananaCount = 5;
        int bananaWeightEach = 80;
        int milkMl = 200;
        double gramsPerMl = 1.05; // 100 мл = 105 грамм
        int iceCreamCount = 2;
        int iceCreamWeightEach = 100;
        int eggCount = 4;
        int eggWeightEach = 70;

        int bananaTotal = bananaCount * bananaWeightEach;
        double milkTotal = milkMl * gramsPerMl;
        int iceCreamTotal = iceCreamCount * iceCreamWeightEach;
        int eggTotal = eggCount * eggWeightEach;

        double totalGrams = bananaTotal + milkTotal + iceCreamTotal + eggTotal;
        double totalKg = totalGrams / 1000;

        System.out.println("Вес спортзавтрака: " + totalGrams + " граммов");
        System.out.println("Вес спортзавтрака: " + totalKg + " килограммов");

        // Задача 7
        System.out.println("\n=== Задача 7 ===");
        int weightToLose = 7000; // в граммах
        int lossPerDaySlow = 250;
        int lossPerDayFast = 500;

        int daysSlow = weightToLose / lossPerDaySlow;
        int daysFast = weightToLose / lossPerDayFast;
        int daysAverage = (daysSlow + daysFast) / 2;

        System.out.println("При потере 250 г/день уйдёт " + daysSlow + " дней");
        System.out.println("При потере 500 г/день уйдёт " + daysFast + " дней");
        System.out.println("В среднем потребуется " + daysAverage + " дней");

        // Задача 8
        System.out.println("\n=== Задача 8 ===");
        double mashaSalary = 67760;
        double denisSalary = 83690;
        double kristinaSalary = 76230;
        double raisePercent = 0.10;
        int monthsInYear = 12;

        double mashaRaise = mashaSalary * raisePercent;
        double denisRaise = denisSalary * raisePercent;
        double kristinaRaise = kristinaSalary * raisePercent;

        double mashaNewSalary = mashaSalary + mashaRaise;
        double denisNewSalary = denisSalary + denisRaise;
        double kristinaNewSalary = kristinaSalary + kristinaRaise;

        double mashaYearDiff = mashaRaise * monthsInYear;
        double denisYearDiff = denisRaise * monthsInYear;
        double kristinaYearDiff = kristinaRaise * monthsInYear;

        System.out.println("Маша теперь получает " + mashaNewSalary
                + " рублей. Годовой доход вырос на " + mashaYearDiff + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary
                + " рублей. Годовой доход вырос на " + denisYearDiff + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewSalary
                + " рублей. Годовой доход вырос на " + kristinaYearDiff + " рублей");
    }
}