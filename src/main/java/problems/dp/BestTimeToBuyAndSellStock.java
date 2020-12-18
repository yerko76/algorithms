package problems.dp;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args){
        int[] array = new int[]{9,11,8,5,7,10};
        System.out.println(getSolution(array));
        System.out.println(getSolution2(array));
    }
    private static int getSolution(int[] array){
        int maxProfit = 0;
        for(int i=0; i<array.length;i++){
            for(int j=i; j<array.length;j++){
                maxProfit = Math.max(maxProfit, array[j] - array[i]);       
            }
        }
        return maxProfit;
    }

    private static int getSolution2(int[] array){
        int maxProfit = 0;
        int maxCurrentPrice = 0;
        for(int i= array.length -1; i>=0;i--){
           maxCurrentPrice = Math.max(maxCurrentPrice, array[i]);
           maxProfit = Math.max(maxProfit, maxCurrentPrice - array[i]);
        }
        return maxProfit;
    }
    
}
