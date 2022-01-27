A lambda expression is an expression with a single line and no return statements that can be
assigned to a variable in the following form
```python
square = lambda x: x * x

i = square(3)
print(i)
```
All of the combinations of arguments are shown below
```python
print((lambda x, y, z: x + y + z)(1, 2, 3))
print((lambda x, y, z=3: x + y + z)(1, 2))
print((lambda x, y, z=3: x + y + z)(1, y=2))
print((lambda *args: sum(args))(1,2,3))
print((lambda **kwargs: sum(kwargs.values()))(one=1, two=2, three=3))
print((lambda x, *, y=0, z=0: x + y + z)(1, y=2, z=3))
```
Particularly useful if you are too lazy to define a function
