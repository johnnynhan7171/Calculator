#include <iostream>
using namespace std;

int main(){
  //variable declaration
  int x, y;
  char op;

  //getting value from user
  cout <<"Enter first number:";
  cin >>x;
  cout <<"Enter second number:";
  cin >>y;
  cout <<"Enter operator: (+, -, *, /)";
  cin >>op;

  //performing specified operation
  switch(op){
    case '+': {
      cout <<"\n The sum:"<<x + y;
      break;
    }
    case '-': {
      cout <<"\n The sum:"<<x - y;
      break;
    }
    case '*': {
      cout <<"\n The sum:"<<x * y;
      break;
    }
    case '/': {
      cout <<"\n The sum:"<<x / y;
      break;
    }
    default:
      cout <<"\n Invalid operator!";
  }
  return 0;
}