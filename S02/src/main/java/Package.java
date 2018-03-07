import apt.seocho.SeochoApt;

public class Package
{
    public static void main(String[] args)
    {
        SeochoApt seocho = new SeochoApt();

        System.out.println("서초 아파트 최저가: " + seocho.getLowestPrice());
    }
}
