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
    }
}