package javaChallenges;

public class Assignment3_3 {
    public static void main(String[] args) {
        int cost=50,discount=12;
        float costinrupee = dollartoruppe(cost);
        float discount_price = costinrupee*discount/100;
        System.out.println("Discount price is : "+discount_price);
        System.out.println("Selling price is : "+(costinrupee-discount_price));

    }
    static float dollartoruppe(int number){
        return (float)75.95*number;
    }
}
