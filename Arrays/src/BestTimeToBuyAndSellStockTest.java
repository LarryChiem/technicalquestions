import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @org.junit.jupiter.api.Test
    void maxProfit() {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int[] input = new int[]{7,1,5,3,6,4};
        int expected = 5;
        int output = bestTimeToBuyAndSellStock.maxProfit(input);
        assertEquals(5, output);
    }
}