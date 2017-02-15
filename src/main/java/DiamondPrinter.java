package src.main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bingwang on 2/15/17.
 */
public class DiamondPrinter {
    public void print(int number) {
        int longest = (number - 1) * 2 + 1;
        List numArray = new ArrayList();
        List diamondArray = new ArrayList();
        for (int i = 0; i < number; i++) {
            numArray.add(i * 2 + 1);
        }
        for (int j = 0; j < number; j++) {
            int space = longest - (int) numArray.get(j);
            String temp = "";
            for (int m = 0; m < space / 2; m++) {
                temp += " ";
            }
            for (int n = 0; n < (int) numArray.get(j); n++) {
                temp += "*";
            }
            for (int m = 0; m < space / 2; m++) {
                temp += " ";
            }
            if (j < number - 1) {
                diamondArray.add(temp);
            }
            System.out.print(temp);
            System.out.print("\n");

        }
        for (int p = diamondArray.size() - 1; p >= 0; p--) {
            System.out.print(diamondArray.get(p));
            System.out.print("\n");
        }
    }
}
