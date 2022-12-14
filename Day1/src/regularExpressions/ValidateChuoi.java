package regularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateChuoi {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // validate1();
        // validate2();
        // validate3();
        // validate4();
        // validate5();
        // validate6();
        // validate7();
        //validate8();
        validate9();
    }

    // cho người dùng nhập vào 1 số
    public static void validate1() {
        while (true) {
            System.out.println("Nhập vào 1 số");
            String txt = sc.nextLine();
            System.out.println("Số đã nhập: " + txt);
            Pattern p = Pattern.compile("^[0-9]$");
            if (p.matcher(txt).find()) {
                System.out.println("Nhập đúng định dạng");
                break;
            } else {
                System.out.println("Nhập sai định đạng");
            }
        }
    }

    // nhập vào nhiều số
    public static void validate2() {
        while (true) {
            System.out.println("Nhập vào nhiều số");
            String txt = sc.nextLine();
            System.out.println("Số đã nhập: " + txt);
            Pattern p = Pattern.compile("^[0-9]+$");
            if (p.matcher(txt).find()) {
                System.out.println("Nhập đúng định dạng");
                break;
            } else {
                System.out.println("Nhập sai định đạng");
            }
        }
    }

    // nhập số có 6 chữ số
    public static void validate3() {
        while (true) {
            System.out.println("Nhập vào số có 6 chữ số");
            String txt = sc.nextLine();
            System.out.println("Số đã nhập: " + txt);
            Pattern p = Pattern.compile("^[0-9]{6}$");
            if (p.matcher(txt).find()) {
                System.out.println("Nhập đúng định dạng");
                break;
            } else {
                System.out.println("Nhập sai định đạng");
            }
        }
    }

    //nhập vào số > 6 ký tự
    public static void validate4() {
        while (true) {
            System.out.println("Nhập vào số có 6 chữ số");
            String txt = sc.nextLine();
            System.out.println("Số đã nhập: " + txt);
            Pattern p = Pattern.compile("^[0-9]{6,}$");
            if (p.matcher(txt).find()) {
                System.out.println("Nhập đúng định dạng");
                break;
            } else {
                System.out.println("Nhập sai định đạng");
            }
        }
    }

    //nhập vào số [6, 10] ký tự
    public static void validate5() {
        while (true) {
            System.out.println("Nhập vào số có 6 chữ số");
            String txt = sc.nextLine();
            System.out.println("Số đã nhập: " + txt);
            Pattern p = Pattern.compile("^[0-9]{6,10}$");
            if (p.matcher(txt).find()) {
                System.out.println("Nhập đúng định dạng");
                break;
            } else {
                System.out.println("Nhập sai định đạng");
            }
        }
    }

    //nhập từ 6 đến 10 ký tự
    public static void validate6() {
        while (true) {
            System.out.println("Nhập vào số có 6 chữ số");
            String txt = sc.nextLine();
            System.out.println("Số đã nhập: " + txt);
            Pattern p = Pattern.compile("^[a-zA-Z]{6,10}$");
            if (p.matcher(txt).find()) {
                System.out.println("Nhập đúng định dạng");
                break;
            } else {
                System.out.println("Nhập sai định đạng");
            }
        }
    }

    //nhập cả ký tự, số, dấu cách
    public static void validate7() {
        while (true) {
            System.out.println("Nhập vào số có 6 chữ số");
            String txt = sc.nextLine();
            System.out.println("Số đã nhập: " + txt);
            Pattern p = Pattern.compile("^[a-zA-Z0-9 ]$");
            if (p.matcher(txt).find()) {
                System.out.println("Nhập đúng định dạng");
                break;
            } else {
                System.out.println("Nhập sai định đạng");
            }
        }
    }

    // validate email
    public static void validate8() {
        while (true) {
            System.out.println("Nhập email");
            String txt = sc.nextLine();
            System.out.println("Số đã nhập: " + txt);
            Pattern p = Pattern.compile("^(.+)@(\\S+)$");
            if (p.matcher(txt).find()) {
                System.out.println("Nhập đúng định dạng");
                break;
            } else {
                System.out.println("Nhập sai định đạng");
            }
        }
    }

    //check đầu số 036
    public static void validate9() {
        while (true) {
            System.out.println("Nhập sdt:");
            String txt = sc.nextLine();
            System.out.println("Số đã nhập: " + txt);
            String str = "036";
            Pattern p = Pattern.compile("^[0-9]{9,10}$");
            Pattern p1 = Pattern.compile(str);
            Matcher matcher1 = p1.matcher(txt);
            if (p.matcher(txt).find() && matcher1.find()) {
                System.out.println("Nhập đúng định dạng");
                break;
            } else {
                System.out.println("Nhập sai định đạng");
            }
        }
    }


}
