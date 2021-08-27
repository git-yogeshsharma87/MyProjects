package com.lockedme.models;

public class UserAccounts {
   private String siteName;
    private String username;
   private  String password;
   private String loggedInUser;

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoggedInUser() {
        return loggedInUser;
    }

    public void setLoggedInUser(String loggedInUser) {
        this.loggedInUser = loggedInUser;
    }

    public UserAccounts(String siteName, String username, String password, String loggedInUser) {
        this.siteName = siteName;
        this.username = username;
        this.password = password;
        this.loggedInUser = loggedInUser;
    }

    public UserAccounts() {
    }

    @Override
    public String toString() {
        return "UserAccounts{" +
                "siteName='" + siteName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
