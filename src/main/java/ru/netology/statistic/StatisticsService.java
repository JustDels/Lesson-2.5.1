package ru.netology.statistic;

public class StatisticsService {
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */
    public long findMax(long[] incomes) {
        long current_max = incomes[0];
        for (long income : incomes) {
            System.out.println(income);
        }
        return current_max;
    }

    public long findMin(long[] incomes) {
        long current_min = incomes[0];
        for (long income : incomes)
            if (current_min > income)
                current_min = income;
        return current_min;
    }

    public long calculateMid(long[] incomes) {
        long midl = incomes[0];
        long month = 11;
        for (long income : incomes) {
            midl += income;
        }
        return midl / month;
    }
}