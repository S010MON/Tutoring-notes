### Defining simple algebraic functions

to define f(x) = x^2 + 1 as a function
```matlab
f= @(x) x^2+1;
```
then you can call
```matlab
>>> f(10)
```
### Differential equations
```matlab
% Setup variables
a0 = 1;  
k1 = 1;  
k2 = 1;

% Setup equation
f = @(t,y) a0*k1*exp(-k1*t - k2*y.^2;	% Note "y.^2" vectorises the operation
	
t0 = 0;
tf = 5;
y0 = 0;
	
% Solve
[ts,ys] = ode45(f,[t0,tf],y0)
```
### Evaluating Polynomials
```matlab
p = [3 2 1];		% Create a vector holding the degree of each polynomial
x = [5 7 9];		% Create a coeficient for each x value 
y = polyval(p,x)	% Set y = 5x^3 + 7x^2 + 9x  (in this case)
```	
