class Circle:
    pi = 3.14
    
    def __init__(self, diameter):
        self.radius = diameter / 2
    def area (self):
        return self.pi*self.radius**2
    def perimeter (self):
        return self.pi*2*self.radius

medium_pizza = Circle(12)
lote = Circle(7800)

print("Medium pizza area:", medium_pizza.area())
print("Medium pizza perimeter: ", medium_pizza.perimeter())

print("Area Lote:", medium_pizza.area())
print("Perimetro Lote: ", medium_pizza.perimeter())
