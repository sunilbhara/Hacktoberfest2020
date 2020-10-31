# Functions calling functions
import turtle

romeo = turtle.Turtle()
romeo.color("violet")
romeo.speed(8)

def draw_square(romeo):
    for side in range(4):
        romeo.forward(100)
        romeo.right(90)

def draw_flower(romeo):
    for petal in range(6):
        draw_square(romeo)
        romeo.right(60)
        
    romeo.hideturtle()

draw_flower(romeo)
