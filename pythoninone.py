#File main1.py as described in the video
print("Hello world")

# This is python in one video code

'''This is a 
multiline comment

'''

sttr = "This is me"
age = 21
weight = 75.5

# Numbers Strings Lists Tuples Dictionaries
#Arithmetic operations

print("The value of 3 + 5 = ", 3+5)
print("The value of 3 - 5 = ", 3-5)
print("The value of 3 * 5 = ", 3*5)
print("The value of 3 / 5 = ", 3/5)
print("The value of 3 ** 5 = ", 3**5)
print("The value of 3 // 5 = ", 3//5)

print("This is a \"")
mls = ''' this is a multiline

string and this will keep 
going'''
print(mls)
File main2.py as described in the video
print("%s to the right"%('this is a string'))
print('this is print statement 1', end="")
print('this is print statement 2')
print("this "*50)
#File main3.py as described in the video
# Lists

colleges = ['IIT', 'NIT', 'College of engineering']

print(colleges[2])

colleges[2] = "COE"

print(colleges[2])
print(colleges)
print(colleges[1:3])
list2 = ['table', 'chair', 'fan', 'clothes', 'bottle']

# list2.append('microphone')
list2.insert(3, 'microphone')
print(list2)
list2.remove('microphone')
print(list2 + ['pillow', 'tubelight', 'bed'])
print(list2)
print(len(list2))
print(max(list2))
print(min(list2))

#File main4.py as described in the video
# Tuples

tup1 = (1, 2, 3)
list1 = list(tup1)
print(list1)
print(tup1[0])
#File main5.py as described in the video
# Dictionaries

names = {'Harry': 22,
         'Shubham': 41,
         'Jyoti': 19,
         'Ramdev': 82}

print(names['Ramdev'])
names['Ramdev'] = 55
print(names['Ramdev'])

print(names.keys())
print(names.values())

#File main6.py as described in the video
# If else statements

print("Enter Your Marks")
number = int(input())
print(number)

if (number>90 or number<100):
    grade = 'A'
elif (number>80 and number<100):
    grade = 'B'
else:
    grade = 'Dont Know'

print("The grade is", grade)

#File main7.py as described in the video
# loops

print("How many times do you want to execute")
no = int(input())
for i in range(0,no):
    print(i)
list1 =[[1,2,3], [4,5,6], [7,8,9]]
for item in list1:
    for i in item:
        print(i)

#File main8.py as described in the video
# while loops

print("Enter a number")
number = int(input())

while(number>4):
    print("Number is greater than 4")
    number = int(input())
    if (number ==9):
        break
    if number ==8:
        continue
    print("loop ended")
#File main9.py as described in the video
# Functions

def average(num1, num2):
    return (num1+num2)/2

print(average(2, 3))
#File main10.py as described in the video
# Strings

string1 = "this is me"
print(string1[0:2])
print(string1[-2:])
print(string1[:-2])
print(string1.capitalize())
print(string1.find("thisdsfdfd"))
print(string1.replace("is", "are"))
File main11.py as described in the video
# File IO

file1 = open("harry.txt", "wb")
print(file1.mode)
print(file1.name)
file1.write(bytes("Write this to my file", "UTF-8"))
file1.close()
File main12.py as described in the video
# file io - reading the content of a file

file1 = open('harry.txt', 'r+')
text_to_read = file1.read()
print(text_to_read)
File main13.py as described in the video
# Object oriented programming

class Employee:
    __name = None
    __id = 0
    __salary = 0


    def __init__(self, name, id, salary):
        self.__name = name
        self.__id = id
        self.__salary = salary


    def set_name(self, name):
        self.__name = name

    def get_name(self):
        return self.__name

    def set_id(self, id):
        self.__id = id

    def get_id(self):
        return self.__id

    def set_salary(self, salary):
        self.__id = salary

    def get_salary(self):
        return self.__salary

harry = Employee('harry', 420, 70000000)

print(harry.get_salary())
