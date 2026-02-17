class Computer:
    def config(self):
        print("i5 16B ram")
    def __del__(self):
        print("Destructor called")
com1 = Computer()
com1.config()