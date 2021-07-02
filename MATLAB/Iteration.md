
For-Loops

	for looping variable = looping array	
		%code block;
	end%for					

   *example:*
   
   	for i = 1:n
		% do stuff ...
	end%for
	
   *with steps other than one:*
   
   	for i: 1:3:n 		% will count in threes
		% do stuff ...
	end%for

Breaks

	for i = 1:10			% for 10 times

		if i == 7;
			break		% Stop the loop at 7 
		end%for

	end%for				%end of for i

While-Loops

	while logical expression
		%code block
	end%while	


