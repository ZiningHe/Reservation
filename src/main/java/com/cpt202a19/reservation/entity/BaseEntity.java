package com.cpt202a19.reservation.entity;
<<<<<<< HEAD

=======
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
import java.io.Serializable;
import java.util.Date;

/** Entity base class */
public class BaseEntity implements Serializable {
<<<<<<< HEAD

=======
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    private String createdUser;
    private Date createdTime;
    private String modifiedUser;
    private Date modifiedTime;

<<<<<<< HEAD
    public String getCreatedUser() { return createdUser; }

    public void setCreatedUser(String createdUser) { this.createdUser = createdUser; }

    public Date getCreatedTime() { return createdTime; }

    public void setCreatedTime(Date createdTime) { this.createdTime = createdTime; }

    public String getModifiedUser() { return modifiedUser; }

    public void setModifiedUser(String modifiedUser) { this.modifiedUser = modifiedUser; }

    public Date getModifiedTime() { return modifiedTime; }

    public void setModifiedTime(Date modifiedTime) { this.modifiedTime = modifiedTime; }
=======
    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseEntity)) return false;

        BaseEntity that = (BaseEntity) o;

        if (getCreatedUser() != null ? !getCreatedUser().equals(that.getCreatedUser()) : that.getCreatedUser() != null)
            return false;
        if (getCreatedTime() != null ? !getCreatedTime().equals(that.getCreatedTime()) : that.getCreatedTime() != null)
            return false;
        if (getModifiedUser() != null ? !getModifiedUser().equals(that.getModifiedUser()) : that.getModifiedUser() != null)
            return false;
<<<<<<< HEAD
        
=======
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
        return getModifiedTime() != null ? getModifiedTime().equals(that.getModifiedTime()) : that.getModifiedTime() == null;
    }

    @Override
    public int hashCode() {
        int result = getCreatedUser() != null ? getCreatedUser().hashCode() : 0;
        result = 31 * result + (getCreatedTime() != null ? getCreatedTime().hashCode() : 0);
        result = 31 * result + (getModifiedUser() != null ? getModifiedUser().hashCode() : 0);
        result = 31 * result + (getModifiedTime() != null ? getModifiedTime().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "createdUser='" + createdUser + '\'' +
                ", createdTime=" + createdTime +
                ", modifiedUser='" + modifiedUser + '\'' +
                ", modifiedTime=" + modifiedTime +
                '}';
    }
<<<<<<< HEAD

=======
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
}