package generic;

public class comparable implements Comparable<comparable> {
    private String name;
    private String address;

    public comparable(java.lang.String name, java.lang.String address) {
        this.name = name;
        this.address = address;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getAddress() {
        return address;
    }

    public void setAddress(java.lang.String address) {
        this.address = address;
    }

    @java.lang.Override
    public int compareTo(comparable o) {
        return this.compareTo(o.name);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "comparable{" +
                "name=" + name +
                ", address=" + address +
                '}';
    }
}
