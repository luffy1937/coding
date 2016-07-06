def fullParmutation(intList):
	retset =[sorted(intList)]
	curList =sorted(intList) 
	i = firstUpfromBottom(curList)
	while(i != -1):
		m = minbiger(intList,i)
		curList[i],curList[m]=curList[m],curList[i]	
		reverse(curList,i+1)
		retset.append(curList[:])
		i =	firstUpfromBottom(curList)
	return retset
def firstUpfromBottom(intList):
	listlen = len(intList)
	for i in range(listlen-2,-1,-1):
		if intList[i]<intList[i+1]:
			return i
	return -1
def minbiger(intList,i):
	for index in range(len(intList)-1,i,-1):
		if intList[index] > intList[i]:
			return index
def reverse(intList,i):
	lenlist = len(intList)-1
	for a in range((lenlist - i)/2):
		intList[i+a],intList[lenlist-a] = intList[lenlist-a],intList[i+1]
if __name__=='__main__':
	fullParmutation([1,2,3])
		
		
