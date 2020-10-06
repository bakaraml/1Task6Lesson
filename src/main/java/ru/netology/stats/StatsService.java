package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long result = 0;
        for (long purchase : purchases) {
            result += purchase;
        }
        return result;
    }


    public long maxFind(long[] purchases) {
        long currentMax = purchases[0];
        for (long purchase : purchases) {
            if (currentMax < purchase) {
                currentMax = purchase;
            }
        }
        int month = 1;
        int monthMax = 0;
        for (long purchase : purchases) {
            if (purchase == currentMax) {
                monthMax = month;
            }
            month = month + 1;
        }

        return monthMax;
    }

    public long minFind(long[] purchases) {
        long currentMin = purchases[0];
        for (long purchase : purchases) {
            if (currentMin > purchase) {
                currentMin = purchase;
            }
        }
        int month = 1;
        int monthMin = 0;
        for (long purchase : purchases) {
            if (purchase == currentMin) {
                monthMin = month;
            }
            month = month + 1;
        }

        return monthMin;
    }

    public long middleValue(long[] purchases) {
        long calculateSum = calculateSum(purchases);
        //return calculateSum(purchases) / purchases.length;
        return calculateSum / purchases.length;
    }

    public long maxMiddleValue(long[] purchases) {
        long middleValue = middleValue(purchases);
        int count = 0;

        long currentMax = purchases[0];
        for (long purchase : purchases) {
            if (purchase > middleValue) {
                count = count + 1;
            }
        }
        return count;
}

    public long minMiddleValue(long[] purchases) {
        long middleValue = middleValue(purchases);
        int count = 0;

        long currentMin = purchases[0];
        for (long purchase : purchases) {
            if (purchase < middleValue) {
                count = count + 1;
            }
        }
        return count;
    }
}

