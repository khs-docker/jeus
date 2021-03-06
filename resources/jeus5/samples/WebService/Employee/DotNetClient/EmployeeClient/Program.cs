#region Using directives

using System;
using System.Collections.Generic;
using System.Text;

#endregion

namespace EmployeeClient
{
	class Program
	{
		static void Main(string[] args)
		{
			if (args.Length < 1)
			{
				Console.WriteLine("Usage : ");
				Console.WriteLine("       EmployeeClient EmployeeService URL");
				Console.WriteLine("       ex) EmployeeClient http://localhost:8088/Employee/EmployeeService");
				return;
			}

			EmployeeService es = new EmployeeService(args[0]);

			/* remove Employee */
			es.removeEmployee("1234");
			Console.WriteLine("                         Remove Employees complete                        ");

			/* add Employee */
			Employee emp_add = new Employee();
			emp_add.empNo = "1234";
			emp_add.name = "Peter Go";
			emp_add.job = "QA";
			emp_add.manager = "223";
			emp_add.hireDate = "2004-03-02";
			emp_add.salary = "2600";
			emp_add.commission = "500";
			emp_add.deptNo = "30";
			es.addEmployee(emp_add);
			Console.WriteLine("                         Insert Employees complete                        ");

			/* find Employee */
			Employee emp_select = (Employee)es.findEmployee("1234");
            Console.Out.WriteLine("------------------------------------------------------------------------");
            Console.WriteLine("                      Employee         Table                            ");
            Console.WriteLine("------------------------------------------------------------------------");
            Console.WriteLine("    EmpNo    Name    Job    Mgr     Date     Sal    Comm   DeptNo       ");
            Console.WriteLine("------------------------------------------------------------------------");
            Console.WriteLine("   " + emp_select.empNo + " - " + emp_select.name + " - " + emp_select.job + " - " 
							+ emp_select.manager + " - " + emp_select.hireDate + " - " + emp_select.salary + " - " 
							+ emp_select.commission + " - " + emp_select.deptNo);
			
			Console.WriteLine("------------------------------------------------------------------------");
            
			/* modify Employee */
			Employee emp_mod = new Employee();
            emp_mod.name = "Peter Go 2";
            emp_mod.job = "QA 2";
            emp_mod.manager = "223";
            emp_mod.hireDate = "2004-03-02";
            emp_mod.salary = "2600";
            emp_mod.commission = "500";
            emp_mod.deptNo = "30";
            emp_mod.empNo = "1234";
            es.modifyEmployee(emp_mod);
			Console.WriteLine("                         Modify Employees complete                        ");

			/* find Employee */
			Employee emp_select2 = (Employee)es.findEmployee("1234");
			Console.Out.WriteLine("------------------------------------------------------------------------");
			Console.WriteLine("                      Employee         Table                            ");
			Console.WriteLine("------------------------------------------------------------------------");
			Console.WriteLine("    EmpNo    Name    Job    Mgr     Date     Sal    Comm   DeptNo       ");
			Console.WriteLine("------------------------------------------------------------------------");
			Console.WriteLine("   " + emp_select2.empNo + " - " + emp_select2.name + " - " + emp_select2.job + " - "
							+ emp_select2.manager + " - " + emp_select2.hireDate + " - " + emp_select2.salary + " - "
							+ emp_select2.commission + " - " + emp_select2.deptNo);

			Console.WriteLine("------------------------------------------------------------------------");

			/* remove  Employee */
			es.removeEmployee("1234");

			Employee[] emps = null;
			emps = es.findEmployees();
			Console.Out.WriteLine("------------------------------------------------------------------------");
			Console.WriteLine("                      Employee         Table                            ");
			Console.WriteLine("------------------------------------------------------------------------");
			Console.WriteLine("    EmpNo    Name    Job    Mgr     Date     Sal    Comm   DeptNo       ");
			Console.WriteLine("------------------------------------------------------------------------");
            for(int j=0; j<emps.Length; j++)
                Console.WriteLine("   " + emps[j].empNo + " - " + emps[j].name + " - " + emps[j].job + " - " 
							+ emps[j].manager + " - " + emps[j].hireDate + " - " + emps[j].salary + " - " 
							+ emps[j].commission + " - " + emps[j].deptNo);
            Console.WriteLine("------------------------------------------------------------------------");
			Console.WriteLine("                         Find Employees complete                        ");

		}
	}
}
