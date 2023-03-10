//import javax.naming.ldap.ManageReferralControl;

public class AlternatePrime {

    static boolean checkPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    static void altPrime(int n) {
        int temp = 0;
        for (int i = 2; i < n; i++) {
            if (checkPrime(i)) {
                if (temp % 2 == 0) {
                    System.out.print(i + " ");

                }
                temp++;
            }
        }
    }

    public static void main(String[] args) {
        int n = 40;
        altPrime(n);
    }
}
