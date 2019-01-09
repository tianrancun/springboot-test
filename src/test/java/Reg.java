import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {
    public static void main(String[] args) {

    }

    @Test
    public void test1() {
      //  String tireSize="P245/70R17 10";
      //  String tireSize="31X10.50R15C";
        String tireSize="31X10.00R22.5";
      //  String tireSizeId = tireSize.substring(0, tireSize.indexOf(" "));
        //	String tireSizeId="P205/65R16 94T EL42";
      //  	String tireSizeId="215/60R16";
        //   String regx = "(\\d*)(/)(\\d*)(\\D)";
        System.out.println("insert tiresize info to cosmosdb");
     //   String pattern = "(\\d*)(/)(\\d*)(\\D*)(\\d*)";
        String pattern = "(\\d*)(/|X)(\\d*.\\d*)(\\D*)(\\d*.\\d*)";
        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(tireSize);

        if (m.find( )) {
            System.out.println("Found value0: " + m.group(0) );
            System.out.println("Found value1: " + m.group(1) );
            System.out.println("Found value2: " + m.group(2) );
            System.out.println("Found value3: " + m.group(3));
            System.out.println("Found value4: " + m.group(4));
            System.out.println("Found value5: " + m.group(5));
        } else {
            System.out.println("NO MATCH");
        }
    }

    @Test
    public void test2() {
        String param1 ="215/55R17 94V TA31 ";
        String regx = "(\\d*)(/)(\\d*)(\\D*)(\\d*)";
        String[] arr = param1.split(regx);
        System.out.print(arr.length+"==========");
        for (int i = 0; i <arr.length ; i++) {
            System.out.printf("arr:" +arr[i]);
        }
    }

    @Test
    public void test3() {
        String tireSizeId = "215/60R16";
        String pattern = "(\\d*)(/)(\\d*)(\\D*)(\\d*)";
        Pattern r = Pattern.compile(pattern);
        // 现在创建 matcher 对象
        Matcher m = r.matcher(tireSizeId);
        
        if (m.find( )) {
            System.out.println("Found value0: " + m.group(0) );
            System.out.println("Found value1: " + m.group(1) );
            System.out.println("Found value2: " + m.group(2) );
            System.out.println("Found value3: " + m.group(3));
            System.out.println("Found value4: " + m.group(4));
            System.out.println("Found value5: " + m.group(5));
        } else {
            System.out.println("NO MATCH");
        }
    }

    @Test
    public void test4() {
        String tireSizeId="215/60R16";
        String pattern = "(\\d*)(/)(\\d*)(\\D*)(\\d*)";
        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);
        // 现在创建 matcher 对象
        Matcher m = r.matcher(tireSizeId);

        if (m.find( )) {
            System.out.println("Found value0: " + m.group(0) );
            System.out.println("Found value1: " + m.group(1) );
            System.out.println("Found value2: " + m.group(2) );
            System.out.println("Found value3: " + m.group(3));
            System.out.println("Found value4: " + m.group(4));
            System.out.println("Found value5: " + m.group(5));
        } else {
            System.out.println("NO MATCH");
        }
    }

    @Test
    public void test5() {



    }
}
