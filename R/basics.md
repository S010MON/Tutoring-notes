### Misc syntax notes

**Comments**.   `# Single line comments use the hashtag`

**Printing**.   `print("This string to terminal out")`

**Assignment**.  Unlike most languages, both `<-` and `=` can be used for assignment,
although the `=` assignment can be forbidden in some situations

### Data Types

- numeric   *10.5, 55, 787*
- integer   *1L, 55L, 100L* (where the letter "L" declares this as an integer)
- complex   *9 + 3i* (where "i" is the imaginary part)
- character *"k", "R is exciting", "FALSE", "11.5"*  (a.k.a String)
- logical   *TRUE* or *FALSE* (a.k.a boolean)

### Converting between types
You can convert using the `as.to(from)` syntax:

    as.numeric(x)
    as.integer(y)
    as.complex(z)

### Creating Vectors

Everything in R is considered a Vector
