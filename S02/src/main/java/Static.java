class SinsaBuildings
{
    public String NAME_COMPANY = "신사건설";
    public String SINSA_APT_DATE = "2015년 8월 31일";
    public String REPRESENTATIVE = "김경태";
    public int COUNT_SINSA_APT = 3;
}

public class Static
{
    public static void main(String[] args) {
        SinsaBuildings sinsaBuildings = new SinsaBuildings();
        System.out.println("=== 신사 아파트 정보===");
        System.out.println("건설사: " + sinsaBuildings.NAME_COMPANY);
        System.out.println("건설사 대표: " + sinsaBuildings.REPRESENTATIVE);
        System.out.println("준공일: " + sinsaBuildings.SINSA_APT_DATE);
        System.out.println("단지수: " + sinsaBuildings.COUNT_SINSA_APT);
    }
}
