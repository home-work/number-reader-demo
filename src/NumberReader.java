import java.util.Scanner;

public class NumberReader {
    public static void main(String[] args) {
        final String ZERO = "KHÔNG";
        final String ONE = "MỘT";
        final String TWO = "HAI";
        final String THREE = "BA";
        final String FOUR = "BỐN";
        final String FIVE = "NĂM";
        final String SIX = "SÁU";
        final String SEVEN = "BẢY";
        final String EIGHT = "TÁM";
        final String NINE = "CHÍN";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số: ");
        int number = scanner.nextInt();
        if (number < 0) {
            return;
        }
        else if (number < 12) {
            switch (number) {
                case 0:
                    System.out.println(ZERO);
                    break;
                case 1:
                    System.out.println(ONE);
                    break;
                case 2:
                    System.out.println(TWO);
                    break;
                case 3:
                    System.out.println(THREE);
                    break;
                case 4:
                    System.out.println(FOUR);
                    break;
                case 5:
                    System.out.println(FIVE);
                    break;
                case 6:
                    System.out.println(SIX);
                    break;
                case 7:
                    System.out.println(SEVEN);
                    break;
                case 8:
                    System.out.println(EIGHT);
                    break;
                case 9:
                    System.out.println(NINE);
                    break;
                case 10:
                    System.out.println("MƯỜI");
                    break;
                default:
                    System.out.println("MƯỜI MỘT");
            }
        }
        else if (number < 100) {
            int result = number / 10;
            int remainer = number % 10;
            String name1;
            String name2;
            switch (result) {
                case 1:
                    name1 = "MƯỜI";
                    break;
                case 2:
                    name1= TWO;
                    break;
                case 3:
                    name1= THREE;
                    break;
                case 4:
                    name1= FOUR;
                    break;
                case 5:
                    name1= FIVE;
                    break;
                case 6:
                    name1= SIX;
                    break;
                case 7:
                    name1=SEVEN;
                    break;
                case 8:
                    name1= EIGHT;
                    break;
                default:
                    name1 = NINE;
            }
            switch (remainer) {
                case 0:
                    name2="MƯƠI";
                    break;
                case 1:
                    name2 = "MỐT";
                    break;
                case 2:
                    name2= TWO;
                    break;
                case 3:
                    name2= THREE;
                    break;
                case 4:
                    name2= FOUR;
                    break;
                case 5:
                    name2= FIVE;
                    break;
                case 6:
                    name2= SIX;
                    break;
                case 7:
                    name2=SEVEN;
                    break;
                case 8:
                    name2= EIGHT;
                    break;
                default:
                    name2 = NINE;
            }
            System.out.println(name1 + " " + name2);
        } else if (number < 1000) {
            int chuSoHangTram = number / 100;
            int remainer = number % 100;
            int chuSoHangChuc = remainer / 10;
            int chuSoHangDonVi = remainer % 10;
            String name1;
            String name2;
            String name3;
            switch (chuSoHangTram) {
                case 1:
                    name1="MỘT TRĂM ";
                    break;
                case 2:
                    name1="HAI TRĂM ";
                    break;
                case 3:
                    name1="BA TRĂM ";
                    break;
                case 4:
                    name1="BỐN TRĂM ";
                    break;
                case 5:
                    name1="NĂM TRĂM ";
                    break;
                case 6:
                    name1="SÁU TRĂM ";
                    break;
                case 7:
                    name1="BẢY TRĂM ";
                    break;
                case 8:
                    name1="TÁM TRĂM ";
                    break;
                default:
                    name1="CHÍN TRĂM ";
            }
            switch (chuSoHangChuc) {
                case 0:
                    if (chuSoHangDonVi == 0) {
                        name2 = "";
                    } else {
                        name2 = "LINH ";
                    }
                    break;
                case 1:
                    name2="MƯỜI ";
                    break;
                case 2:
                    name2="HAI ";
                    break;
                case 3:
                    name2="BA ";
                    break;
                case 4:
                    name2="BỐN ";
                    break;
                case 5:
                    name2="NĂM ";
                    break;
                case 6:
                    name2="SÁU ";
                    break;
                case 7:
                    name2="BẢY ";
                    break;
                case 8:
                    name2="TÁM ";
                    break;
                default:
                    name2="CHÍN ";
            }
            switch (chuSoHangDonVi) {
                case 0:
                    if (chuSoHangChuc == 0) {
                        name3 = "";
                    } else {
                        name3=" MƯƠI";
                    }
                    break;
                case 1:
                    name3 = ONE;
                    break;
                case 2:
                    name3= TWO;
                    break;
                case 3:
                    name3= THREE;
                    break;
                case 4:
                    name3= FOUR;
                    break;
                case 5:
                    name3= FIVE;
                    break;
                case 6:
                    name3= SIX;
                    break;
                case 7:
                    name3=SEVEN;
                    break;
                case 8:
                    name3= EIGHT;
                    break;
                default:
                    name3 = NINE;
            }
            System.out.println(name1 + name2 + name3);
        }
        else System.out.println("Nhập số trong khoảng 0 - 999");
    }
}
