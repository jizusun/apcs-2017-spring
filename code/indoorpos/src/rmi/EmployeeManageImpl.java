package org.hqu.indoor_pos.rmi;

import java.rmi.RemoteException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hqu.indoor_pos.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;

/**
 * created on 2016年8月26日
 *
 * 员工管理服务接口实现类
 *
 * @author  megagao
 * @version  0.0.1
 */
public class EmployeeManageImpl implements EmployeeManage{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public EmployeeManageImpl() throws RemoteException {
		super();
	}

	@Override
	public List<Employee> findAllEmp() {
		
		return this.jdbcTemplate.query("select * from employee",   
                new RowMapper<Employee>(){  
              
                    @Override  
                    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {  
                    	Employee employee = new Employee(rs.getString(1),
                    			rs.getString(2),rs.getString(3),rs.getString(4));
                        return employee;  
                    }  
        });  
	}

	@Override
	public boolean saveEmployee(Employee employee) {
		
		try {
			this.jdbcTemplate.update("insert into employee values(?, ?, ?, ?)",   
	                new Object[]{employee.getEmpId(), employee.getName(),
						employee.getSex(), employee.getTerminalId()}); 
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean updateEmployee(final Employee employee) {
		
		try {
			this.jdbcTemplate.update(  
					"update employee set name = ?, sex = ?, terminal_id = ? where emp_id = ?",   
	                new PreparedStatementSetter(){  
	                    @Override  
	                    public void setValues(PreparedStatement ps) throws SQLException {  
	                        ps.setString(1, employee.getName());
	                        ps.setString(2, employee.getSex());
	                        ps.setString(3, employee.getTerminalId());
	                        ps.setString(4, employee.getEmpId());
	                    }  
	                }  
	        );  
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteEmployee(final String empId) {
		
		try {
			this.jdbcTemplate.update(  
					"delete from employee  where emp_id = ?",   
	                new PreparedStatementSetter(){  
	                    @Override  
	                    public void setValues(PreparedStatement ps) throws SQLException {  
	                        ps.setString(1, empId);  
	                    }  
	                }  
	        );  
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public Employee getEmployeeById(String empId) {
		
		return (Employee) this.jdbcTemplate.queryForObject(  
                "select * from employee where emp_id = ?",   
                new Object[]{empId},  
                new RowMapper<Employee>(){  
  
                    @Override  
                    public Employee mapRow(ResultSet rs,int rowNum)throws SQLException {  
                    	Employee employee = new Employee(rs.getString(1),rs.getString(2),
                    			rs.getString(3),rs.getString(4)); 
                        return employee;  
                    }  
        }); 
	}

}
