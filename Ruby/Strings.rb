# Printing

### Print is simplest method for printing data

print "hello"
print "world"

# the code above would print:
# helloworld


### To manually add a new line you can use the character "\n". "\n" stands for "new line." This syntax is often used for other whitespace characters like tab ("\t").

print "hello\n"
print "\tworld\n"

# the code above would print:
# hello
#   world


### puts also print data with formatting

puts "hello"
puts "world"

# the code above would print:
# hello
# world


### p prints data to the screen and gives info on type of data printed. The only one that will include specifications on quotes. Prints quotes that wrap the string.

p "hello"
p 'goodbye'
p "42"
p 42

# the code above would print:
# "hello"
# "goodbye"
# "42"
# 42







# Strings

# String Operations Lecture


# .length = number of characters in string 
#puts "Hello world".length

#indices - position of the string characters
#puts "Hello"[0]
#puts "Hello"[1]
#puts "Hello"[2]

puts "Hello " + "world" + ", how are you?"









# String Indexing

#each of these characters has a position.
# String: hello
# String: 01234 (Index) - last index is 4, but the number of positions is is 5
# str.length
#     012345
# the last index of a string is always length - 1







# Iterating Through Strings with Loops

# Iterating Through Strings with Loops

##### THE START OF THE STRING w/ defining string = Hello World
#str = "hello world"
#puts str[0]
#puts str[1]
#puts str[4]

### string of i really means string of 2, but according to the evaluationals of ruby, this also works because it will evaluate to the variable we assigned, in this case index 2 which is "l"
#i = 2
#puts str[i] 


### to hit all numbers up to & including 4 - each number printed is valid index for what's in string
#i = 0
#while i < 5 #need to be particular - how far do you want to go? index for is last place this is true
    #puts i 
    #i += 1 #incremental by counting
#end

### instead of printing just i, what if I make it a string - hit every character in string
#i = 0
#while i < str.length #can also make i<5,6,7,etc. - I is less than the length of the string
    #puts str[i]

    #i += 1
#end


###

def printChars(str)
    i = 0
    while i < str.length
        puts str[i]

        i += 1
    end
end

printChars('pizza')



