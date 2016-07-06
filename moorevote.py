def moorevote1(lList):
	curCount = 0
	curNum = None
	for item in lList:
		if curNum == item:
			curCount += 1
		else:
			if curCount == 0:
				curNum = item
				curCount += 1
			else:
				curCount -= 1
	return curNum
def moorevote2(lList):
	curCount = [0,0]
	curNum = [None,None]
	for item in lList:
		if(curNum[0] ==item or curCount[0] ==0):
			curCount[0] += 1
			curNum[0] = item
		elif (curNum[1] == item or curCount[1] == 0):
			curCount[1] += 1
			curNum[1] = item
		else:
			curCount[0] -= 1;curCount[1] -=1
	return curCount,curNum
if __name__=='__main__':
	print moorevote1([1,2,2,2,2,4,5,6])

