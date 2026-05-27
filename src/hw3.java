public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("=== Задача 1 ===");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        // Задача 2
        System.out.println("=== Задача 2 ===");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        // Задача 3
        System.out.println("=== Задача 3 ===");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        // Задача 4
        System.out.println("=== Задача 4 ===");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);

        // Задача 5
        System.out.println("=== Задача 5 ===");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);

        // Задача 6
        System.out.println("=== Задача 6 ===");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        var weightDiff = boxer2 - boxer1;
        System.out.println("Общая масса двух бойцов: " + totalWeight + " кг");
        System.out.println("Разница между массами бойцов: " + weightDiff + " кг");

        // Задача 7
        System.out.println("=== Задача 7 ===");
        var remainder = boxer2 % boxer1;
        System.out.println("Остаток от деления " + boxer2 + " на " + boxer1 + " = " + remainder);

        // Задача 8
        System.out.println("=== Задача 8 ===");
        var totalHours = 640;
        var hoursPerEmployee = 8;
        var employeeCount = totalHours / hoursPerEmployee;
        System.out.println("Всего работников в компании — " + employeeCount + " человек");

        var extraEmployees = 94;
        var newEmployeeCount = employeeCount + extraEmployees;
        var newTotalHours = newEmployeeCount * hoursPerEmployee;
        System.out.println("Если в компании работает " + newEmployeeCount +
                " человек, то всего " + newTotalHours +
                " часов работы может быть поделено между сотрудниками");
    }
}