# --------------------------------------------
# Functions defined using
def myFuction():
    print("This is  a function")

print("\nNo Argument")
myFuction()

# --------------------------------------------
# Functions with parameters
def paramFuction(arg1, arg2):
    print(arg1)
    print(arg2)

print("\n---Fixed Arguments---")
paramFuction("params", "Fuction")

# --------------------------------------------
# Arbitrary Arguments
# Unknown number of parameters can be defined with a '*'
# This automatically creates a tuple
def unknownArgFunction(*args):
    print(args)

print("\n---Arbitatry Arguments---")
unknownArgFunction('String1', "String2")

# Keyword functions: can be passed values with a Key: Value syntax so that the order of
# parameters doesnt matter
print("\n---Arguments out of Order---")
paramFuction(arg2= "Second", arg1= "First")

# --------------------------------------------
# Arbitrary Keyword Arguments (KWARGS)
# A dictionary can be passed as an argument to allow the fuction to select from a range
def gimme_Words(**args):
    for x in args:
        print(x)

print("\n---Kwargs---")
gimme_Words(fName = "wilson", mName = "wilson", sName = "wilson")


# --------------------------------------------
# Default Parameters
def no_by_Default(country = "the Kingdom of the Netherlands"):
    print("I am from " + country)

print("\n---Defaults---")
no_by_Default()
no_by_Default("the United Kingdom of Great Britain and Northern Ireland")


# --------------------------------------------
# Return 'void' using pass
def voidReturn():
    pass

# --------------------------------------------
def booleanReturn(param):
    if param == True:
        return True
    else:
        return False

# --------------------------------------------
def numericReturn(x):
    return x * 5

# --------------------------------------------
def stringRetrun(string):
    return string + string

