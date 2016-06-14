import sys
import fileinput

word = sys.argv[1]
# for line in fileinput.input():
#     word = line
length = len(word)
player1 = 0
player2 = 0
for i,c in enumerate(word):
	if word[i] in ['A','E','I','O','U']:
		player2 += length - i
	else:
		player1 += length - i
		
if player1 > player2:
	print "Stuart " + str(player1)
elif player2 > player1:
	print "Kevin " + str(player2)
else:
	print "Draw"