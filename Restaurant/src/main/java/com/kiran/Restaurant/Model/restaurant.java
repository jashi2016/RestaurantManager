package com.kiran.Restaurant.Model;

public class restaurant {
    String name;
    String address;
    int phoneNumber;
    String speciality;
    int totalStaffs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getTotalStaffs() {
        return totalStaffs;
    }

    public void setTotalStaffs(int totalStaffs) {
        this.totalStaffs = totalStaffs;
    }

    public restaurant() {
    }

    public restaurant(String name, String address, int phoneNumber, String speciality, int totalStaffs) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.speciality = speciality;
        this.totalStaffs = totalStaffs;
    }
}
