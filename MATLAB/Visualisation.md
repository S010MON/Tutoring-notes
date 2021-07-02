
## Visualisation


### 2D Plotting
	plot(x,y)		Plots a set X against set Y

	plot(x,f(x))		Plot a set X against f(x)

	plot(x,y,'mod')		modifiers (colours: b, g, r, c, m, y) (Symbols: - , *, - -, -. , >, <, ^, p, h, :)

### Multiple data sets:
	hold on			% Turn on the hold at the start
	%insert plots
	hold off		% Plot the graphs

### Labels

	title('Title')
	
	ylabel('Label')
	
	xlabel(Label')

	legend('one','two')

	grid on

	axis square

### Plot Management

	figure		open a new figue

	close all	close all figures

	clf		clear a figure without closing

### Subplot()

	scatter
	bar
	loglog
	semilogx
	semilogy

### 3D Plotting
	plot3(x,y,z)

	In surface plotting, the first data structure you must create is called a mesh, a listing of all combinations of X and y
	This is done as two matrices X and Y where X = (i,j) and Y = (i,j).  A thrid mesh can be created using the meshgrid() function.
	
	[X,Y] = meshgrid(x,y)	% where x and y are pre-defined arrays
	
	Z = f(X).*f(y);		% create Z values
	
	surf(X,Y,Z)		% surface the plot
