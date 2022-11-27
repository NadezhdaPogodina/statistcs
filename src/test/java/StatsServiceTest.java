import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.services.StatsService;


public class StatsServiceTest {
    @Test
    public void testCountSum() {

        StatsService service = new StatsService();

        int[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.countSum(sum);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testCountAverageSum() {

        StatsService service = new StatsService();

        int[] average = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.countAverageSales(average);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountMaxSum() {

        StatsService service = new StatsService();

        int[] maxSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.countMaxSales(maxSales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountMinSum() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.countMinSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testCountMonths() {
        StatsService service = new StatsService();

        int[] belowAverage = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonths(belowAverage);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testNumberMonths() {
        StatsService service = new StatsService();

        int[] aboveAverage = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonths(aboveAverage);
        Assertions.assertEquals(expected, actual);

    }
}