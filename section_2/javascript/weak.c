#include "stdio.h"

void printElem(int arr[]) {
  int elem = arr[999999];
  printf("%i\n", elem);
}

int main() {
  int arr[3] = {4, 2, 7};
  printElem(arr);
  printf("hello\n");
  
  return 0;
}
