package employee

import grails.web.servlet.mvc.GrailsParameterMap
import io.micronaut.http.annotation.Post

class AddEmployeeController {
    static defaultAction = "employeeInfoAdd"
    List<Employee> empList = Employee.list()
    def employeeInfoAdd() {
        render(view: 'employeeInfoAdd',model: [empList: empList])
    }
    def addEmployee(){

    }
    def save(){
        def code= params.code
        def nameE=params.nameE
        def age=params.age
        def job=params.job
        Employee e=new Employee(code,nameE,age,job)
        e.save()
        empList.add(e)
        render(view: 'employeeInfoAdd',model: [empList: empList])
    }
}
