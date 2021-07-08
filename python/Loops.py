# Basic for loop
numbers = [1,2,3,4,5,6,7]
print("\n--- 1 ---")
for i in numbers:
    print(i)
    if i == 5:
        continue

print("\n--- 2 ---")
words = ["One", "Two", "Three", "Lift Off!"]
for s in words:
    print(s)

# Range() function
print("\n--- 3 ---")
for i in range(6):
    print(i)

# Range function with iteration from 6 - 14 in evens
print("\n--- 4 ---")
for i in range(6, 14, 2):
    print(i)

# While function
print("\n--- 5 ---")
i = 0
while i < 10:
    i += 1
    if i > 5:
        continue
    print(i)
else:
    print("End")
    
# Execute a string of code as a function in the interpreter
exec("for i in range(10): print(i)")

