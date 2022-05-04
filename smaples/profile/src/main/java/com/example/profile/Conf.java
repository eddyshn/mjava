package com.example.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Conf {
    @Value("${ftpurl}")
    private String FTPUrl;

    @Value("${dburl}")
    private String DBPUrl;

    @Override
    public String toString() {
        return "Conf{" +
                "FTPUrl='" + FTPUrl + '\'' +
                ", DBPUrl='" + DBPUrl + '\'' +
                '}';
    }

    public String getFTPUrl() {
        return FTPUrl;
    }

    public void setFTPUrl(String FTPUrl) {
        this.FTPUrl = FTPUrl;
    }

    public String getDBPUrl() {
        return DBPUrl;
    }

    public void setDBPUrl(String DBPUrl) {
        this.DBPUrl = DBPUrl;
    }


}
