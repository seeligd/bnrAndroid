package net.dseelig.criminalintent;

import java.util.UUID;

public class Crime {
    public UUID getId() {
        return mId;
    }

    private UUID mId;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    private String mTitle;

}
