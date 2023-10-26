class Rectangle:

    def __init__(self, base, height):
        self.base = base
        self.height = height

    def rPerimeter (self):
        return 2 * (self.base + self.height)
    def rArea (self):
        return self.base * self.height
