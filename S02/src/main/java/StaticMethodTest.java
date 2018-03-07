public class StaticMethodTest
{
    static void callMeStatic()
    {
        System.out.println("static 메서드 호출됨.");
    }

    void callMeInstance()
    {
        System.out.println("instance 메서드 호출됨");

        callMeStatic();
    }

    public static void main(String[] args) {
        StaticMethodTest.callMeStatic();

        StaticMethodTest staticMethodTest = new StaticMethodTest();
        staticMethodTest.callMeInstance();
    }
}
