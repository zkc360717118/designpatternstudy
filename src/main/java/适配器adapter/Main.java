package 适配器adapter;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("G:\\projects\\designpatternstudy\\src\\main\\resources\\app.xml");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedInputStream = new BufferedReader(inputStreamReader);
        String line = bufferedInputStream.readLine();

        while (line != null && !line.equals("")) {
            System.out.println(line);
        }
        bufferedInputStream.close();
    }
}
