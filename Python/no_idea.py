import sys
import fileinput
import Collections

raw_input()
arr = raw_input().strip().split()
set1 = set(raw_input().strip().split())
set2 = set(raw_input().strip().split())

for i in arr:
	if i in set1:
		happiness+=1
	elif i in set2:
		happiness+=1


print happiness