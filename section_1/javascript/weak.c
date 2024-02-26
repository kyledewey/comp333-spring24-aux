#include "stdio.h"

void printElem(int arr[]) {
  int x = arr[999999];
  printf("%i\n", x);
}

int main() {
  int arr[3] = {4, 1, 2};
  printElem(arr);
  printf("hello\n");
  return 0;
}
