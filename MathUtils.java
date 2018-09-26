public class MathUtils {
    /**
     * divideNumbers -- a / b
     * Divide a by b and return the result
     */
    public static double divideNumbers(double dividend, double divisor) {
        /* Do some casual division ... Super easy ... Shouldn't be any problems here */
        double res = dividend / divisor;
        /* Return the DEFINITELY CORRECT result */
        return res;
    }

    public static void main(String[] args){
        double x = divideNumbers(1,2);
        System.out.println(x);
        double result = raiseToPower(3, -3);
        System.out.println(result);
    }

    /**
     * raiseToPower -- (base)^(exp)
     * Raise the number base to power exp
     */
    public static double raiseToPower(int base, int exp) {
        /* Set initial result to be just the number */
        int res = base;

        /* Determine if the exponent is negative */
        boolean isNegative = false;
        if (exp < 0) {
            isNegative = true;
        }

        /* Multiply the result by the base exp times
            Ex: base = 2, exp = 2
               --> res = 2, then res = 4 */

        if (isNegative) {
            for (int i = 0; i > exp +1; i--){
                res *= exp;
            }

            double dividedRes = divideNumbers(1, res);
            return dividedRes;
        }else{
            for (int i = 0; i < exp-1; i++) {
                res *= exp;
            }
        }

        if(exp == 0){
            res = 1;
        }


        /* If it's a negative exponent, we should invert it! */

        /* Otherwise, we are safe to just return the result */
        return res;
    }    
}