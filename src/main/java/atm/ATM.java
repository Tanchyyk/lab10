package atm;

import lombok.Getter;

@Getter
public class ATM {
    private Tray firstTray;
    public ATM() {
        Tray tray5 = new Tray5();
        Tray try10 = new Tray10();
        Tray try20 = new Tray20();

        try20.setNext(try10);
        try10.setNext(tray5);
        firstTray = try20;
    }

    public void process(int amount) {
        firstTray.process(amount);
    }
}
