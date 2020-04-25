package me.networking;


import me.model.Angajat;

public class LogoutRequest implements Request {
    private Angajat user;

    public LogoutRequest(Angajat user) {
        this.user = user;
    }

    public Angajat getUser() {
        return user;
    }
}
