

public class ArrayObject
{
    static int[] numbers = {1,2,3,4,5};

    int[] instanceNumbers = {1,2,3,4};

    static int sumOfNumbers()
    {
        int sum = 0;
        for (int i = 0; i < 5; i++)
        {
            sum += numbers[i];
        }
        return sum;
    }

    int sumOfInstanceNumbers()
    {
        int sum = 0;
        for (int i = 0; i < 4; i++)
        {
            sum += instanceNumbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayObject arrayObject = new ArrayObject();

        System.out.println(ArrayObject.sumOfNumbers());
        System.out.println(arrayObject.sumOfInstanceNumbers());
    }
}
