# How python handles CLI arguments, *args, *kwargs

class demo():
    def arguments(self,age,name):
        self.age=age
        self.name=name
        print("Age=",self.age)
        print("Name=",self.name)

obj=demo()
obj.arguments(25,name="Avani")
obj.arguments(29,name="Kuman")