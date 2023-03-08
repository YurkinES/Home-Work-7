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
    }
}