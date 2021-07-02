
### Creating Vectors

	v = [1, 2, 3];  	% Creates a vector row

	v = [1; 2; 3];		% Creates a vector column

	v = [1, 2, 3];
	v = v';			% Shortcut column from row

### Creating Matrices

        M = [1, 2, 3; 4, 5, 6];

        -OR-

        M = [[1, 2, 3];[4, 5, 6]];

        -OR-

        M = [X1; X2];

        -OR-

        M = [[1; 4],[2; 5],[3; 6]];

### Indexing

        To access row r in column c of array A:   A(r,c)

        To access a range use the ':' operator:   A(r, c1:c4)   -OR-    A(r1:r2, c)

        To access from a mid point to the end:    A(r, c:end)

### Dimentions

	size(A) = [m, n];				% The size() function returns the dimentions m and n as a vector

### Colon Iterator

	1:10      = [1 2 3 4 5 6 7 8 9 10]		% Create an array from 1 to 10
	
	startValue : increment : final value		% Creates an array of values at set increments

	1 : 2 : 10	= [2, 4, 6, 8, 10]


### Linspace

	linspace(from, to, spacing)			% Creates an array of equally spaced values

	linspace(1, 600, 7)	= 1	10	20	30	40	50	60


### Zeros

	zeros(m,n)					% Creates a matrix of zeros M x N

	zeros(3,5)      =      0 0 0 0 0
                               0 0 0 0 0
                               0 0 0 0 0

### Zeros

        ones(m,n)                                       % Creates a matrix of ones M x N

        ones(3,5)      =       1 1 1 1 1
                               1 1 1 1 1
                               1 1 1 1 1


### Matrix Element-by-Element (EbE) Operations

	A.*B		Where A [ 1 2; 3 4] and B = [9 8; 7 6];

			Output = [0 8; 14 18]

	A./B		Divide EbE
	
	A.^B		Power of EbE

	>		Logical checks elements size  i.e. [1 2 3 4 5] > 3;  returns [0 0 0 1 1]


### Matrix Operations

	A'		Transpose

			C = 1 2		C' = 1 3	
			    3 4		     2 4


### Linear Algebra Operations

	[1,2]'	=	1
			2
	
	v + u		Vector addition

	c*v		Scalar multiplication of the vector by a constant

	v.u		Produces the angle Theta between the two vectors

	cross(v,u)	Produces the cross product

### Linear Dependance

	x = 3*v - 2*w + 4*u
	
	x =	-8
		-1
		 4

### Identity Matrix

	eye(n)		
	        1 0 0 0		%where n is the columns and rows
		0 1 0 0
		0 0 1 0
		0 0 0 1
      
### Determinant

	det(M)		% Where M is a n x n matrix (identity matrix)


### Inverse Matrix

	inv(M)		% resolves to Inf if there is no inverse

### Augmented Matrix

	[A,y]

### Rank
	
  if:	rank([A,y]) != rank(A)+1

	then:	y is linearly independant and there is no solutions for the SLE

### Backslash divide

	A\y	To solve augmented matrix [A,y]
