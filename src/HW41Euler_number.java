import java.math.BigDecimal;
import java.math.BigInteger;

public class HW41Euler_number {
    public static void main(String[] args)
    {
        BigDecimal e =new BigDecimal(0.0);
        for(int i = 0;i < 1000; i++)
        {
            BigDecimal temp = new BigDecimal(1.0);
            BigDecimal temp2 = new BigDecimal(factorial(i));
            temp2=temp.divide(temp2, 1000, BigDecimal.ROUND_UP);
            e=e.add(temp2);
        }
        System.out.println(e);
    }

    public static BigInteger factorial(int x)
    {
        BigInteger temp = new BigInteger("1");
        for(int i = 1;i <= x; i++)
            temp = temp.multiply(new BigInteger(""+i));
        return temp;
    }
}
