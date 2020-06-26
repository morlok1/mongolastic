package com.kodcu.config.structure;

/**
 * Created by Hakan on 1/16/2016.
 */
public class Elastic {

    private String host;
    private int port;
    private String dateFormat;
    private Boolean longToString = false;
    private Boolean objectIdAsHexString = false;
    private String clusterName; // optional
    private Auth auth; // optional

    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public Boolean getLongToString() {
        return this.longToString;
    }

    public void setObjectIdAsHexString(Boolean objectIdAsHexString) {
        this.objectIdAsHexString = objectIdAsHexString;
    }

    public Boolean getObjectIdAsHexString() {
        return this.objectIdAsHexString;
    }

    public void setLongToString(Boolean longToString) {
        this.longToString = longToString;
    }

    @Override
    public String toString() {
        return "Elastic{" +
                "host='" + host + '\'' +
                ", port=" + port +
                ", clusterName=" + clusterName +
                ", dateFormat=" + dateFormat +
                ", longToString=" + longToString +
                ", auth=" + auth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Elastic elastic = (Elastic) o;

        if (port != elastic.port) return false;
        return host != null ? host.equals(elastic.host) : elastic.host == null;

    }

    @Override
    public int hashCode() {
        int result = host != null ? host.hashCode() : 0;
        result = 31 * result + port;
        return result;
    }
}
