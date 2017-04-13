package com.example.mayakovstanislav.criminalintent;

import java.util.UUID;

/**
 * Created by Mayakov Stanislav on 10.04.2017.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime() {
        mId = UUID.randomUUID();
    }

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmId(UUID mId) {
        this.mId = mId;
    }

    public void setmTitle(String title) {
        mTitle = title;
    }
}
