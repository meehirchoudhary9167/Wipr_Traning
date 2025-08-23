package Day9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input_two {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        System.out.println("Enter a number");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        int a = Integer.parseInt(br.readLine());
        System.out.println("Result : " + a);
    }

}