public class D4_LiveCoding
{
    public static void main(String[] args) {
        if(args.length == 0)
        {
            System.out.println("입력된 인자가 없습니다.");

            return;
        }

        int number = Integer.parseInt(args[0]);

        boolean isEven = (number % 2 == 0);

        if(isEven)
        {
            System.out.println(number + "는 짝수입니다.");
        }
        else
        {
            System.out.println(number + "는 홀수입니다.");
        }
    }
}
