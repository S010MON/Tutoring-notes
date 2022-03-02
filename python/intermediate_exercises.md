# Intermediate Level Exercises

## 1 FizzBuzz
 Create a function that takes in an integer number **n** and prints out a count from **0 to n** with the following rules applied:
 
 1. Numbers divisible by 3: print `Fizz`
 2. Numbers divisible by 5: print `Buzz`
 3. Numbers divisible by 3 and 5: print `FizzBuzz`

Function definition should take the form:
```python
def fizz_buzz(n: int) -> None:
    # Your code here
```

Example output for the function:
```
>>> fizz_buzz(16)
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
```

## 2 Merge Two Lists

Create a function `zip` that takes in two sorted lists `list_1` and `list_2` and returns as an output both lists merged together in order.  You can assume that list1 and list2 are already sorted in accending order.

Function definition should take the form:
```python
def zip(list_1, list_2) -> list:
    # Your code here
```

Example output for the function:
```
>>> list_1 = [1,3,4,7,9,18]
>>> list_2 = [2,4,6,8,10]
>>> zip(list_1, list_2)
[1,2,3,4,4,6,7,8,9,10,18]           ## Note that numbers that appear in both lists are repeated
```

## 3 Squared Distance

Create a function that takes in two points as tuples and returns the ![euclidean distance](https://en.wikipedia.org/wiki/Euclidean_distance) between them.  At first just find the distance between two points with only two dimensions so that the tuples look like: `(x1, y1)` and `(x2, y2)`.  Then try and extend your code to work for tuples of all sizes.

Function definition should take the form:
```python
def dist(point_1, point_2) -> double:
    # Your code here
```


Example output for the function:
```
>>> point_1 = (0, 10)
>>> point_2 = (0, 20)
>>> dist(point_1, point_2)
10
```
Or for a more complex example
```
>>> point_1 = (5, 10, 13)
>>> point_2 = (7, 20, 18)
>>> dist(point_1, point_2)
11.3578
```


## 4 
