package Tanya.MonthSales.services;

public class StatService {

    public long sum(long[] sales) {     //Сумма всех продаж
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long average(long[] sales) {    // Средняя сумма продаж в месяц
        return sum(sales) / 12;
    }

    public int avgLess(long[] sales) {    // Кол-во месяцев, в которых продажи были ниже среднего
        long avg = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    public int minSales(long[] sales) {      // Номер месяца, в котором был минимум продаж

        int minMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale < sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }

        return minMonth + 1;

    }

    public int maxSales(long[] sales) {     // Номер месяца, в котором был пик продаж

        int maxMouth = 0;
        int mouth = 0;

        for (long sale : sales) {
            if (sale >= sales[maxMouth]) {
                maxMouth = mouth;
            }
            mouth = mouth + 1;
        }
        return maxMouth + 1;
    }

    public int aboveAverage(long[] sales) {   // Кол-во месяцев, в которых продажи были выше среднего
        int aboveAverageSalesMonth = 0;

        for (long sale : sales) {
            if (sale > average(sales)) {
                aboveAverageSalesMonth += 1;
            }
        }
        return aboveAverageSalesMonth;
    }

}