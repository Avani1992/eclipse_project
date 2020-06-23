# Explain yield generator and multiple return values concept


def add(arg):
    a=40
    b=arg
    yield a
    yield a+arg
    yield a+a+arg


for value in add(25):
    print(value)


# function return multiple value using yield. so we have to iterate it using for loop..