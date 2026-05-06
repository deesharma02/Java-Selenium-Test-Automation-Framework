package pojo;

public class Address {
    private final String company_name;
    private final String address1;
    private final String address2;
    private final String city;
    private final String zipcode;
    private final String homePhone;
    private final String mobPhone;
    private final String additionalInfo;
    private final String aliasAddress;

    public Address(String company_name, String address1, String address2, String city, String zipcode, String homePhone, String mobPhone, String additionalInfo, String aliasAddress) {
        this.company_name = company_name;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.zipcode = zipcode;
        this.homePhone = homePhone;
        this.mobPhone = mobPhone;
        this.additionalInfo = additionalInfo;
        this.aliasAddress = aliasAddress;
    }

    public String getCompany_name() {
        return company_name;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getMobPhone() {
        return mobPhone;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public String getAliasAddress() {
        return aliasAddress;
    }
}
