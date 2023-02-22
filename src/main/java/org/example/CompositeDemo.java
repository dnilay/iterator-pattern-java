package org.example;

public class CompositeDemo {
    public static void main(String args[]) {
        Department salesDepartment = new SalesDepartment(
          1, "Sales department");
        salesDepartment.printDepartmentName();
        Department financialDepartment = new FinancialDepartment(
          2, "Financial department");
        financialDepartment.printDepartmentName();

        HeadDepartment headDepartment = new HeadDepartment(
          3, "Head department");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printDepartmentName();
    }
}