public class Arena {

    public static String fight(Worm worm1, Worm worm2) {

        while (worm1.isAlive() && worm2.isAlive()) {

            if (worm1.getLife() <= worm2.getLife()) {
                doTurn(worm1, worm2);
            } else {
                doTurn(worm2, worm1);
            }
        }

        return worm1.getLife() >= worm2.getLife()
                ? worm1.getName()
                : worm2.getName();
    }
    private static void doTurn(Worm first, Worm second) {
        first.dealDamage(second);
        second.dealDamage(first);
    }
}
