import java.io.*;
import java.util.Scanner;
import java.util.regex.*;

class TextExample{
    public static void main(String[] args)throws FileNotFoundException{
        String event = "";
        int time;
        // String regex = "(\\w+)=(\\w+)";
        String regex = "(Event=)(\\w+),(time=)(\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;

        Scanner scanner = new Scanner(new File("examples1.txt"));//open the the file as a stream
        while(scanner.hasNextLine()) {
            String readLine = scanner.nextLine();
            matcher = pattern.matcher(readLine);
            while (matcher.find()){
                event = matcher.group(2);
                time = Integer.parseInt(matcher.group(4));
                System.out.println(event);
                System.out.println(time);
            }
        }
    }
}
