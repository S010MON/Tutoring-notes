### Defining simple algebraic functions

	for f(x) = x^2 + 1
	
	f= @(x) x^2+1;
	
### Differential equations

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
 
### Evaluating Polynomials

	p = [3 2 1];		% Create a vector holding the degree of each polynomial
	x = [5 7 9];		% Create a coeficient for each x value 
	y = polyval(p,x)	% Set y = 5x^3 + 7x^2 + 9x  (in this case)
	
