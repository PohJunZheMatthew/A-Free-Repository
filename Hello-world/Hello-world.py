#Here are some ways to say hello world in python
#defult print() function
print("Hello world")
#Use system standard output
import sys
sys.stdout.write("Hello world")
#Write it into a file
with open("Hello-world.txt","w+") as file:
  file.write("Hello world")
#Say it as a tkinter GUI
from tkinter import *
root = Tk()
label = Label(root,text="Hello world")
label.pack()
root.mainloop()
#Say it as a tkinter messagebox GUI
from tkinter import *
from tkinter import messagebox
messagebox.showinfo("showinfo", "Hello world") 
#Say it through pygame
#Make sure pygame is installed by using pip install pygame
import pygame
