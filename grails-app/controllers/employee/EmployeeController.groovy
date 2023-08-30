package employee

class EmployeeController {

    def employeeInfo() {
        List<Employee> empList = Employee.list()

        render(view: 'employeeInfo',model: [empList: empList])
    }
}
