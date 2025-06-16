package com.adu.service;

import java.time.LocalDate;

import com.adu.child.Engineer;
import com.adu.child.Intern;
import com.adu.child.Manager;
import com.adu.parent.Employee;
import com.adu.util.MyDate;

public class EmployeeService {
	
    private Employee[] employees = new Employee[100];
    private int index = 0;

	private static EmployeeService service = new EmployeeService();

	private EmployeeService() {
	}
	
	public static EmployeeService getEmployee() {
		return service;
	}
	
	public void addEmployee(Employee newEm) {
		if(index < employees.length) {
			employees[index++] = newEm;
		}else {
			System.out.println("더이상 추가할수 없습니다.");
		}
	}
	
	public void deleteEmployee(int empno) {
		for(int i = 0; index > i ; i++) {
			if(employees[i] != null && employees[i].getEmpno() == empno) {
				for(int j = i; index > j; j++) {
					employees[j] = employees[j + 1];
				}
				employees[index - 1] = null;
				index--;
				System.out.println(empno + " 삭제 완료");
				return;
			}
		}
		System.out.println("삭제할 사원이 없습니다.");
	}
	
	public void changeEmployee(int empno, String newName) {
	    Employee e = findEmployee(empno);
	    if (e != null) {
	        e.setName(newName);
	        System.out.println(empno + "번 사원의 이름을 " + newName + "으로 변경했습니다.");
	    } else {
	        System.out.println("해당 사번의 사원을 찾을 수 없습니다.");
	    }
	}
	
    public Employee findEmployee(int empno) {
        for (Employee e : employees) {
            if (e != null && e.getEmpno() == empno) {
                return e;
            }
        }
        return null;
    }
	
	public void raiseEmployee() {
        for(Employee e : employees) {
            if(e != null) {
            	raiseEmployee(e);
            }
        }
	}
	
	private void raiseEmployee(Employee em) {
		LocalDate now = LocalDate.now();
		int years = now.getYear() - em.gethireDate().getYear();
		
	    if (em instanceof Engineer) {
	    	em.setSalary(em.getSalary() + years * 10);
	    } else if (em instanceof Manager) {
	    	em.setSalary(em.getSalary() + years * 5);
	    } else if (em instanceof Intern) {
	    	System.out.println("인턴은 인상되지 않았습니다.");
	    } 
	}
	
	public void printEmployee() {
		for(Employee e : employees) {
			if(e == null) {
				return;
			}
			System.out.println(e);
		}
	}
	


}
