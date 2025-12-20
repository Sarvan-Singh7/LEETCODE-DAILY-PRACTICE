# Write your MySQL query statement below
-- select MAX(salary) as SecondHighestSalary from Employee where salary <(select Max(salary) from Employee);
select ( select DISTINCT salary from Employee order by salary DESC LIMIT 1 OFFSET 1)as SecondHighestSalary; -- //not work if only one second highest