#include <stdio.h>
int main() {
	int n,r,m,sum=0;
  scanf("%d",&n);
  m=n;
  while(m>0)
  {
    r=m%10;
    sum=sum+(r*r*r);
    m=m/10;
  }
  if(sum==n)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
	return 0;
}