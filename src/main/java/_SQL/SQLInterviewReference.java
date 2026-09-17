package _SQL;

/**
 * SQL Interview Reference
 *
 * All SQL study notes are kept inside ONE multi-line comment.
 */
public class SQLInterviewReference {

    /*
     ============================================================
     *
          * 1. SIMPLE QUERIES
     *
          ============================================================
     *
     *
          * List all employee details
          * SELECT * FROM employee;
     *
     *
     *
          * List department IDs
          * SELECT department_id FROM employee;
     *
     *
     *
          * List job IDs
          * SELECT job_id FROM employee;
     *
     *
     *
          * List locations
          * SELECT loc FROM employee;
     *
     *
     *
          * Get the latest employee record by employee ID
          * SELECT TOP 1 *
          * FROM employee
          * ORDER BY employee_id DESC;
     *
     *
     *
          * Get the most recently hired employee
          * SELECT *
          * FROM employee
          * WHERE hiredate = (SELECT MAX(hiredate) FROM employee);
     *
     *
     *
          * Select specific employee columns
          * SELECT first_name, last_name, salary, commission
          * FROM employee;
     *
     *
     *
          * Rename columns using aliases
          * SELECT employee_id AS "ID of the employee",
          *        last_name AS "Name of the employee",
          *        department_id AS "Department ID"
          * FROM employee;
     *
     *
     *
          * Calculate annual salary
          * SELECT last_name, salary * 12 AS "Annual Salary"
          * FROM employee;
     *
     *
     *
          ============================================================
     *
          * 2. WHERE CONDITIONS
     *
          ============================================================
     *
     *
          * Find employee named SMITH
          * SELECT *
          * FROM employee
          * WHERE last_name = 'SMITH';
     *
     *
     *
          * Employees in department 20
          * SELECT *
          * FROM employee
          * WHERE department_id = 20;
     *
     *
     *
          * Salary between 3000 and 4500
          * SELECT *
          * FROM employee
          * WHERE salary BETWEEN 3000 AND 4500;
     *
     *
     *
          * Employees in department 20 or 30
          * SELECT *
          * FROM employee
          * WHERE department_id IN (20, 30);
     *
     *
     *
          * Employees NOT in department 10 or 30
          * SELECT last_name, salary, commission, department_id
          * FROM employee
          * WHERE department_id NOT IN (10, 30);
     *
     *
     *
          * Names starting with S
          * SELECT *
          * FROM employee
          * WHERE last_name LIKE 'S%';
     *
     *
     *
          * Names starting with lowercase s
          * SELECT *
          * FROM employee
          * WHERE LOWER(last_name) LIKE 's%';
     *
     *
     *
          * Names starting with uppercase S
          * SELECT *
          * FROM employee
          * WHERE SUBSTRING(last_name, 1, 1) = 'S';
     *
     *
     *
          * Alternative
          * SELECT *
          * FROM employee
          * WHERE LEFT(last_name, 1) = 'S';
     *
     *
     *
          * Names starting with S and ending with H
          * SELECT *
          * FROM employee
          * WHERE last_name LIKE 'S%H';
     *
     *
     *
          * Names with exactly 4 characters starting with S
          * SELECT *
          * FROM employee
          * WHERE last_name LIKE 'S___';
     *
     *
     *
          * Department 10 and salary greater than 3500
          * SELECT *
          * FROM employee
          * WHERE department_id = 10
          *   AND salary > 3500;
     *
     *
     *
          * Employees not receiving commission
          * SELECT *
          * FROM employee
          * WHERE commission IS NULL;
     *
     *
     *
          ============================================================
     *
          * 3. ORDER BY
     *
          ============================================================
     *
     *
          * Employee ID ascending
          * SELECT employee_id, last_name
          * FROM employee
          * ORDER BY employee_id ASC;
     *
     *
     *
          * Salary descending
          * SELECT employee_id, last_name, salary
          * FROM employee
          * ORDER BY salary DESC;
     *
     *
     *
          * Last name ascending, salary descending
          * SELECT employee_id, last_name, salary
          * FROM employee
          * ORDER BY last_name ASC, salary DESC;
     *
     *
     *
          * Last name ascending, department ID descending
          * SELECT employee_id, last_name, salary, department_id
          * FROM employee
          * ORDER BY last_name ASC, department_id DESC;
     *
     *
     *
          ============================================================
     *
          * 4. GROUP BY / HAVING
     *
          ============================================================
     *
     *
          * Count employees department-wise
          * SELECT department_id, COUNT(*) AS employee_count
          * FROM employee
          * GROUP BY department_id;
     *
     *
     *
          * Department-wise count, maximum, minimum and average salary
          * SELECT department_id,
          *        COUNT(*) AS employee_count,
          *        MAX(salary) AS max_salary,
          *        MIN(salary) AS min_salary,
          *        AVG(salary) AS avg_salary
          * FROM employee
          * GROUP BY department_id;
     *
     *
     *
          * Job-wise salary statistics
          * SELECT job_id,
          *        COUNT(*) AS employee_count,
          *        MAX(salary) AS max_salary,
          *        MIN(salary) AS min_salary,
          *        AVG(salary) AS avg_salary
          * FROM employee
          * GROUP BY job_id;
     *
     *
     *
          * Departments having at least 4 employees
          * SELECT department_id, COUNT(*) AS employee_count
          * FROM employee
          * GROUP BY department_id
          * HAVING COUNT(*) >= 4;
     *
     *
     *
          * Employees joined in January
          * SELECT TO_CHAR(hire_date, 'MON') AS month,
          *        COUNT(*) AS employee_count
          * FROM employee
          * GROUP BY TO_CHAR(hire_date, 'MON')
          * HAVING TO_CHAR(hire_date, 'MON') = 'JAN';
     *
     *
     *
          * Employees joined in January or September
          * SELECT TO_CHAR(hire_date, 'MON') AS month,
          *        COUNT(*) AS employee_count
          * FROM employee
          * GROUP BY TO_CHAR(hire_date, 'MON')
          * HAVING TO_CHAR(hire_date, 'MON') IN ('JAN', 'SEP');
     *
     *
     *
          * Employees joined in 1985
          * SELECT TO_CHAR(hire_date, 'YYYY') AS year,
          *        COUNT(*) AS employee_count
          * FROM employee
          * GROUP BY TO_CHAR(hire_date, 'YYYY')
          * HAVING TO_CHAR(hire_date, 'YYYY') = '1985';
     *
     *
     *
          ============================================================
     *
          * 5. SUBQUERIES
     *
          ============================================================
     *
     *
          * Employee(s) with maximum salary
          * SELECT *
          * FROM employee
          * WHERE salary = (SELECT MAX(salary) FROM employee);
     *
     *
     *
          * Employees working in Sales
          * SELECT *
          * FROM employee
          * WHERE department_id IN (
          *     SELECT department_id
          *     FROM department
          *     WHERE name = 'SALES'
          * );
     *
     *
     *
          * Employees working as Clerk
          * SELECT *
          * FROM employee
          * WHERE job_id IN (
          *     SELECT job_id
          *     FROM job
          *     WHERE function = 'CLERK'
          * );
     *
     *
     *
          * Employees working in New York
          * SELECT *
          * FROM employee
          * WHERE department_id = (
          *     SELECT department_id
          *     FROM department
          *     WHERE location_id = (
          *         SELECT location_id
          *         FROM location
          *         WHERE regional_group = 'NEW YORK'
          *     )
          * );
     *
     *
     *
          * Second-highest salary
          * SELECT *
          * FROM employee
          * WHERE salary = (
          *     SELECT MAX(salary)
          *     FROM employee
          *     WHERE salary < (SELECT MAX(salary) FROM employee)
          * );
     *
     *
     *
          ============================================================
     *
          * 6. ALL / ANY / SOME / EXISTS
     *
          ============================================================
     *
     *
          * Salary greater than every employee in department 30
          * SELECT *
          * FROM employee
          * WHERE salary > ALL (
          *     SELECT salary
          *     FROM employee
          *     WHERE department_id = 30
          * );
     *
     *
     *
          * Salary greater than at least one employee in department 30
          * SELECT *
          * FROM employee
          * WHERE salary > ANY (
          *     SELECT salary
          *     FROM employee
          *     WHERE department_id = 30
          * );
     *
     *
     *
          * Departments with no employees
          * SELECT name
          * FROM department d
          * WHERE NOT EXISTS (
          *     SELECT 1
          *     FROM employee e
          *     WHERE d.department_id = e.department_id
          * );
     *
     *
     *
          ============================================================
     *
          * 7. CORRELATED SUBQUERY
     *
          ============================================================
     *
     *
          * Employees earning more than their department average
          * SELECT employee_id, last_name, salary, department_id
          * FROM employee e
          * WHERE salary > (
          *     SELECT AVG(salary)
          *     FROM employee
          *     WHERE department_id = e.department_id
          * );
     *
     *
     *
          ============================================================
     *
          * 8. JOINS
     *
          ============================================================
     *
     *
          * INNER JOIN
          * Returns matching rows from both tables.
          *
          * LEFT JOIN
          * Returns all rows from the left table and matching rows
          * from the right table.
          *
          * RIGHT JOIN
          * Returns all rows from the right table and matching rows
          * from the left table.
          *
          * FULL OUTER JOIN
          * Returns rows when there is a match in either table.
     *
     *
     *
          * Employees with department names
          * SELECT e.employee_id, e.last_name, d.name
          * FROM employee e
          * INNER JOIN department d
          *     ON e.department_id = d.department_id;
     *
     *
     *
          * Employees with job/designation
          * SELECT e.employee_id, e.last_name, j.function
          * FROM employee e
          * INNER JOIN job j
          *     ON e.job_id = j.job_id;
     *
     *
     *
          * Employees with department name and location
          * SELECT e.employee_id,
          *        e.last_name,
          *        d.name,
          *        l.regional_group
          * FROM employee e
          * INNER JOIN department d
          *     ON e.department_id = d.department_id
          * INNER JOIN location l
          *     ON d.location_id = l.location_id;
     *
     *
     *
          * Department-wise employee count
          * SELECT d.name, COUNT(*) AS employee_count
          * FROM employee e
          * INNER JOIN department d
          *     ON d.department_id = e.department_id
          * GROUP BY d.name;
     *
     *
     *
          * Sales department employee count
          * SELECT d.name, COUNT(*) AS employee_count
          * FROM employee e
          * INNER JOIN department d
          *     ON d.department_id = e.department_id
          * WHERE d.name = 'SALES'
          * GROUP BY d.name;
     *
     *
     *
          ============================================================
     *
          * 9. NON-EQUI JOIN
     *
          ============================================================
     *
     *
          * Employee salary grades
          * SELECT e.employee_id,
          *        e.last_name,
          *        s.grade_id
          * FROM employee e
          * INNER JOIN salary_grade s
          *     ON e.salary BETWEEN s.lower_bound AND s.upper_bound
          * ORDER BY e.last_name;
     *
     *
     *
          * Number of employees per salary grade
          * SELECT s.grade_id, COUNT(*) AS employee_count
          * FROM employee e
          * INNER JOIN salary_grade s
          *     ON e.salary BETWEEN s.lower_bound AND s.upper_bound
          * GROUP BY s.grade_id
          * ORDER BY s.grade_id DESC;
     *
     *
     *
          ============================================================
     *
          * 10. SELF JOIN
     *
          ============================================================
     *
     *
          * Employee details with manager names
          * SELECT e.last_name AS emp_name,
          *        m.last_name AS mgr_name
          * FROM employee e
          * INNER JOIN employee m
          *     ON e.manager_id = m.employee_id;
     *
     *
     *
          * Employees earning more than their managers
          * SELECT e.last_name AS emp_name,
          *        e.salary AS emp_salary,
          *        m.last_name AS mgr_name,
          *        m.salary AS mgr_salary
          * FROM employee e
          * INNER JOIN employee m
          *     ON e.manager_id = m.employee_id
          * WHERE e.salary > m.salary;
     *
     *
     *
          * Number of employees under each manager
          * SELECT m.employee_id AS manager_id,
          *        COUNT(*) AS employee_count
          * FROM employee e
          * INNER JOIN employee m
          *     ON e.manager_id = m.employee_id
          * GROUP BY m.employee_id;
     *
     *
     *
          ============================================================
     *
          * 11. OUTER JOIN
     *
          ============================================================
     *
     *
          * All departments, including departments without employees
          * SELECT e.last_name,
          *        d.department_id,
          *        d.name
          * FROM department d
          * LEFT JOIN employee e
          *     ON e.department_id = d.department_id;
     *
     *
     *
          ============================================================
     *
          * 12. SET OPERATORS
     *
          ============================================================
     *
     *
          * UNION
          * Combines results and removes duplicates.
          *
          * UNION ALL
          * Combines results and keeps duplicates.
          *
          * INTERSECT
          * Returns common rows from both result sets.
     *
     *
     *
          * Jobs in Sales and Accounting
          * SELECT function
          * FROM job
          * WHERE job_id IN (
          *     SELECT job_id
          *     FROM employee
          *     WHERE department_id = (
          *         SELECT department_id FROM department WHERE name = 'SALES'
          *     )
          * )
          * UNION
          * SELECT function
          * FROM job
          * WHERE job_id IN (
          *     SELECT job_id
          *     FROM employee
          *     WHERE department_id = (
          *         SELECT department_id FROM department WHERE name = 'ACCOUNTING'
          *     )
          * );
     *
     *
     *
          * Common jobs in Research and Accounting
          * SELECT function
          * FROM job
          * WHERE job_id IN (
          *     SELECT job_id
          *     FROM employee
          *     WHERE department_id = (
          *         SELECT department_id FROM department WHERE name = 'RESEARCH'
          *     )
          * )
          * INTERSECT
          * SELECT function
          * FROM job
          * WHERE job_id IN (
          *     SELECT job_id
          *     FROM employee
          *     WHERE department_id = (
          *         SELECT department_id FROM department WHERE name = 'ACCOUNTING'
          *     )
          * )
          * ORDER BY function;
     *
     *
     *
          ============================================================
     *
          * 13. IMPORTANT SQL INTERVIEW CONCEPTS
     *
          ============================================================
     *
     *
          * SQL COMMAND TYPES
          *
          * DDL - Data Definition Language
          * CREATE, ALTER, DROP, TRUNCATE, COMMENT, RENAME
          *
          * DML - Data Manipulation Language
          * SELECT, INSERT, UPDATE, DELETE, MERGE
          *
          * DCL - Data Control Language
          * GRANT, REVOKE
          *
          * TCL - Transaction Control Language
          * COMMIT, ROLLBACK, SAVEPOINT
     *
     *
     *
          ============================================================
     *
          * 14. INDEX
     *
          ============================================================
     *
     *
          * An index is a database structure used to improve the speed
          * of data retrieval.
          *
          * Example:
          *
          * CREATE INDEX index_name
          * ON table_name(column_name);
          *
          * DROP INDEX index_name;
     *
     *
     *
          ============================================================
     *
          * 15. VIEW
     *
          ============================================================
     *
     *
          * A VIEW is a virtual table based on a SQL query.
          *
          * CREATE VIEW view_name AS
          * SELECT column1, column2
          * FROM table_name
          * WHERE condition;
          *
          * Common advantages:
          * - Simplifies complex queries.
          * - Can restrict access to selected columns/rows.
          * - Provides a reusable query definition.
     *
     *
     *
          ============================================================
     *
          * 16. NORMALIZATION
     *
          ============================================================
     *
     *
          * Normalization is a database design technique used to reduce
          * data redundancy and avoid insertion, update and deletion
          * anomalies.
          *
          * Normal forms:
          * 1NF - First Normal Form
          * 2NF - Second Normal Form
          * 3NF - Third Normal Form
          * BCNF - Boyce-Codd Normal Form
          * 4NF - Fourth Normal Form
          * 5NF - Fifth Normal Form
          * 6NF - Sixth Normal Form
     *
     *
     *
          ============================================================
     *
          * 17. PRIMARY KEY
     *
          ============================================================
     *
     *
          * A primary key uniquely identifies each row in a table.
          *
          * Key points:
          * - Values must be unique.
          * - NULL values are not allowed.
          * - A table has one PRIMARY KEY constraint
          *   (which may contain multiple columns as a composite key).
          *
          * Example:
          *
          * CREATE TABLE employee (
          *     emp_id INT PRIMARY KEY,
          *     name VARCHAR(20),
          *     salary DECIMAL(18,2)
          * );
     *
     *
     *
          ============================================================
     *
          * 18. FOREIGN KEY
     *
          ============================================================
     *
     *
          * A foreign key creates a relationship between tables.
          * It references a primary key or suitable unique key
          * in another table.
          *
          * Example:
          *
          * CREATE TABLE company (
          *     company_id INT PRIMARY KEY,
          *     company_name VARCHAR(20),
          *     employee_id INT,
          *     FOREIGN KEY (employee_id)
          *         REFERENCES employee(emp_id)
          * );
     *
     *
     *
          ============================================================
     *
          * 19. QUERY
     *
          ============================================================
     *
     *
          * A query is a request for data or information from one
          * or more database tables.
     *
     *
     *
          ============================================================
     *
          * 20. SUBQUERY
     *
          ============================================================
     *
     *
          * A subquery is a query nested inside another SQL query.
          *
          * Example:
          *
          * SELECT *
          * FROM employee
          * WHERE salary = (SELECT MAX(salary) FROM employee);
     *
     *
     *
          ============================================================
     *
          * 21. STORED PROCEDURE
     *
          ============================================================
     *
     *
          * A stored procedure is a collection of SQL statements
          * stored in the database and executed to perform a task.
     *
     *
     *
          ============================================================
     *
          * 22. TRIGGER
     *
          ============================================================
     *
     *
          * A trigger is database code that executes automatically
          * in response to specified events such as INSERT, UPDATE
          * or DELETE.
     *
     *
     *
          ============================================================
     *
          * 23. DISTINCT
     *
          ============================================================
     *
     *
          * DISTINCT removes duplicate rows from the result.
          *
          * Example:
          *
          * SELECT DISTINCT emp_no
          * FROM employee;
     *
     *
     *
          ============================================================
     *
          * 24. SQL CONSTRAINTS
     *
          ============================================================
     *
     *
          * NOT NULL
          *   Prevents NULL values.
          *
          * UNIQUE
          *   Prevents duplicate values in the constrained key.
          *
          * PRIMARY KEY
          *   Uniquely identifies a row and does not allow NULL.
          *
          * FOREIGN KEY
          *   Maintains referential integrity between tables.
          *
          * CHECK
          *   Ensures values satisfy a condition.
          *
          * DEFAULT
          *   Supplies a default value when no value is provided.
     *
     *
     *
          ============================================================
     *
          * 25. DELETE vs TRUNCATE vs DROP
     *
          ============================================================
     *
     *
          * DELETE
          * - Removes selected rows.
          * - Supports WHERE.
          * - Transaction/rollback behaviour depends on the DBMS
          *   and transaction handling.
          *
          * TRUNCATE
          * - Removes all rows from a table.
          * - Does not support a WHERE clause.
          * - Transaction behaviour is DBMS-specific.
          *
          * DROP
          * - Removes the table object and its data.
          * - The table structure is removed as well.
     *
     *
     *
          ============================================================
     *
          * 26. COMMON INTERVIEW QUERIES
     *
          ============================================================
     *
     *
          * Maximum salary from each department
          * SELECT department_id, MAX(salary) AS max_salary
          * FROM employee
          * GROUP BY department_id;
     *
     *
     *
          * Distinct employee names with salary between 3000 and 3500
          * SELECT DISTINCT first_name
          * FROM employee
          * WHERE salary BETWEEN 3000 AND 3500;
     *
     *
     *
          * Employees whose salary is >= 40000
          * SELECT *
          * FROM employee
          * WHERE salary >= 40000;
     *
     *
     *
          * Employee names starting with S
          * SELECT *
          * FROM employee
          * WHERE first_name LIKE 'S%';
     *
     *
     *
          * Maximum salary among female employees
          * SELECT MAX(salary) AS max_salary
          * FROM employee
          * WHERE gender = 'FEMALE';
     *
     *
     *
          * Update Yashika Reddy's salary
          * UPDATE employee
          * SET salary = 34000
          * WHERE first_name = 'Yashika'
          *   AND last_name = 'Reddy';
     *
     *
     *
          * Delete employee named Deepak
          * DELETE FROM employee
          * WHERE first_name = 'Deepak';
     *
     *
     *
          * INNER JOIN Employee and Company
          * SELECT *
          * FROM employee
          * INNER JOIN company
          *     ON employee.emp_id = company.employee_id;
     *
     *
     *
          * FULL OUTER JOIN Employee and Company
          * SELECT *
          * FROM employee
          * FULL OUTER JOIN company
          *     ON employee.emp_id = company.employee_id;
     *
     *
     *
          * Company name of the highest-paid female employee
          * SELECT c.company_name
          * FROM employee e
          * INNER JOIN company c
          *     ON e.emp_id = c.employee_id
          * WHERE e.salary = (
          *     SELECT MAX(salary)
          *     FROM employee
          *     WHERE gender = 'FEMALE'
          * );
     *
     *
     *
          ============================================================
     *
          * 27. QUICK INTERVIEW REVISION
     *
          ============================================================
     *
     *
          * WHERE      -> Filters rows before grouping.
          * GROUP BY   -> Creates groups of rows.
          * HAVING     -> Filters groups after GROUP BY.
          * ORDER BY   -> Sorts the final result.
          * DISTINCT   -> Removes duplicate result rows.
          * JOIN       -> Combines rows from multiple tables.
          * SUBQUERY   -> Query inside another query.
          * EXISTS     -> Tests whether a subquery returns rows.
          * UNION      -> Combines result sets and removes duplicates.
          * UNION ALL  -> Combines result sets and keeps duplicates.
     *
     *
     *
          ============================================================
     *
          * MAIN METHOD
     *
          ============================================================

     */

    public static void main(String[] args) {
        System.out.println("SQL Interview Reference");
    }
}
