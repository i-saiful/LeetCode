/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    const throwError = (msg) => { throw new Error(msg)}
    return {
        toBe: (newVal) => newVal === val || throwError("Not Equal"),
        notToBe: (newVal) => newVal !== val || throwError("Equal")
    }
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */