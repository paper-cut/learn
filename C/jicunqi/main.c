#include<stdio.h>

int list[100];
int locat;	
int level;
int* newlist;
int* getList(){
	int i;

	printf("�붨��Ĵ����ȼ�:");
	scanf("%d",&level);
	printf("�붨������Ĵ�����λ��:");
	scanf("%d",&locat);
	if(locat>level)
		printf("����Ĵ���λ�ò��ܳ����Ĵ����ȼ�");
	for(i=0;i<level;i++){
		list[i]=1;
	}
	return list;
	
}

int* getNewList(int *oldlist){

	int i;
	for(i=level-1;i>0;i--){
		oldlist[i]=oldlist[i-1];
	}
	oldlist[0]=oldlist[level-1]^oldlist[level-2];
	newlist=oldlist;
	return newlist;
}

main(){
	int *a,*b;
	int c[100];
	int i,an=0;
	a=getList();
	for(i=0;i<level;i++){
		c[i]=a[i];
	}
	printf("%d",a[locat]);
	b=getNewList(a);
	for(i=0;i<level;i++){
		if(c[i]==b[i])
			an++;	
	}
	printf("%d",an);

	while(an!=level){
		an=0;
		b=getNewList(b);
		for(i=0;i<level;i++){
			if(c[i]==b[i])
				an++;
		}
		printf("%d",b[locat]);
	}


}
