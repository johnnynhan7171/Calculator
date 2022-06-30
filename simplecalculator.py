#getting values from user
x = int(input("Enter first number:"))
y = int(input("Enter second number:"))
op = input("Enter operation:(+, -, *, /)")

#performing the specified operation
if op == '+':
  print("\n The sum:", x + y)
elif op == '-':
  print("\n The difference:", x - y)
elif op == '*':
  print("\n The product:", x * y)
elif op == '/':
  print("\n The quotient:", x / y)
else:
  print("\n Invalid operation!")