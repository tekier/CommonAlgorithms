#include <stdio.h>

/*
first XOR second = first XOR second
--
second = (first XOR second) XOR second
therefore second =  first XOR (second XOR second)
therefore second = first XOR 0000.. = first
--
first = (first XOR second) XOR (first)
...same logic as before
first = second
********************************

anything XOR itself is 00000...
anything XOR 00000... is itself
*/

void swap(int *first, int *second)
{
  *first = *first^*second;
  *second = *first^*second;
  *first = *first^*second;

}

int main()
{
  int first, second;

  printf("\nEnter the first number: ");
  scanf("%d", &first);
  printf("(first) stored at address %p\n\n", &first);
  printf("Enter the second number: ");
  scanf("%d", &second);
  printf("(second) stored at address %p", &second);

  swap(&first, &second);

  printf("\n\nThe first number is %d at: %p\n", first, &first);
  printf("The second number is %d at: %p\n\n", second, &second);

}
