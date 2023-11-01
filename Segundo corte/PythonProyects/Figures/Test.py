from Circle import Circle
from Rectangle import Rectangle
from Square import Square
from RightTriangle import RightTriangle

medium_pizza = Circle(12)
batch = Circle(7800)

print("Medium pizza perimeter: ", medium_pizza.perimeter())
print("Medium pizza area:", medium_pizza.area())

print("Batch perimeter: ", batch.perimeter())
print("Batch area: ", batch.area())

screen = Rectangle(4, 2)

print("Screen perimeter: ", screen.rPerimeter())
print("Screen area: ", screen.rArea())

block = Square(2)

print("Block perimeter: ", block.sPerimeter())
print("Block area: ", block.sArea())

weirdTable = RightTriangle(3, 4)

print("Triangle table perimeter:", weirdTable.tPerimeter())
print("Triangle table area:", weirdTable.tArea())
