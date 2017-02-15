package src.main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bingwang on 2/14/17.
 */
public class IsoscelesTrianglePrinter {
    public void print(int number) {
        int longest = (number - 1) * 2 + 1;
        List numArray = new ArrayList();
        for (int i = 0; i < number; i++) {
            numArray.add(i * 2 + 1);
        }
        for (int j = 0; j < number; j++) {
            int space = longest - (int)numArray.get(j);
            List temp = new ArrayList();
            for (int m = 0; m < space / 2; m++) {
                temp.add(" ");
            }
            for (int n = 0; n < (int)numArray.get(j); n++) {
                temp.add("*");
            }
            for (int m = 0; m < space / 2; m++) {
                temp.add(" ");
            }
            for (int q = 0; q < temp.size(); q++) {
                System.out.print(temp.get(q));
            }
            System.out.print("\n");
        }
    }
}
