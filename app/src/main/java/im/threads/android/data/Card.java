package im.threads.android.data;

import android.support.v4.util.ObjectsCompat;

import java.io.Serializable;

public class Card implements Serializable {
    private String userId;
    private String userName;
    private String appMarker;
    private String clientIdSignature;

    public Card(final String userId, final String userName, String appMarker, String clientIdSignature) {
        this.userId = userId;
        this.userName = userName;
        this.appMarker = appMarker;
        this.clientIdSignature = clientIdSignature;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getAppMarker() {
        return appMarker;
    }

    public String getClientIdSignature() {
        return clientIdSignature;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Card card = (Card) o;

        return ObjectsCompat.equals(userId, card.userId);

    }

    @Override
    public int hashCode() {
        return userId != null ? userId.hashCode() : 0;
    }
}
