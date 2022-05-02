SELECT e.employee_id,
       e.first_name,
       e.last_name,
       d.department_name,
       e.salary AS old_salary,
       e.salary * d.inc AS new_salary
  FROM employees   e,
       (SELECT department_name, department_id, 1+pctIncrease(department_id) AS inc FROM departments) d
 WHERE e.department_id = d.department_id
 ORDER BY 1;
