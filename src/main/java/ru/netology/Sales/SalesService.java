package ru.netology.Sales;

public class SalesService {
    public long getSum(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public long getMidSales(long[] sales) {
        long sum = getSum(sales);
        long midSales = sum / sales.length;
        return midSales;
    }

    public long getFirstMaxMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = sales.length - 1; i >= 0; i--) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long getLastMaxMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMonth(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i- м месяце продажи меньше
                minMonth = i; //запомним его как минимальный
            }
        }
        return minMonth + 1; // месяцы нумеруются с 1, а массив с 0, поэтому ответ сдвинуть на единицу
    }

    public int getMonthsBelowMid(long[] sales) {
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < getMidSales(sales)) {
                count++;
            }
        }
        return count;
    }

    public int getMonthsAboveMid(long[] sales) {
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > getMidSales(sales)) {
                count++;
            }
        }
        return count;
    }
}







