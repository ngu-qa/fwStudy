package GuiTest.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {
    public static void main(String[] args) {
        if (args.length < 2){
            System.out.println("Error  111111111");
        }
        System.out.println("Input: \"" + args[0] + "\"");
        for (String arg: args){
            System.out.println("Regular Expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            while (m.find()){
                System.out.println("Macth \"" + m.group() + "\" at positions " + m.start() + "-" +(m.end()-1));
            }
        }
    }
}
