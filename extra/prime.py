class prime:
    def prime(self):
        s=int(input("Enter Number: "))
        for i in range(2,s):
            if(s%i==0):
                print(s," is not Prime Number..")
                break
        else:
            print(s," is  Prime Number..")

p1=prime()
p1.prime()