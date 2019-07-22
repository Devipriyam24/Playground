#include<stdio.h>
int main()
{
  float rad,ang,ac;
  scanf("%f%f",&rad,&ang);
  ac=(float)(2*3.14*rad*(ang/360));
  printf("%.2f",ac);
  return 0;
}