package Enum;

public enum Size {
    SMALL("mały"), MEDIUM("średni"), LARGE("duży");

    private String descripion; // przechowuje opisową nazwę danego typu
    Size(String desc){descripion=desc;}

    public String getDescripion() {
        return descripion;
    }
}
