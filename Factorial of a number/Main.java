#include <stdio.h>
int rec(int x)
{
  int f;
  if(x==1)
    return 1;
  else
    f=x*rec(x-1);
  return f;
}
void main() {
  
	int a;
  scanf("%d",&a);
  printf("%d",rec(a));
  
	
}