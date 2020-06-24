import math
def find_roots(a, b, c):
    s=int((-b+math.sqrt((b*b)-4*a*c))/(2*a))
    s1=int((-b-math.sqrt((b*b)-4*a*c))/(2*a))
    return s,s1

print(find_roots(2, 10, 8));