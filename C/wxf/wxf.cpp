#include<stdio.h>


void main()
{

	int i,n,b,c[6],j,m;
	
	int a[6]={1,1,1,1,1,1};
	for(n=0;n<6;n++)
	{
	c[n]=a[n];
	}
	for(n=0;n<6;n++)
		printf("%d",a[n]);
	printf("\n");
	for(m=2;m;m++)
	{
		j=0;
		printf("%d\n",a[5]);
		b=a[5]^a[4];
		for(n=5;n>0;n--)
			a[n]=a[n-1];
		a[0]=b;
		for(n=0;n<6;n++){	
			if(a[n]==c[n])
			{	
				j++;
			}
		}
		printf("j:%d\n",j);
			
		for(n=0;n<6;n++){	
			printf("%d",a[n]);
		}
		printf("\n");
		for(n=0;n<6;n++){
			printf("%d",c[n]);
		}
			printf("\n");
		printf("m:%d\n",m);
		if(j==6)
			break;
	}
	
}
		
