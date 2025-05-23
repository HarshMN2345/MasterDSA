// Let me explain static functions in Java:

// Static Functions (Methods)
// A static function/method in Java:

// Class Level Membership

// Belongs to the class rather than any specific instance (object)
// Can be called without creating an object of the class
// Key Characteristics

// Marked with the static keyword
// Cannot access non-static members directly
// Can be called using the class name
// Common Use Cases

// Utility functions
// Main method (program entry point)
// Factory methods

import java.util.HashMap;

public class fibonacci{
    public static void main(String[] args){
        int n = 10; // Example input
        fibonacci fib = new fibonacci();
        System.out.println("Fibonacci of " + n + " is: " + fib.recursiveFibonacci(n));
        System.out.println("Fibonacci of " + n + " using top-down approach is: " + fib.topdown(n));
    }
    public int recursiveFibonacci(int n){
        if(n <= 1){
            return n;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }
    public int topdown(int n){
        HashMap<Integer,Integer> memo=new HashMap<>();
        if(n <= 1){
            return n;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        int result = topdown(n - 1) + topdown(n - 2);
        memo.put(n, result);
        return result;
    }
}