class RightTriangle:

    def __init__(self, base, height):
        self.base = base
        self.height = height
    
    def tPerimeter(self):
        self.hypotenuse = (self.base **2 + self.height ** 2) ** 0.5
        return self.hypotenuse + self.base + self.height
    def tArea(self):
        return (self.base * self.height) / 2
    
