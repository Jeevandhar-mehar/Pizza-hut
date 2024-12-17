
import java.util.Scanner;

public class Billgan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pt, pr = 0, chc, chr = 0, coc, cor = 0, copc, capr = 0, payc, to, dis, nt, pn;
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!PIZZA HUT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.print("Enter Customer Name :");
        String nm = sc.nextLine();
        System.out.print("Enter Customer Address :");
        String add = sc.nextLine();
        System.out.println("Enter the number of Pizza type. 1. Regular  2. Pan");
        pt = sc.nextInt();
        if (pt == 1) {
            pr = 12;
        } else {
            pr = 15;
        }
        System.out.println("Select your Popping ");
        System.out.println("Do you want cheess Pizza? 1.Yes 2.NO");
        chc = sc.nextInt();
        if (chc == 1) {
            chr = 25;
        } else {
            chr = 0;
        }
        System.out.println("Do you want corn pizza? 1.Yes 2.No");
        coc = sc.nextInt();
        if (coc == 1) {
            cor = 135;
        } else {
            cor = 0;
        }
        System.out.println("Do you want copcicurm Pizza? 1.Yes 2.No");
        copc = sc.nextInt();
        if (copc == 1) {
            capr = 130;
        } else {
            capr = 0;
        }
        System.out.println("How many Pizza you want ");
        pn = sc.nextInt();
        to = pr + chr + cor + capr;
        to = to * pn;
        System.out.println("Total Amount :-" + to);
        System.out.println("Select your payment method : 1.CASH  2.DEBIT/CREDIT CARD 3.UPI");
        payc = sc.nextInt();
        if (payc == 1) {
            dis = 0;
        } else if (payc == 2) {
            dis = to * 8 / 100;
        } else if (payc == 3) {
            dis = to * 4 / 100;
        } else {
            dis = 0;
            System.out.println("Invalid Payment Method");
        }
        System.out.println("Discount Amount : " + dis);
        nt = to - dis;
        System.out.println("Total Amount after Discount : " + nt);

    }
}
