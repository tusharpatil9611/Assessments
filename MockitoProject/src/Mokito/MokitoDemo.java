package Mokito;

import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class MokitoDemo 
{
	EmployeeService employeeService;
    @Before
    public void setUp() 
    {
        employeeService = Mockito.mock(EmployeeService.class);
        EmployeeService employeeManager = new EmployeeService();
        employeeManager.setEmployeeService(employeeService);
    }
    

}
