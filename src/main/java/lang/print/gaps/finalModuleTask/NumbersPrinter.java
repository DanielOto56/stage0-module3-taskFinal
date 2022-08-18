package lang.print.gaps.finalModuleTask;

import java.util.ArrayList;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        ArrayList<String> responses = new ArrayList<String>();

        responses.add("false");

        for (int i = 0; i < number; i++) {
            responses.add("true");
        }

        String response = "";
        try {

            response = responses.get(number);
        } catch (Exception e) {

            response = "false";
        }
        System.out.println(response);



    }
}
