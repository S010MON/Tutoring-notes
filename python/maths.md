
#### Basic Interactive Operations

`+ - / *`  all work as expected. Division always returns a floating point number.

the `**` operator can calculate powers i.e. `5 ** 2` returns 25

`=` is used for assignment i.e. `five = 5`

`_` is assigned the last output from the interpreter (like ans for calculators)

#### Strings

Types of string available are:
```python
'single quotes'

'use a backslash to escape and write a single quote\' '

"double quotes don't need a single quote escape" 

'Single "Quotes" allow for internal double quotes'

"""
whole chuncks of text can be 
printed within a set
of three quote marks
"""
```
outputs can be prefaced by an 'r' to be interpreted as *Raw* strings

```python
>>> print('C:\some\name')  # here \n means newline!
C:\some
ame
>>> print(r'C:\some\name')  # note the r before the quote
C:\some\name
```

#### Concatonation

Strings can be concatanated by the '+' character

Or they can be multiplied using '*'
```python
3 * "fish" = "fishfishfish"
```
Strings put together in parentheses join them together automatically
```python
string = ('one string' ' two string' 'red string' 'blue string')
```
