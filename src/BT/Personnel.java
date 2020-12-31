package BT;

import java.util.Date;

public class Personnel {
    private String fullName;
    private Date dateOfBirth;
    private String nativeVillage;

    public Personnel() {
    }

    public Personnel(String fullName,
                     Date dateOfBirth, String nativeVillage) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.nativeVillage = nativeVillage;
    }

    public String getFullName() {
        return fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getNativeVillage() {
        return nativeVillage;
    }
}
