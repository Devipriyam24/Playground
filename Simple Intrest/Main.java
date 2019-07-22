#include <stdio.h>
 
void main()
{
    float principal_amt, rate, simple_interest,time;
   
    scanf("%f %f %f", &principal_amt, &rate, &time);
    simple_interest =(principal_amt * rate * time) / 100.0;
    printf("%lf", simple_interest);
}