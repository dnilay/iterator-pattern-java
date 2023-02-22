package org.example;

public class SalesDepartment implements Department {

    private Integer id;
    private String name;

    public SalesDepartment(int i, String sales_department) {
    }

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

    // standard constructor, getters, setters
}