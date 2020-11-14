package pl.k.kamil.java.logic;

public class IsNumber {

    public static boolean isNumeric(String s) {
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");
    }
}
