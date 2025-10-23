# Write your MySQL query statement below
Select Employee.name , Bonus.bonus 
FROM
Employee LEFT JOIN Bonus
ON
Employee.empId = Bonus.empId
WHERE
Bonus.bonus <1000 OR Bonus.bonus is null;
#see clearly that i use (is) with null
#and see result table that it has null also so include it also in where clause condition