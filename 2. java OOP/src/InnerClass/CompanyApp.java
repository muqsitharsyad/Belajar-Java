package InnerClass;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("UT");

        Company.Employee employee = company.new Employee();
        employee.setName("KinMin");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
