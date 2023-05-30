class Credit{

    public static void main(String[] args) {

        long num = 4003600000000014L;
        long max = 100000000000000000L;
        //long num = 54003600000000014L;

        // Check for long inputs > 16 digits:
        if (num<max){

            int numberArray[] = new int[16];
            int k = 0;

            // Save digits in numberArray[] in reverse order:
            for(long i=10L;i<max;i*=10){

                long remainder = num%i;
                num-=remainder;
                long digit = 10*remainder/i;
                int x = (int) digit;
                numberArray[k] = x;
                k++;
            }

            System.out.print("NUMBER ARRAY: ");

            for(int l=0;l<16;l++){
                System.out.print(numberArray[l]);
            }

        }else{
            System.out.println("Number out of range");
        }
        

    }
}