package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {

        int rev = 0;
        int digit;

        while (number != 0) {

            digit = number % 10;
            rev = (rev * 10) + digit;
            number = number / 10;

        }
        System.out.println(rev);
    }

}


