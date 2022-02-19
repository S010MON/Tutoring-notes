# Functions

## Definitions
Functions are defined using the `def` keyword:
```python
def myFuction():
    print("This is  a function")
```

we can "call" the code above (i.e. make it run from anyhere) using the following syntax:
```python
myFuction()
```
Defining a Functions with parameters means that the parameters (or arguments) are expected to be inputted within the brackets when the function is called
```python
def paramFuction(arg1, arg2):
    print(arg1)
    print(arg2)

paramFuction("params", "Fuction")  # Function prints out the two parameters passed in
```

## Arbitrary Arguments
If we have an unknown number of parameters, this can be defined with a `*`. This automatically creates a tuple of the arguments which will need to be indexed individially.
```python
def unknownArgFunction(*args):
    print(args)

unknownArgFunction('String1')
unknownArgFunction('String1', "String2")
unknownArgFunction('String1', "String2", "String3")  # All three of these work because we take them in as a list
```

## Keyword Arguments
When we want to pass values out of order, we can use a `Key: Value` syntax so that the order of parameters doesnt matter, as the name is assigned in the function call
```python
paramFuction(arg2= "Second", arg1= "First")
```

## Arbitrary Keyword Arguments (KWARGS)
A dictionary can be passed as an argument to allow the fuction to select from a range

```python
def gimme_Words(**args):
    for x in args:
        print(x)

gimme_Words(fName = "wilson", mName = "wilson", sName = "wilson")
```


## Default Parameters
Default arguments set the value of the argument in the function definition, this means that either an argument can be passed as a keyword argument, or none can be passed and the default value is used instead:
```python
def no_by_Default(country = "the Kingdom of the Netherlands"):
    print("I am from " + country)

no_by_Default()
no_by_Default("the United Kingdom of Great Britain and Northern Ireland")
```


## Optional Typing
Python allows optional typing of both input and output parameters for funcitions, this is not directly required by the language, but can be used by third party linters to conduct checks and can make your code far easier to read.  More information is available in ![PEP 484](https://www.python.org/dev/peps/pep-0484/) and the ![Offical Documentation](https://docs.python.org/3/library/typing.html). Some examples below:

```python
def voidReturn(): -> None
    pass
```

```python
def booleanReturn(param: bool): -> bool
    if param:
        return True
    else:
        return False
```

```python
def numericReturn(x: int): -> int
    return x * 5
```

```python
def stringRetrun(string: str): -> str
    return string + string
```
