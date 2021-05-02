#include <stdio.h>
int main()
{
    int x;
    scanf("%d",&x);
    int spaces = 2 * x - 2;
    for(int i = 1; i <= x;i++)
    {
      for(int j = 0;j < i;j++)
      {
        printf("*");
      }
      for(int j=0;j<spaces;j++)
      {
        printf(" ");
      }
      for(int j =0;j<i;j++)
      {
        printf("*");
      }
      printf("\n");
      spaces-=2;
    }
    spaces = 0;
    for(int i = x; i > 0;i--)
    {
      for(int j = 0;j < i;j++)
      {
        printf("*");
      }
      for(int j=0;j<spaces;j++)
      {
        printf(" ");
      }
      for(int j =0;j<i;j++)
      {
        printf("*");
      }
      printf("\n");
      spaces+=2;
    }
    
    
}
