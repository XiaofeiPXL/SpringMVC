package com.itheima.entity;

/**
 * @program: SpringMVC
 * @description: 用户对象中的地址属性对象
 * @author: Xiaofei Wang
 * @created: 2020/10/10 15:19
 */


public class Address {
    private String province;
    private String city;
    private String country;

    public Address() {
    }

    public Address(String province, String city, String country) {
        this.province = province;
        this.city = city;
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
