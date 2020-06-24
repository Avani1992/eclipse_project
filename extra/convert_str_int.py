"""Your task  is to implement the function atoi. The function takes a string(str) as argument and converts it to an integer and returns it.
If it is not numerical print -1."""
import re

def atoi(str):
    if(str.isdigit()):
        print("Yes")
    else:
        print("-1")

atoi("123a")