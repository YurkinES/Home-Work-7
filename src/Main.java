public class Main {
    public static void main(String[] args) {
        //Task #1
        int totalMoney = 0;
        int monthContribution = 15000;
        int numberOfMonth = 0;
        while (totalMoney <= 2_459_000) {
            numberOfMonth++;
            totalMoney = totalMoney + totalMoney / 100;
            totalMoney = totalMoney + monthContribution;

        }
        System.out.println("Месяц " + numberOfMonth + " сумма накоплений равна " + totalMoney + " рублей");
        //Task #2
        int n = 0;
        while (n < 10) {
            n++;
            System.out.print(n + " ");
        }
        System.out.println();
        while (n > 0) {
            System.out.print(n + " ");
            n--;
        }
        System.out.println();
        //Task #3
        int population = 12000000;
        int birthRate = population / 1000 * 17;
        int deathRate = population / 1000 * 8;
        int numberOfYears = 0;
        while (numberOfYears < 10) {
            numberOfYears++;
            population = population + birthRate - deathRate;
            System.out.println("Год " + numberOfYears + " численность населения состовляет " + population);
        }
        //Task #4
        int totalMoney4 = 15000;
        int numberOfMonth4 = 0;
        while (totalMoney4 < 12000000) {
            totalMoney4 = totalMoney4 + totalMoney4 / 100 * 7;
            numberOfMonth4++;
            System.out.println("Месяц " + numberOfMonth4 + " сумма накоплений " + totalMoney4 + " рублей");
        }
        System.out.println("Итого месяцев для накопления необходимой суммы " + numberOfMonth4);
        //Task #5
        int totalMoney5 = 15000;
        int numberOfMonth5 = 0;
        while (totalMoney5 < 12000000) {
            totalMoney5 = totalMoney5 + totalMoney5 / 100 * 7;
            numberOfMonth5++;
            if (numberOfMonth5 % 6 == 0){
                System.out.println("Месяц " + numberOfMonth5 + " сумма накоплений " + totalMoney5 + " рублей");}
        }
        System.out.println("Итого месяцев для накопления необходимой суммы " + numberOfMonth5);
        //Task #6
        int totalMoney6 = 15000;
        int numberOfMonth6 = 0;
        int accumulationTime = 9 * 12;
        while (numberOfMonth6 <= accumulationTime) {
            totalMoney6 = totalMoney6 + totalMoney6 / 100 * 7;
            numberOfMonth6++;
            if (numberOfMonth6 % 6 == 0){
                System.out.println("Месяц " + numberOfMonth6 + " сумма накоплений " + totalMoney6 + " рублей");}
        }
        //Task #7
        int friday = 1;
        int numbersOfDays = 31;
        while (friday <= numbersOfDays) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday +7;
        }
    }
}