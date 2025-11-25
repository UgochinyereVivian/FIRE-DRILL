sum_sum = 0
total = 0
number = 4
total_sum = 0
square = 0

while(number <= 2000):
    total += number
    number*=4        

numberTwo = 8
while(numberTwo <= 35000):
    sum_sum += numberTwo
    numberTwo*=8
          
        
total_sum = total + sum_sum
square = total_sum * total_sum

print(square)
