# find out all numbers in string S="I went to him at 11 A.M. On 4-07-1886". like 11, 4, 07, 1886

import re

s="I went to him at 11 A.M. On 4-07-1886"

l1=list()
l1=re.findall('\d+',s)  # \d+ means group of digit eg. 11,1234. \d means single digit. eg. 1,1,1,2,3,4 like that.

for i in l1:
    print(i)