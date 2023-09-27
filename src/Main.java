import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



        double ratio = 0.125*epsGrowth(0) + 0.125*ROIC(0) + 0.125*ROE(0) +
                0.125*CashFlowtoAssets(0) + 0.125*ROA(0) + 0.125*GrossProfittoAssets(0) +
                0.125*AssetTurnover(0) + GrossMargin(0);
        System.out.println("The Score is " + ratio);



    }
    public static double epsGrowth (double eps) {
        System.out.println("Enter EPS Growth");
        Scanner scanner = new Scanner(System.in);
        eps = Double.parseDouble(scanner.nextLine());
        return eps;
    }
    public static double ROIC (double roic) {
        System.out.println("Enter ROIC");
        Scanner scanner = new Scanner(System.in);
        roic = Double.parseDouble(scanner.nextLine());
        return roic;
    }
    public static double ROE (double roe) {
        System.out.println("Enter ROE");
        Scanner scanner = new Scanner(System.in);
        roe = Double.parseDouble(scanner.nextLine());
        return roe;
    }
    public static double CashFlowtoAssets (double cfa) {
        System.out.println("Cash Flow to Assets");
        Scanner scanner = new Scanner(System.in);
        cfa = Double.parseDouble(scanner.nextLine());
        return cfa;
    }
    public static double ROA (double roa) {
        System.out.println("Enter ROA");
        Scanner scanner = new Scanner(System.in);
        roa = Double.parseDouble(scanner.nextLine());
        return roa;
    }
    public static double GrossProfittoAssets (double gpa) {
        System.out.println("Enter Gross Profit to Assets");
        Scanner scanner = new Scanner(System.in);
        gpa = Double.parseDouble(scanner.nextLine());
        return gpa;
    }
    public static double AssetTurnover (double at) {
        System.out.println("Enter Asset Turnover");
        Scanner scanner = new Scanner(System.in);
        at = Double.parseDouble(scanner.nextLine());
        return at;
    }
    public static double GrossMargin (double gm) {
        System.out.println("Enter Gross Margin");
        Scanner scanner = new Scanner(System.in);
        gm = Double.parseDouble(scanner.nextLine());
        return gm;
    }

}