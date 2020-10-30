def exponentialSearch(array, n, x):
	if array[0] == x:
		return 0
		
	i = 1
	while i < n and array[i] <= x:
		i = i * 2
	
	return binarySearch( array, i / 2, 
						min(i, n-1), x)
                        
def binarySearch( array, l, r, x):
	if r >= l:
		mid = l + ( r-l ) / 2
		
		if array[mid] == x:
			return mid
		
		if array[mid] > x:
			return binarySearch(arr, l, 
								mid - 1, x)
		
		return binarySearch(array, mid + 1, r, x)
		
	return -1	

array = []
while 1:
    try:
        x = input("Enter a number for the sorted list (To exit write something tha is not a number): ")
    except:
        break
    array.append(x)

y = input("Enter the number you want to find: ")
index = exponentialSearch(array, len(array), y) 

if index != -1: 
	print "Element found at index",index 
else: 
	print "Element not found"