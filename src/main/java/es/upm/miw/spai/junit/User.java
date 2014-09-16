package es.upm.miw.spai.junit;

public class User {
    private int number;

    private String name;

    private String familyName;

    private String format(String string) {
        string = string.trim();
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    public User(int number, String name, String familyName) {
        this.number = number;
        this.name = this.format(name);
        this.familyName = this.format(familyName);
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String fullName() {
        return this.name + " " + this.familyName;
    }

    public String initials() {
        return this.name.substring(0, 1) + ".";
    }
}
