//npx ts-node dsa/Arrays/_2.ts
let numbers=[1,2,3,4,5]; // This is a general array of numbers
numbers.push(6); // Adding a new number to the array
console.log(numbers); // Output: [1, 2, 3, 4, 5, 6]
numbers.pop(); // Removing the last number from the array
console.log(numbers); // Output: [1, 2, 3, 4, 5]
numbers.unshift(0); // Adding a number to the beginning of the array
console.log(numbers); // Output: [0, 1, 2, 3, 4, 5]
numbers.shift(); // Removing the first number from the array
console.log(numbers); // Output: [1, 2, 3, 4, 5]
let numindex=numbers.indexOf(3); // Finding the index of number 3
console.log(numindex); // Output: 2