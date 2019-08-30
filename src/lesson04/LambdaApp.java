package lesson04;

public class LambdaApp {
    public static void main(String[] args) {
        int[] array = {-6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6};

        Expression exp1 = el -> el%2==0;
        Expression exp2 = ExpressionUtils::isNegative;
        Expression exp3 = ExpressionUtils::isPositive;

        System.out.println(sumof(array, exp1));
        System.out.println(sumof(array, exp2));
        System.out.println(sumof(array, exp3));

    }

    private static int sumof(int [] array, Expression func)
        {
            int sum = 0;
            for(int el : array)
                {
                    if(func.isTrue(el))
                        sum+= el;
                }
            return sum;
        }
}
