# Write your MySQL query statement below
select Project.project_id ,ROUND(avg(Employee.experience_years),2) as average_years #check that how round works
FROM
Project left join Employee
ON Project.employee_id = Employee.employee_id
group by Project.project_id;
