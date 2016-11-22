#include <stdio.h>

void swap(int *first, int *second)
{
  int temp = *first;
  *first = *second;
  *second = temp;
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
