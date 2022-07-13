//https://leetcode.com/problems/employee-importance/submissions/

/**
 * Definition for Employee.
 * function Employee(id, importance, subordinates) {
 *     this.id = id;
 *     this.importance = importance;
 *     this.subordinates = subordinates;
 * }
 */

/**
 * @param {Employee[]} employees
 * @param {number} id
 * @return {number}
 */
 var GetImportance = function(employees, id) {
    let ht = {}
    for (const employee of employees) {
        ht[employee.id] = employee;
    }
    
    const helper = function (employee) {
        let subImportance = 0;
        for (const subId of employee.subordinates) {
            const subEmployee = ht[subId];
            subImportance += helper(subEmployee); 
        }
        return subImportance + employee.importance;
    }
    const rootEmp = ht[id];
    return helper(rootEmp);
};

