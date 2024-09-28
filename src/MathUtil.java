public class MathUtil {


        public static boolean isPrime(int n) {
            int i, j;
            for(int i = 2; i <= 100; i ++){
                boolean isPrime = true;

                if(i % 2 == 0){
                    isPrime = false;

                }
                if(isPrime){
                    System.out.println(i);
                }
            }
        }

}
