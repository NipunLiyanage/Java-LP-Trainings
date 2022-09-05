package Equal;

public class employee {

    private String empId;
    private String empCode;
    private String Name;
    private String Nic;
    private String address;

    public employee(String empId, String empCode, String name, String nic, String address) {
        this.empId = empId;
        this.empCode = empCode;
        this.Name = name;
        this.Nic = nic;
        this.address = address;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpCode() {
        return empCode;
    }

    public String getName() {
        return Name;
    }

    public String getNic() {
        return Nic;
    }

    public String getAddress() {
        return address;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setNic(String nic) {
        Nic = nic;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public boolean equals(Object object) {
        employee emp = (employee) object;

        if(emp.getEmpId() == this.empId && emp.getEmpCode() == this.empCode){

            return true;

        }

        else{
            return false;
        }

    }

    @java.lang.Override
    public java.lang.String toString() {
        return "employee{" +
                "empId='" + empId + '\'' +
                ", empCode='" + empCode + '\'' +
                ", Name='" + Name + '\'' +
                ", Nic='" + Nic + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
