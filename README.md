![Algorythm of the night](https://github.com/massoprod/algorythm-of-the-night/blob/master/logo.png?raw=true)

# List of algorithms [![Awesome](https://cdn.rawgit.com/sindresorhus/awesome/d7305f38d29fed78fa85652e3a63e154dd8e8829/media/badge.svg)](https://github.com/sindresorhus/awesome)

> Awesome list of algorithms that help you to solve your code issues or can help you in interviews if you are looking for a new job.

## Table of content
* [Factorial](#factorial)

## Algorithms

### Factorial
> The factorial function (symbol: !) says to multiply all whole numbers from our chosen number down to 1.
##### Example
`5! = 5 * 4 * 3 * 2 * 1 = 120`

#### Basic
```java
public static long factorial(int x) {
    long fact = 1;
    for (int i = 2; i <= x; i++) {
        fact = fact * i;
    }
    return fact;
}
```
#### Recursion
```java
public static long factorial(int x) {
    if (x == 0) {
        return 1;
    } else {
        return x * factorialRecursive(x - 1);
    }
}
```
