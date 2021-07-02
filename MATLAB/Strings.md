### Concatanation

	s1 = 'Hello '; s2 = 'World';   s3 = [s1, s2] = 'Hello World'

### Individual Letter Retrieval

	e = s3(2);         // Gets the second letter from s3

### String Retrieval

	string = s3(7:end) // Gets the string 'World'

### String Insertion

	s1 = 'darkness';
	d1 = 10;

	sprintf('%d : the sound of %s', s1, d1)		// Insert s1 into %s loc and 10 into %d loc

	= '10: the sound of darkness'			// %s (strings) %d (doubles) %f and %g (generic numbers)

### String Comparison

	strcmp()
