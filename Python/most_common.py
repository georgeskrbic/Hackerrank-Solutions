import sys
import fileinput
import collections
import operator
from operator import itemgetter

# word = sys.argv[1]

for line in fileinput.input():
    word = line
charList = []
charDict = {}
ascendSort = []

for c in word:
	if c not in charList:
		charList += c

for i in range(len(charList)):
	charCount = word.count(charList[i])
	charDict[charList[i]] = charCount


sortedDict = sorted(charDict.items(), key=operator.itemgetter(1), reverse = True)

for index, sublist in enumerate(sortedDict):
	if index + 1 < len(sortedDict):
		if sublist[1] == sortedDict[index+1][1]:
			if ord(sublist[0]) > ord(sortedDict[index+1][0]):
				sortedDict[index], sortedDict[index+1] = sortedDict[index+1], sortedDict[index]
	else:
		break

del sortedDict[3:]

for idx, k in enumerate(sortedDict):
    for i in range(len(k)):
    	print k[i],
    print