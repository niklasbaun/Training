public class ex2_4 {
    private float snackPrice = 0.72f;
    private float[] output_money = {0.01f, 0.02f, 0.05f, 0.1f, 0.2f, 0.5f, 1, 2};
    /**
     * calculate the change
     * @param amount the amount of money paid
     * @return the change
     */
    public void calc_change(float amount) {
        for (int i = output_money.length - 1; i >= 0; i--) {
            while (amount >= output_money[i]) {
                System.out.println("Returned: " + output_money[i]);
                amount -= output_money[i];
            }
        }
    }

    /**
     * method to buy a snack
     * a snack costs 0.72 €
     * the machine accepts 0.01, 0.02, 0.05, 0.1, 0.2, 0.5, 1, 2, 5 €
     * and prints the change returned
     * @param money the money paid
     */
    public void snack_machine(int money) {

        float change = money - snackPrice;
        if (change < 0) {
            System.out.println("Not enough money");
        } else {
            calc_change(change);
        }
    }

    public static void main(String[] args) {
        ex2_4 ex = new ex2_4();
        ex.snack_machine(1);
    }
}

