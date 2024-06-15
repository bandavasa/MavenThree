package ru.netology.stats;

public class StatsService {

// 1.Сумму всех продаж.

    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }


// 2.Среднюю сумму продаж в месяц.
    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }


// 3.Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму.

public int maxSales(long[] sales) {
    int maxMonth = 0;
    long maxSale = 0;

    for (int i = 0; i < sales.length; i++) {
        if (sales [i] >= maxSale) {
            maxSale = sales[i];
            maxMonth = i;
        }
    }
    return maxMonth + 1;

}

// 4.Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму.

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

// 5.Количество месяцев, в которых продажи были ниже среднего.
    public int belowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }
            
        }
        return counter;
    }

// 6.Количество месяцев, в которых продажи были выше среднего.
    public int aboveAverage(long[] sales) {
    int counter = 0;
    for (long sale : sales) {
        if (sale > average(sales)) {
            counter++;
        }

    }
    return counter;
}


}
