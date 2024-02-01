/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */
var join = function(arr1, arr2) {
    let i = 0;
    let j = 0;
    const res = [];
    arr1.sort((a, b) => a.id - b.id)
    arr2.sort((a, b) => a.id - b.id)
    while (i < arr1.length || j < arr2.length) {
        if (arr1[i]?.id === arr2[j]?.id) {
            res.push(Object.assign(arr1[i], arr2[j]));
            i++; j++;
        } else if (!arr2[j] || arr1[i]?.id < arr2[j].id) {
            res.push(arr1[i]);
            i++;
        } else {
            res.push(arr2[j]);
            j++;
        }

    }
    return res;
};