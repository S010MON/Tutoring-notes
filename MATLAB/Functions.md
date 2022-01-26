## Functions

### Creating Functions
Open editor using "new+" button in upper left hand corner and select "new function"

### Header
```matlab
% generic layout
[y] = functionName(x).
	
% example
[out] = add(a, b, c).
```

### Keywords
```matlab
function	% must start with this keyword

end		% the return statement
```
### Comments
```matlab
% this is a comment
```
### Outputs
Functions can have multiple output argumments `[out1, out2]` they will be returned as 0 values if unassigned

### Overloading
Fuctions are called from the working directory in the first instance, and then will search the path in order
until a function is found.  Functions like `sin()` could be overloaded within the current working directory

### Subfunctions
Like an inner class in java, subfunctions are only accessable to it's parent function

### Function Handles
Using the '@' designation you can assign a function to a variable.  For example, assigning:
```matlab
add = @myAdderWithALongName
```
One can use 
```matlab
add(a,b) === myAdderWithALongName(a,b)
```
### Timing Function
```matlab
	tic	% Starts a timer

	toc	% Returns the current time
```
