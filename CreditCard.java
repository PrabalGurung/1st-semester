public class CreditCard extends BankCard {
    private int CVC;
    private int creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;

    public CreditCard(int cardId, String clientName, String issuerBank, int bankAccount, double balanceAmount, int CVC, double interestRate, String expirationDate) {
        super(cardId, clientName, issuerBank, bankAccount, balanceAmount);
        this.CVC = CVC;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }

    public void setCreditLimit(double newCreditLimit, int newGracePeriod) {
        if (newCreditLimit <= (2.5 * super.getBalanceAmount())) {
            creditLimit = newCreditLimit;
            gracePeriod = newGracePeriod;
            isGranted = true;
        } else {
            System.out.println("Credit cannot be issued. Limit should be less than or equal to 2.5 times the balance amount.");
        }
    }

    public void cancelCreditCard() {
        if (isGranted && super.getBalanceAmount() == 0) {
            CVC = 0;
            creditLimit = 0;
            gracePeriod = 0;
            isGranted = false;
        } else {
            System.out.println("Cannot cancel credit card. Interest rates and credits have not been paid in full.");
        }
    }

    public void display() {
        if (isGranted) {
            super.display();
            System.out.println("CVC: " + CVC);
            System.out.println("Credit Limit: " + creditLimit);
            System.out.println("Interest Rate: " + interestRate);
            System.out.println("Expiration Date: " + expirationDate);
            System.out.println("Grace Period: " + gracePeriod);
        } else {
            System.out.println("Credit Limit and Grace Period cannot be displayed. Credit has not been granted.");
        }
    }

    public int getCVC() {
        return CVC;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public int getGracePeriod() {
        return gracePeriod;
    }

    public boolean getIsGranted() {
        return isGranted;
    }
}