## Variables ##

# Single  variable assignment
var1 = 10
print(var1)

# Multi variable assignment
var1, var2, var3 = "A", "B", "C"
print(var1, var2, var3)

# List
fruits = ["apple", "banana", "cherry"]
x, y, z = fruits
print(x)
print(y)
print(z)

def my_Function():
    # Declare a global variable within the scope of a function
    global globalVar
    globalVar = 100


    # Change a global variable within a function
    global var1
    var1 = 111

my_Function()

print(globalVar)
print(var1)


## DATA TYPES ##
# Text Type:    str
# Numeric:	    int, float, complex
# Sequence: 	list, tuple, range
# Mapping:      dict
# Set Types:	set, frozenset
# Boolean:      bool
# Binary:	    bytes, bytearray, memoryview

stringVar = "Hello World"
intVar = 10
floatVar = 10.1
complexVar = 1j
rangeVar = range(10)


listVar = [1, 2, 3, "banana"]
# Lists can be the same or different types
# Ordered, changeable, allow duplicates
print("\n---List---")
print(listVar)
for x in listVar:
    print(x)

tupleVar = (1, 2, 3, "Orange")
# Tuples are immutable (no changes after creation)
print("\n---Tuple---")
print(tupleVar)
for x in tupleVar:
    print(x)

dictVar = {"Key1": 1000, "key2": 2000, "Key3": 3000}
# Keys must be unique
# Keys are immutable
# keys() returns a list of keys
# values() returns a list of values
print("\n---Dictionary---")
print(dictVar)
for x in dictVar:
    print(x)
print(dictVar.values())
print(dictVar.keys())

setVar = {"Something", "Something2", "Something3", "Something"}
# Unordered, unchangeable and does not allow duplicates (Like a discrete maths set)
print("\n---Set---")
print(se
